// link to web  http://www.java67.com/2014/09/how-to-read-write-xlsx-file-in-java-apache-poi-example.html



package lesson4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteNewExcel 
{

	public static void main(String[] args) throws Exception
	{
		File myFile = new File("C:\\Users\\user\\Desktop\\Test.xlsx");
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook myWorkBook = new XSSFWorkbook(fis); 
		XSSFSheet mySheet = myWorkBook.getSheetAt(0);
		
		Map<String, Object[]> data = new HashMap<String, Object[]>();
		 data.put("3", new Object[] {3d, "Sonya", "75K", "SALES", "Rupert"});
		 data.put("4", new Object[] {4d, "Kris", "85K", "SALES", "Rupert"});
		 data.put("5", new Object[] {5d, "Dave", "90K", "SALES", "Rupert"});

		// Set to Iterate and add rows into XLS file
		 Set<String> newRows = data.keySet();		 
		 
		 // Set to Iterate and add rows into XLS file
		 int rownum = mySheet.getLastRowNum();
		 
		 for (String key : newRows)
		 {
			// Creating a new Row in existing XLSX sheet
			 Row row = mySheet.createRow(rownum++);
             Object [] objArr = data.get(key);
             int cellnum = 0;
             for (Object obj : objArr)
             {
                 Cell cell = row.createCell(cellnum++);
                 if (obj instanceof String)
                 {
                	 cell.setCellValue((String) obj);
                 }
                 else if (obj instanceof Boolean)
                 {
                	 cell.setCellValue((Boolean) obj);
                 }
                 else if (obj instanceof Date)
                 {
                	 cell.setCellValue((Date) obj);
                 }
                 else if (obj instanceof Double)
                 {
                	 cell.setCellValue((Double) obj);
                 }
             }
		 }
		 
		// open an OutputStream to save written data into XLSX file 
		 FileOutputStream os = new FileOutputStream(myFile);
         myWorkBook.write(os);
         System.out.println("Writing on XLSX file Finished ...");
         
      // Close workbook, OutputStream and Excel file to prevent leak
         os.close();
         myWorkBook.close();
         fis.close();

	}

}
