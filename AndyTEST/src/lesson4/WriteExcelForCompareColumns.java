package lesson4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelForCompareColumns
{

	protected void writeExcelCell(String resultOfcompare, int sh2, int i) throws IOException, ClassNotFoundException, SQLException
	{
		File myFile = new File("C:\\Users\\ANDY\\Desktop\\test.xlsx");
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
		
		XSSFSheet mySheet = myWorkBook.getSheetAt(sh2);

		XSSFRow row = mySheet.getRow(i);
		if (row != null)
		{
			XSSFCell cell = row.getCell(5);
			if (cell == null)
			{
				cell = row.createCell(5);
			}
			cell.setCellValue(resultOfcompare);			
		}
		
		fis.close();

		// open an OutputStream to save written data into XLSX file
		FileOutputStream os = new FileOutputStream(myFile);
		myWorkBook.write(os);
		System.out.println("Writing on XLSX file Finished ...");

		// Close workbook, OutputStream and Excel file to prevent leak
		myWorkBook.close();
		os.close();

	}// end of Main method

}// end of Class
