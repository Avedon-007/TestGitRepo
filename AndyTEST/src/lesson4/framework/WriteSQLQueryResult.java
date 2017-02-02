package lesson4.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.sql.SQLException;
import java.util.Calendar;
import java.text.SimpleDateFormat;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteSQLQueryResult
{
	public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
	
	public static String timeStamp() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
		return sdf.format(cal.getTime());
		}
	
	public void writeExcelCellsWithSQLQueryResult(String pathToExcelFile, String pathToReportFolder,
			String resultOfSQLQueryExecut, int sheetNumber, int i) throws IOException, ClassNotFoundException, SQLException
	{
		// -Get from pathToExcelFile only file name
		// - add output folder as prefix and "TestReport" + time stamp
		
		String passToTestReport = pathToReportFolder + pathToExcelFile
				.substring(getLastCharacterIndex(pathToExcelFile, '\\'), getLastCharacterIndex(pathToExcelFile, '.'))+"Test Report" + timeStamp();
		File myFile = new File(passToTestReport);
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
		XSSFSheet mySheet = myWorkBook.getSheetAt(sheetNumber); //
		XSSFRow row = mySheet.getRow(i);
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

} // end of class
