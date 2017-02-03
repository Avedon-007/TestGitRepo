package lesson4.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateEmptyTestReportFile
{
	public static final String DATE_FORMAT_NOW = "dd.MM.yyyy_HH-mm-ss";	
	public String pathToTestReportFile ="";		
	private String pathToTestCaseFile;
	private String pathToReportFolder;
	
	public CreateEmptyTestReportFile(String pathToTestCaseFile, String pathToReportFolder)
	{
		this.pathToTestCaseFile = pathToTestCaseFile;
		this.pathToReportFolder = pathToReportFolder;
	}
		
	public void copyTestCaseFileToArrayList() throws IOException, ClassNotFoundException, SQLException
	{
		System.out.println("Reading Test Case file...");
		File myFile = new File(pathToTestCaseFile);
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook excelBook = new XSSFWorkbook(fis);			
		int quantityOfSheets = excelBook.getNumberOfSheets();
		
		createTestReportFile(quantityOfSheets);				
		
		fis.close();
	} 	
	
	public void createTestReportFile(int quantityOfSheets) throws IOException, ClassNotFoundException, SQLException
	{
		System.out.println("Creating new Test Report file...");
		// -Get from pathToExcelFile only file name
		// - add output folder as prefix and "TestReport" + time stamp
		
		String pathToTestReportFile = pathToReportFolder + pathToTestCaseFile
				.substring(getLastCharacterIndex(pathToTestCaseFile, '\\'), getLastCharacterIndex(pathToTestCaseFile, '.')) + "_TestReport_" + timeStamp() + ".xlsx";
				
		// -создать чистый эксель файл с таким же колличеством листов как и у файла с тест кейсами
		// -копируем содержимое с тест кейсов в пустой файл
		// -теперь есть рабочий файл для репорта
		
		
		 XSSFWorkbook myWorkBook = new XSSFWorkbook();          
		 for(int j = 0; j < quantityOfSheets; j++)
		 {
			System.out.println("Creating new sheet...");
			 XSSFSheet mySheet = myWorkBook.createSheet();
			 System.out.println("New sheet was created.");		
		 }	

		// open an OutputStream to save written data into XLSX file
		FileOutputStream os = new FileOutputStream(pathToTestReportFile);
		myWorkBook.write(os);
		// System.out.println("Writing on XLSX file Finished ...");

		// Close workbook, OutputStream and Excel file to prevent leak
		myWorkBook.close();
		os.close();
		System.out.println("New Test Report file created successefully!");
	} // end of writeExcelCellsWithSQLQueryResult()
	
	

	private int getLastCharacterIndex(String myString, char myCharacter)
	{
		int position = 0;
		for (int i = 0; i < myString.length(); i++)
		{
			if (myString.charAt(i) == myCharacter)
				position = i;
		}
		return position;
	}
	
	public static String timeStamp() 
	{
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
		return sdf.format(cal.getTime());
	}
}


/*
 * public class CreateEmptyTestReportFile
{
	public static final String DATE_FORMAT_NOW = "dd.MM.yyyy_HH-mm-ss";	
	public String pathToTestReportFile ="";	
	
	private static String[] myArrayForEachObjectOfArrayList;
	private static ArrayList<String[]> arrayListOfTestCases = new ArrayList<String[]>();
	
	private String pathToTestCaseFile;
	private String pathToReportFolder;
	
	public CreateEmptyTestReportFile(String pathToTestCaseFile, String pathToReportFolder)
	{
		this.pathToTestCaseFile = pathToTestCaseFile;
		this.pathToReportFolder = pathToReportFolder;
	}
	
	
	
	
	
	public void copyTestCaseFileToArrayList() throws IOException, ClassNotFoundException, SQLException
	{
		System.out.println("Reading Test Case file...");
		File myFile = new File(pathToTestCaseFile);
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook excelBook = new XSSFWorkbook(fis);	
		
		int quantityOfSheets = excelBook.getNumberOfSheets();
		for (int i = 0; i < excelBook.getNumberOfSheets(); i++)
		{
			int counterOfRows = 0;
			XSSFSheet excelSheet = excelBook.getSheetAt(i);
			for (Row row : excelBook.getSheetAt(i))
			{
				
				myArrayForEachObjectOfArrayList = new String[6];
				for (int j = 0; j <= 5; j++)
				{
					Cell cell = row.getCell(j);
					if (cell != null)						
						myArrayForEachObjectOfArrayList[j] = cell.getStringCellValue();					
				}
				arrayListOfTestCases.add(myArrayForEachObjectOfArrayList);
				
			}
			System.out.println("Sheet was read.");
			createTestReportFile(i, counterOfRows, quantityOfSheets);
			counterOfRows++;
			arrayListOfTestCases.clear(); // I M P O R T A N T !!! clear Arraylist for use it for next excel sheet ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !!
		}
		fis.close();
	} // en
	
	
	
	
	
	
	public void createTestReportFile(int sheetNumber, int counterOfRows, int quantityOfSheets) throws IOException, ClassNotFoundException, SQLException
	{
		// -Get from pathToExcelFile only file name
		// - add output folder as prefix and "TestReport" + time stamp
		
		String pathToTestReportFile = pathToReportFolder + pathToTestCaseFile
				.substring(getLastCharacterIndex(pathToTestCaseFile, '\\'), getLastCharacterIndex(pathToTestCaseFile, '.')) + "_TestReport_" + timeStamp() + ".xlsx";
				
		// -создать чистый эксель файл с таким же колличеством листов как и у файла с тест кейсами
		// -копируем содержимое с тест кейсов в пустой файл
		// -теперь есть рабочий файл для репорта
		
		
		 XSSFWorkbook myWorkBook = new XSSFWorkbook();
          
       
         
       for(int j = 0; j < quantityOfSheets; j++)
       {
    	   XSSFSheet mySheet = myWorkBook.createSheet();
       
         XSSFRow row = mySheet.createRow(counterOfRows);
	
		for (String[] buferArry : arrayListOfTestCases)
		{
			for(int k = 0; k < buferArry.length; k++)
			{
				if (row != null)
				{
					XSSFCell cell = row.getCell(4);
					if (cell == null)
						cell = row.createCell(4);

					cell.setCellValue(buferArry[k]);
				}
			}
		}	
		}	

		// open an OutputStream to save written data into XLSX file
		FileOutputStream os = new FileOutputStream(pathToTestReportFile);
		myWorkBook.write(os);
		// System.out.println("Writing on XLSX file Finished ...");

		// Close workbook, OutputStream and Excel file to prevent leak
		myWorkBook.close();
		os.close();
		System.out.println("New Test Report file created successefully!");
	} // end of writeExcelCellsWithSQLQueryResult()
	
	

	private int getLastCharacterIndex(String myString, char myCharacter)
	{
		int position = 0;
		for (int i = 0; i < myString.length(); i++)
		{
			if (myString.charAt(i) == myCharacter)
				position = i;
		}
		return position;
	}
	
	public static String timeStamp() 
	{
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
		return sdf.format(cal.getTime());
	}
	

}
*/
