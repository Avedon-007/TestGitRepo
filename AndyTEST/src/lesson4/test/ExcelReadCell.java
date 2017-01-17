package lesson4.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadCell 
{
	//public String readFromExcel() throws IOException
	public static void main(String[] args) throws Exception
	{
		File myFile = new File("C:\\Users\\MAMA\\Desktop\\SimpleScenariosChecklist_02.xlsx");
		FileInputStream fis = new FileInputStream(myFile);
		
		// 1. Finds the workbook instance for XLSX file
		XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);   // if you need to read old Excel format, change to HSSFWorkbook
		
		// 2. Read Cell
		String result = myWorkBook.getSheetAt(0).getRow(2).getCell(2).getStringCellValue();
		System.out.println(result);
		
		fis.close();
		
		//return result;
	}
}
