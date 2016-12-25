package lesson4.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class READ 
{
	public static String getExcelCell(Cell cell) // Method which decides data type of Cell
	{
		String result = "";
		switch(cell.getCellType())
		{
		case Cell.CELL_TYPE_STRING:
			result = cell.getRichStringCellValue().getString();
			break;
		case Cell.CELL_TYPE_NUMERIC:
			if(DateUtil.isCellDateFormatted(cell))
				result = cell.getDateCellValue().toString();
			else
				result = Double.toString(cell.getNumericCellValue());
			break;
		case Cell.CELL_TYPE_BOOLEAN:
			result = Boolean.toString(cell.getBooleanCellValue());
			break;
		case Cell.CELL_TYPE_FORMULA:
			result = cell.getCellFormula().toString();
			break;
		default:
			break;	
		}
	return result;
	}
	
	public static void main(String[] args) throws IOException
	
	{
		File myFile = new File("C:\\Users\\MAMA\\Desktop\\SimpleScenariosChecklist_02.xlsx");
		FileInputStream fis = new FileInputStream(myFile);
		
		// 1. Finds the workbook instance for XLSX file
		XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);   // if you need to read old Excel format, change to HSSFWorkbook
		XSSFSheet mySheet = myWorkBook.getSheetAt(1);
		Iterator<Row> rowIterator = mySheet.iterator();
		
		// 2. Read Column		
		for(Row row: myWorkBook.getSheetAt(1))
		{		
			Cell cell = row.getCell(2);
			System.out.print(getExcelCell(cell ) + "\t");
			System.out.println();
		}
		fis.close();	
		
	}
}


/*
  // 2. Read Column
		Row row = mySheet.getRow(2);
		while(rowIterator.hasNext())
		//for(Row row: myWorkBook.getSheetAt(1))
		{		
			
			Cell cell = row.getCell(2); // 2 - is third column in excel table
			System.out.print(getExcelCell(cell ) + "\t");
			System.out.println();
			row = rowIterator.next();
			
		}
		*/

