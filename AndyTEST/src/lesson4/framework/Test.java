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
		CreateEmptyTestReportFile myInstance = new CreateEmptyTestReportFile(pathToTestCaseFile, pathToReportFolder);
		myInstance.copyTestCaseFileToArrayList();
		
		CopyTestCaseFileToTestReportFile myInstance2 = new CopyTestCaseFileToTestReportFile();
		myInstance2.copyTestCaseFileToArrayList(pathToTestCaseFile);
		
//		
//		ReadExcelAndCompareResults myInstance3 = new ReadExcelAndCompareResults(pathToTestCaseFile, pathToReportFolder, databaseDriver, databaseURL, security);		
//		myInstance3.writeDataFromExcelToArrayList();		
//		myInstance3.addSQLresultToArrayList();			
	}
	
}
