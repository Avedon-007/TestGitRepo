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
	
	public Test(String pathToTestCaseFile, String pathToReportFolder, String databaseDriver, String databaseURL, String security) 
	{
		this.pathToTestCaseFile = pathToTestCaseFile;
		this.pathToReportFolder = pathToReportFolder;
		this.databaseDriver = databaseDriver;
		this.databaseURL = databaseURL;
		this.security = security;
	}

	public void executeTestCases() throws ClassNotFoundException, IOException, SQLException, InterruptedException
	{
		CreateEmptyTestReportFile myInstance = new CreateEmptyTestReportFile(pathToTestCaseFile, pathToReportFolder);
		myInstance.createTestReportFile();
					
		System.out.println("Starting to copy data from Test Case to Test Result file...");
		CopyTestCaseFileToTestReportFile myInstance2 = new CopyTestCaseFileToTestReportFile(pathToTestCaseFile);		
		myInstance2.copyAllDataFromTestCaseToTestReportFile();
		System.out.println("Data copied from Test Case to Test Result file...successefully!");		
		
		ReadExcelAndCompareResults myInstance3 = new ReadExcelAndCompareResults(databaseDriver, databaseURL, security);		
		myInstance3.writeDataFromExcelToArrayList();		
		myInstance3.addSQLresultToArrayList();			
	}
	
}
