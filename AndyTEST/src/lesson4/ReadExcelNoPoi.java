package lesson4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcelNoPoi
{
	private static String fileSource = "C:\\Users\\ANDY\\Desktop\\UserStoriesChecklist_02.xlsx";
	private static String[] myArrayForArrayList;
	private static ArrayList<String[]> arrayListOfTestCases = new ArrayList<String[]>();
	private static String[] myArrayForArrayListAfterSQL;
	private static ArrayList<String[]> arrayListOfTestCasesWithSQLResults = new ArrayList<String[]>();
	

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException // DEBUG public String readCellsFromExcel() throws IOException, ClassNotFoundException, SQLException
	{
		System.out.println("GETTING STARTED...");
		ReadExcelNoPoi instance = new ReadExcelNoPoi();
		instance.writeDataFromExcelToArrayList();		
		instance.addSQLresultToArrayList();	
		System.out.println("FINISH!!!");
	} // end of MAIN method

	protected void writeDataFromExcelToArrayList() throws IOException, ClassNotFoundException, SQLException
	{
		File myFile = new File(fileSource);
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook excelBook = new XSSFWorkbook(fis);	
		for (int sh = 0; sh < excelBook.getNumberOfSheets(); sh++)
		{
			excelBook.getSheetAt(sh);
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
			ReadExcelNoPoi instance = new ReadExcelNoPoi();
			instance.gettingExectColumnFromArrayList(sh);
			arrayListOfTestCases.clear(); // I M P O R T A N T !!! clear Arraylist for use it for next excel sheet ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !!
		}
		excelBook.close();
		fis.close();
	} // end of writeDataFromExcelToArrayList()

	private void gettingExectColumnFromArrayList(int sh) throws ClassNotFoundException, SQLException, IOException
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
					ExecuteQuery myObject = new ExecuteQuery();
					String bufferSQLResult = myObject.executeSQLQuery(resultOfReadCell); // ���������� �������� ���������� ��������� ���������� SQL �������
					WriteSQLQueryResult myObject2 = new WriteSQLQueryResult();
					myObject2.writeExcelCellsWithSQLQueryResult(bufferSQLResult, sh, counter); // ������� SQL ������, ����� �������� � ����� ������(����� ������, �����
					counter++;																			// ���������� ������ � ���������� �������)
				}
			}
		}
	} // end of gettingExectColumnFromArrayList()

	private void addSQLresultToArrayList() throws IOException, ClassNotFoundException, SQLException // Create new ArrayList and add Excel table with SQL query results to it
	{
		File myFile = new File(fileSource);
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook excelBook = new XSSFWorkbook(fis);
		for (int sh2 = 0; sh2 < excelBook.getNumberOfSheets(); sh2++)  // sh - number of excel sheet
		{
			excelBook.getSheetAt(sh2);
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
			ReadExcelNoPoi instance = new ReadExcelNoPoi();
			instance.compareColumns(sh2);
			arrayListOfTestCasesWithSQLResults.clear();// I M P O R T A N T !!! clear Arraylist for use it for next excel sheet ! ! ! ! ! ! ! ! ! ! ! !!! ! ! ! ! !!
		}
		excelBook.close();
		fis.close();
	}	// end of addSQLresultToArrayList()

	private void compareColumns(int sh2) throws ClassNotFoundException, IOException, SQLException
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

