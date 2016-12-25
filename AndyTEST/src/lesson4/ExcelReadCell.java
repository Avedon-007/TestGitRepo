package lesson4;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadCell 
{
	
	public static void main(String[] args) throws Exception
	{
		File myFile = new File("C:\\Users\\MAMA\\Desktop\\SimpleScenariosChecklist_02.xlsx");
		FileInputStream fis = new FileInputStream(myFile);
		
		// 1. Finds the workbook instance for XLSX file
		XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);   // if you need to read old Excel format, change to HSSFWorkbook
		
		// 2. 
		String result = myWorkBook.getSheetAt(0).getRow(2).getCell(2).getStringCellValue();
		System.out.println(result);
		
		fis.close();
		
		
		// 3. 
		
		
		// 4. Traversing over each row of XLSX file
		
	}
}
