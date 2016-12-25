package lesson4;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCreateCell 
{
	public static void main(String[] args) throws IOException
	{
		Workbook wb = new XSSFWorkbook();
		Sheet sheet0 = wb.createSheet("Test#1"); // Create Sheet in excel document
		Row row1 = sheet0.createRow(1);		// Create new Row in created Sheet
		Cell cell1 = row1.createCell(2);		// Create new Cell in created Row
		cell1.setCellValue("SELECT * FROM Table");	// Filling the Cell with data
		
		Row row2 = sheet0.createRow(2);
		Cell cell2 = row2.createCell(1);
		cell2.setCellValue("Abra cadabra");
		
		
		//Create Sheet #2 with row and cell
		Sheet sheet1 = wb.createSheet("Test#2");
		Row row3 = sheet1.createRow(2);
		Cell cell3 = row3.createCell(1);
		cell3.setCellValue("Test string for check  result");
		
		
		FileOutputStream fos = new FileOutputStream("C:/Users/MAMA/Desktop/123.xlsx");
		wb.write(fos);
		fos.close();
	}
}
