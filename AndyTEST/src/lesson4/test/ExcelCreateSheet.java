package lesson4.test;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCreateSheet 
{

	public static void main(String[] args) throws IOException
	{
		Workbook wb = new XSSFWorkbook();
		Sheet sheet0 = wb.createSheet("Test#1");
		FileOutputStream fos = new FileOutputStream("C:/Users/MAMA/Desktop/123.xlsx");
		wb.write(fos);
		fos.close();
	}

}
