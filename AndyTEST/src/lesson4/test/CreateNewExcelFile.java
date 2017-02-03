package lesson4.test;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateNewExcelFile
{
	
	    public static void main(String[]args) {
	        try {
	            String filename = "C:/Users/ANDY/Desktop/NewExcelFile.xlsx" ;
	            XSSFWorkbook workbook = new XSSFWorkbook();
	            XSSFSheet sheet = workbook.createSheet("FirstSheet");  

	            XSSFRow rowhead = sheet.createRow((short)0);
	            rowhead.createCell(0).setCellValue("No.");
	            rowhead.createCell(1).setCellValue("Name");
	            rowhead.createCell(2).setCellValue("Address");
	            rowhead.createCell(3).setCellValue("Email");

	            XSSFRow row = sheet.createRow((short)1);
	            row.createCell(0).setCellValue("1");
	            row.createCell(1).setCellValue("Sankumarsingh");
	            row.createCell(2).setCellValue("India");
	            row.createCell(3).setCellValue("sankumarsingh@gmail.com");

	            FileOutputStream fileOut = new FileOutputStream(filename);
	            workbook.write(fileOut);
	            fileOut.close();
	            System.out.println("Your excel file has been generated!");

	        } catch ( Exception ex ) {
	            System.out.println(ex);
	        }
	    }
	
}
