package lesson4.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;






import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import lesson4.ExecuteQueryAndGenerateCSV;

public class ReadExcelAndCompareResults
{	
	private static String[] myArrayForArrayList;
	private static ArrayList<String[]> arrayListOfTestCases = new ArrayList<String[]>();
	private static String[] myArrayForArrayListAfterSQL;
	private static ArrayList<String[]> arrayListOfTestCasesWithSQLResults = new ArrayList<String[]>();
	

	protected void writeDataFromExcelToArrayList(String pathToExcelFile, String databaseDriver, String databaseURL, String security) throws IOException, ClassNotFoundException, SQLException
	{
		File myFile = new File(pathToExcelFile);
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook excelBook = new XSSFWorkbook(fis);	
		for (int sh = 0; sh < excelBook.getNumberOfSheets(); sh++)
		{
			XSSFSheet excelSheet = excelBook.getSheetAt(sh);
			for (Row row : excelBook.getSheetAt(sh))
			{
				myArrayForArrayList = new String[6];
				for (int j = 0; j <= 5; j++)
				{
					Cell cell = row.getCell(j);
					if (cell != null)
					{	// System.out.println(cell + "\t\t\t\t\t"); // DEBUG
						myArrayForArrayList[j] = cell.getStringCellValue();
						// System.out.println(myArrayForArrayList[j] + "\t");	// //DEBUG
					}
				}
				arrayListOfTestCases.add(myArrayForArrayList);
			}
			ReadExcelAndCompareResults instance = new ReadExcelAndCompareResults();
			instance.gettingExectColumnFromArrayList(databaseDriver, databaseURL, security, sh);
			arrayListOfTestCases.clear(); // I M P O R T A N T !!! clear Arraylist for use it for next excel sheet ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !!
		}
		fis.close();
	} // end of writeDataFromExcelToArrayList()

	protected void gettingExectColumnFromArrayList(String DATABASE_DRIVER, String DATABASE_URL, String DB_SECURITY, int sh) throws ClassNotFoundException, SQLException, IOException
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
					// System.out.println(buferArry[2].toString()); // DEBUG
					resultOfReadCell = buferArry[2].toString();
					ExecuteQueryAndGenerateCSV myObject = new ExecuteQueryAndGenerateCSV();
					String bufferSQLResult = myObject.executeSQLQuery(resultOfReadCell); // присваиваю буферной переменной результат выполнения SQL запроса
					WriteSQLQueryResult myObject2 = new WriteSQLQueryResult();
					myObject2.writeExcelCellsWithSQLQueryResult(bufferSQLResult, sh, counter); // передаю SQL запрос, номер страници и номер строки(номер строки, чтобы
					counter++;																			// пропустить первую с названиями колонок)
				}
			}
		}
	} // end of gettingExectColumnFromArrayList()

	protected void addSQLresultToArrayList(String pathToExcelFile) throws IOException, ClassNotFoundException, SQLException // Create new ArrayList and add Excel table with SQL query results to it
	{
		File myFile = new File(pathToExcelFile);
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook excelBook = new XSSFWorkbook(fis);
		for (int sh2 = 0; sh2 < excelBook.getNumberOfSheets(); sh2++)  // sh - number of excel sheet
		{
			XSSFSheet excelSheet = excelBook.getSheetAt(sh2);
			for (Row row : excelBook.getSheetAt(sh2))
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
			ReadExcelAndCompareResults instance = new ReadExcelAndCompareResults();
			instance.compareColumns(sh2);
			arrayListOfTestCasesWithSQLResults.clear();// I M P O R T A N T !!! clear Arraylist for use it for next excel sheet ! ! ! ! ! ! ! ! ! ! ! !!! ! ! ! ! !!
		}
		fis.close();
	}	// end of addSQLresultToArrayList()

	protected void compareColumns(int sh2) throws ClassNotFoundException, IOException, SQLException
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
						WriteExcelForCompareColumns myNewObject = new WriteExcelForCompareColumns();
						myNewObject.writeExcelCell(resultOfcompare, sh2, counter2);						
						counter2++;

					} else
					{
						resultOfcompare = "Fail";
						WriteExcelForCompareColumns myNewObject = new WriteExcelForCompareColumns();
						myNewObject.writeExcelCell(resultOfcompare, sh2, counter2);
						counter2++;
					}
				}
			}
		}
	} // end of COMPARE COLUMNS method
} // end of CLASS

