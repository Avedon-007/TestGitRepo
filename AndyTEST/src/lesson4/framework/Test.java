package lesson4.framework;

import java.io.IOException;
import java.sql.SQLException;



public class Test
{
//	protected void readData()
//	{
//		
//	}
	
	protected void executeTestCases(String pathToExcelFile, String databaseDriver, String databaseURL, String security) throws ClassNotFoundException, IOException, SQLException
	{
		ReadExcelAndCompareResults instance = new ReadExcelAndCompareResults();
		instance.writeDataFromExcelToArrayList(pathToExcelFile, databaseDriver, databaseURL, security);		
		instance.addSQLresultToArrayList(pathToExcelFile);	
		
		
	}
	
//	protected void generateReports()
//	{
//		
//	}
	
}
