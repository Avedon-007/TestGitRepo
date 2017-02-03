package lesson4.framework;

import java.io.IOException;
import java.sql.SQLException;



public class Test
{
	private String pathToTestCaseFile;
	private String pathToReportFolder;
	private String databaseDriver;
	private String databaseURL;
	private String security;
	
	public Test(String pathToTestCaseFile, String pathToReportFolder, String databaseDriver, String databaseURL, String security) {
		this.pathToTestCaseFile = pathToTestCaseFile;
		this.pathToReportFolder = pathToReportFolder;
		this.databaseDriver = databaseDriver;
		this.databaseURL = databaseURL;
		this.security = security;
	}

	public void executeTestCases() throws ClassNotFoundException, IOException, SQLException
	{
		CreateEmptyTestReportFile myInstance = new CreateEmptyTestReportFile();
		myInstance.createTeseReportFile(pathToTestCaseFile, pathToReportFolder);
		
		
		ReadExcelAndCompareResults myInstance2 = new ReadExcelAndCompareResults(pathToExcelFile, pathToReportFolder, databaseDriver, databaseURL, security);		
		myInstance2.writeDataFromExcelToArrayList();		
		myInstance2.addSQLresultToArrayList();			
	}
	
}
