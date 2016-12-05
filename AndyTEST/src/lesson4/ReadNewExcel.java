// link to web  http://www.java67.com/2014/09/how-to-read-write-xlsx-file-in-java-apache-poi-example.html

package lesson4;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadNewExcel {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception
	{
		File myFile = new File("C:\\Users\\user\\Desktop\\Test.xlsx");
		FileInputStream fis = new FileInputStream(myFile);
		
		// 1. Finds the workbook instance for XLSX file
		XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);   // if you need to read old Excel format, change to HSSFWorkbook
		
		// 2. Return first sheet from the XLSX workbook
		XSSFSheet mySheet = myWorkBook.getSheetAt(0);		// to read old Excel change to HSSFSheet
		
		// 3. Get iterator to all the rows in current sheet
		Iterator<Row> rowIterator = mySheet.iterator(); 
		
		// 4. Traversing over each row of XLSX file
		while(rowIterator.hasNext())
		{
			Row row = rowIterator.next();
			
			// For each row, iterate through each columns
			Iterator<Cell> cellIterator = row.cellIterator();
			while(cellIterator.hasNext())
			{
				Cell cell = cellIterator.next();
				
				switch(cell.getCellType())
				{
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue() + "\t");
						break;
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue() + "\t");
						break;
					case Cell.CELL_TYPE_BOOLEAN:
						System.out.print(cell.getBooleanCellValue() + "\t");
						break;
					default:
					
				}
			}
			System.out.println();
		}
	}

}
