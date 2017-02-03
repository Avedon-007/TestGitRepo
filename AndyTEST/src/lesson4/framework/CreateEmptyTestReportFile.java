package lesson4.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateEmptyTestReportFile
{
	public static final String DATE_FORMAT_NOW = "dd.MM.yyyy_HH-mm-ss";	
	public String pathToTestReportFile ="";	
	
	public static String timeStamp() 
	{
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
		return sdf.format(cal.getTime());
	}
	
	public void createTeseReportFile(String pathToTestCaseFile, String pathToReportFolder) throws IOException, ClassNotFoundException, SQLException
	{
		// -Get from pathToExcelFile only file name
		// - add output folder as prefix and "TestReport" + time stamp
		
		String pathToTestReportFile = pathToReportFolder + pathToTestCaseFile
				.substring(getLastCharacterIndex(pathToTestCaseFile, '\\'), getLastCharacterIndex(pathToTestCaseFile, '.')) + "_TestReport_" + timeStamp() + ".xlsx";
				
		
				
		File myFile = new File(pathToTestReportFile);
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
		XSSFSheet mySheet = myWorkBook.getSheetAt(0);
		XSSFRow row = mySheet.createRow(0);
		if (row != null)
		{
			XSSFCell cell = row.getCell(4);
			if (cell == null)
				cell = row.createCell(4);

			cell.setCellValue(resultOfSQLQueryExecut);
		}
		fis.close();

		// open an OutputStream to save written data into XLSX file
		FileOutputStream os = new FileOutputStream(myFile);
		myWorkBook.write(os);
		// System.out.println("Writing on XLSX file Finished ...");

		// Close workbook, OutputStream and Excel file to prevent leak
		myWorkBook.close();
		os.close();
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

}
