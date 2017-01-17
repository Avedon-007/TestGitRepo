package lesson4.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadCells 
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
	
	public static void main(String[] args) throws Exception
	//public String readCellsFromExcel() throws IOException
	{
		File myFile = new File("C:\\Users\\MAMA\\Desktop\\SimpleScenariosChecklist_02.xlsx");
		FileInputStream fis = new FileInputStream(myFile);
		
		// 1. Finds the workbook instance for XLSX file
		XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);   // if you need to read old Excel format, change to HSSFWorkbook
		
		// 2. Read Cell
		String result = "";
		int counter=0;
		
		for(Row row: myWorkBook.getSheetAt(1))	//Read all Cells of Sheet 0
		{
			String outputResult="";
			for(Cell cell: row)	// Read all Cells of all Rows
			//for(Cell cell: myWorkBook.getSheetAt(0).getRow(3)) // Read specific Row
			{
				
				//result = getExcelCell(2);
				outputResult+=getExcelCell(cell) + "\t";		// DEBUG			
			}
			if (counter>1) System.out.println(outputResult);
			counter++;
			System.out.println();
			}

		fis.close();	
		//return result;
	}
}
