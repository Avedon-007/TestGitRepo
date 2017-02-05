package lesson4.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import lesson4.test.DataBaseSelect;



public class ReadExcelAndCompareResults
{	
	private String pathToTestCaseFile;
	private String pathToReportFolder; 
	private String databaseDriver;
	private String databaseURL;
	private String security;
	
	
	
	private static String[] myArrayForArrayList;
	private static ArrayList<String[]> arrayListOfTestCases = new ArrayList<String[]>();
	private static String[] myArrayForArrayListAfterSQL;
	private static ArrayList<String[]> arrayListOfTestCasesWithSQLResults = new ArrayList<String[]>();
	
	public ReadExcelAndCompareResults(String databaseDriver, String databaseURL, String security)
	{		
		this.databaseDriver = databaseDriver;
		this.databaseURL = databaseURL;
		this.security = security;		
	}
	
	public void writeDataFromExcelToArrayList() throws IOException, ClassNotFoundException, SQLException
	{
		File myFile = new File(pathToTestReportFile);
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook excelBook = new XSSFWorkbook(fis);	
		for (int i = 0; i < excelBook.getNumberOfSheets(); i++)
		{
			XSSFSheet excelSheet = excelBook.getSheetAt(i);
			for (Row row : excelBook.getSheetAt(i))
			{
				myArrayForArrayList = new String[6];
				for (int j = 0; j <= 5; j++)
				{
					Cell cell = row.getCell(j);
					if (cell != null)						
						myArrayForArrayList[j] = cell.getStringCellValue();					
				}
				arrayListOfTestCases.add(myArrayForArrayList);
			}
			
			gettingExecutColumnFromArrayList(i);
			arrayListOfTestCases.clear(); // I M P O R T A N T !!! clear Arraylist for use it for next excel sheet ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !!
		}
		fis.close();
	} // end of writeDataFromExcelToArrayList()

	private void gettingExecutColumnFromArrayList(int sheetNumber) throws ClassNotFoundException, SQLException, IOException
	{
		String resultOfReadCell = "";
		int counter = 0; // Make COUNTER for pass through the name of column and get only data
		for (String[] buferArry : arrayListOfTestCases)
		{
			if (counter == 0)
				counter++;
			else
			{
				if (buferArry[2] != null)
				{					
					resultOfReadCell = buferArry[2].toString();
					ExecuteQueryAndGenerateCSV myObject = new ExecuteQueryAndGenerateCSV(databaseDriver, databaseURL, security);  //
					String bufferSQLResult = myObject.executeSQLQuery(resultOfReadCell); // присваиваю буферной переменной результат выполнения SQL запроса
					WriteSQLQueryResult myObject2 = new WriteSQLQueryResult();
					myObject2.writeExcelCellsWithSQLQueryResult(pathToTestReportFile, bufferSQLResult, sheetNumber, counter); // передаю SQL запрос, номер страници и номер строки(номер строки, чтобы
					counter++;																			// пропустить первую с названиями колонок)
				}
			}
		}

	} // end of gettingExectColumnFromArrayList()

	protected void addSQLresultToArrayList() throws IOException, ClassNotFoundException, SQLException // Create new ArrayList and add Excel table with SQL query results to it
	{
		CreateEmptyTestReportFile myInstance = new CreateEmptyTestReportFile(); // Create Instance of WriteSQLQueryResult class to use "pathToTestReportFile" variable		
		
		
		File myFile = new File(myInstance.pathToTestReportFile);
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook excelBook = new XSSFWorkbook(fis);
		for (int i = 0; i < excelBook.getNumberOfSheets(); i++) 
		{
			XSSFSheet excelSheet = excelBook.getSheetAt(i);
			for (Row row : excelBook.getSheetAt(i))
			{
				myArrayForArrayListAfterSQL = new String[6];
				for (int j = 0; j <= 5; j++)
				{
					Cell cell = row.getCell(j);
					if (cell != null)
						myArrayForArrayListAfterSQL[j] = cell.getStringCellValue();					
				}
				arrayListOfTestCasesWithSQLResults.add(myArrayForArrayListAfterSQL);
			}
			
			compareColumns(myInstance.pathToTestReportFile, i);
			arrayListOfTestCasesWithSQLResults.clear();// I M P O R T A N T !!! clear Arraylist for use it for next excel sheet ! ! ! ! ! ! ! ! ! ! ! !!! ! ! ! ! !!
		}
		fis.close();
	}	// end of addSQLresultToArrayList()

	private void compareColumns(String pathToTestReportFile, int sheetnumber2) throws ClassNotFoundException, IOException, SQLException
	{
		String resultOfcompare = "";
		int counter2 = 0; // Make COUNTER for pass through the name of column and get only data
		for (String[] myBuferArry : arrayListOfTestCasesWithSQLResults)
		{
			if (counter2 == 0)
				counter2++;
			else
			{
				if (myBuferArry[3] != null && myBuferArry[4] != null)
				{
					if (myBuferArry[3].equals(myBuferArry[4]))
					{
						resultOfcompare = "Pass";
						WriteExcelAfterCompareColumns myNewObject = new WriteExcelAfterCompareColumns();
						myNewObject.writeExcelCell(pathToTestReportFile, resultOfcompare, sheetnumber2, counter2);						
						counter2++;

					} else
					{
						resultOfcompare = "Fail";
						WriteExcelAfterCompareColumns myNewObject = new WriteExcelAfterCompareColumns();
						myNewObject.writeExcelCell(pathToTestReportFile, resultOfcompare, sheetnumber2, counter2);
						counter2++;
					}
				}
			}
		}
	} // end of COMPARE COLUMNS method
} // end of CLASS

