package lesson4.framework;

import java.io.IOException;
import java.sql.SQLException;



public class Test
{
	private String pathToExcelFile;
	private String pathToReportFolder;
	private String databaseDriver;
	private String databaseURL;
	private String security;
	
	public Test(String pathToExcelFile, String pathToReportFolder, String databaseDriver, String databaseURL, String security) {
		this.pathToExcelFile = pathToExcelFile;
		this.pathToReportFolder = pathToReportFolder;
		this.databaseDriver = databaseDriver;
		this.databaseURL = databaseURL;
		this.security = security;
	}

	public void executeTestCases() throws ClassNotFoundException, IOException, SQLException
	{
		ReadExcelAndCompareResults instance = new ReadExcelAndCompareResults(pathToExcelFile, pathToReportFolder, databaseDriver, databaseURL, security);
		instance.writeDataFromExcelToArrayList();		
		instance.addSQLresultToArrayList();	
		
		
	}
	

	
}
