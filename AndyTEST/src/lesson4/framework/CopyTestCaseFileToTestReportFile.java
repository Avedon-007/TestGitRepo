package lesson4.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CopyTestCaseFileToTestReportFile
{
	private static String[] myArrayForEachObjectOfArrayList;
	private static ArrayList<String[]> arrayListOfTestCases = new ArrayList<String[]>();
	
	public void copyTestCaseFileToArrayList() throws IOException, ClassNotFoundException, SQLException
	{
		System.out.println("Reading Test Case file...");
		File myFile = new File(pathToTestCaseFile);
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook excelBook = new XSSFWorkbook(fis);	
		for (int i = 0; i < excelBook.getNumberOfSheets(); i++)
		{
			int counterOfRows = 0;
			XSSFSheet excelSheet = excelBook.getSheetAt(i);
			for (Row row : excelBook.getSheetAt(i))
			{
				
				myArrayForEachObjectOfArrayList = new String[6];
				for (int j = 0; j <= 5; j++)
				{
					Cell cell = row.getCell(j);
					if (cell != null)						
						myArrayForEachObjectOfArrayList[j] = cell.getStringCellValue();					
				}
				arrayListOfTestCases.add(myArrayForEachObjectOfArrayList);
				
			}
			System.out.println("Sheet was read.");
			createTestReportFile(i, counterOfRows);
			counterOfRows++;
			arrayListOfTestCases.clear(); // I M P O R T A N T !!! clear Arraylist for use it for next excel sheet ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !!
		}
		fis.close();
	} // en
	
}
