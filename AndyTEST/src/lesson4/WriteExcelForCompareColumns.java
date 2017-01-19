package lesson4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelForCompareColumns 
{

	public void writeExcelCell(String resultOfcompare) throws IOException, ClassNotFoundException, SQLException
//	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException
	{
		File myFile = new File("C:\\Users\\user\\Desktop\\test.xlsx");
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook myWorkBook = new XSSFWorkbook(fis); 
		XSSFSheet mySheet = myWorkBook.getSheetAt(0);
		
		// Use the Cycle FOR for iterate through the Rows
		for(Row row: myWorkBook.getSheetAt(0))
		{
//		XSSFRow row = mySheet.getRow();
		XSSFCell cell = (XSSFCell) row.getCell(5);
		if(cell == null)
		{
			cell = (XSSFCell) row.createCell(5);
		}
		
		ReadExcelNoPoi myObject = new ReadExcelNoPoi();//		
		cell.setCellValue(resultOfcompare);
		}	
//		cell.setCellValue("SUPER");		//DEBUG
		fis.close();

		//		System.out.println("!!!!!!"); //DEBUG
		
		// open an OutputStream to save written data into XLSX file 
		 FileOutputStream os = new FileOutputStream(myFile);
         myWorkBook.write(os);
         System.out.println("Writing on XLSX file Finished ...");
         
      // Close workbook, OutputStream and Excel file to prevent leak
         myWorkBook.close();
         os.close();
         
        
         
	}// end of Main method

}// end of Class
