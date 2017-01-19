package lesson4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelNoPoi 
{
	private static String fileSource = "C:\\Users\\user\\Desktop\\test.xlsx";
	private static String[] myArrayForArrayList;
	private static ArrayList<String[]> arrayListOfTestCases = new ArrayList<String[]>();
	
	
//	public static void main(String[] args) throws IOException	// DEBUG
	public String readCellsFromExcel() throws IOException
	{
		File myFile = new File(fileSource);
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook excelBook = new XSSFWorkbook(fis);
		XSSFSheet excelSheet = excelBook.getSheetAt(0);
		
		String resultOfReadCell = "";
		for(Row row: excelBook.getSheetAt(0))
		{			
			myArrayForArrayList = new String[6];
			for(int j = 0; j <= 5; j++)
			{
				Cell cell = row.getCell(j);
				if(cell!= null)
				{					
					//System.out.println(cell + "\t\t\t\t\t");	// DEBUG									
					myArrayForArrayList[j] = cell.getStringCellValue();
					//System.out.println(myArrayForArrayList[j] + "\t");	//DEBUG						
				}				
			}
			arrayListOfTestCases.add(myArrayForArrayList);			
		}				
		fis.close();			
		
		int counter = 0;	// Make COUNTER for pass through the name of column and get only data
		for(String[] buferArry: arrayListOfTestCases)
		{					
			if(counter==0)
				counter++;
			else
				{
					if(buferArry[2]!=null)
					{	
						//System.out.println(buferArry[2].toString());	// DEBUG
						resultOfReadCell = buferArry[2].toString();
						counter++;
					}
				}				
		}	
//		ReadExcelNoPoi instance = new ReadExcelNoPoi();	// DEBUG
//		instance.compareColumns();						// DEBUG
//		System.out.println(instance.compareColumns());	// DEBUG
		
		return resultOfReadCell;	
	}	//end of MAIN method
	
	public String compareColumns()
	{
		String resultOfcompare = "";
		int counter2 = 0;
		for(String[] buferArry: arrayListOfTestCases)
		{
			if(counter2 == 0)
				counter2++;
			else
			{
				if(buferArry[3]!=null && buferArry[4]!=null)
				{				
					if(buferArry[3] == buferArry[4])
					{
//						myArrayForArrayList = new String[6];
//						myArrayForArrayList[5] = "PASS";
//						arrayListOfTestCases.add(myArrayForArrayList);
//						System.out.println("PASS");	// DEBUG
						resultOfcompare = "Pass";					
					}
					else
					{
//						System.out.println("FAIL");	// DEBUG
						resultOfcompare = "Fail";
					}
				}
			}
		}
		return resultOfcompare;
		
	}	// end of COMPARE COLUMNS method
		
	
}	// end of CLASS


//int counter2 = 0;
//for(String[] buferArry: arrayListOfTestCases)
//{
//	if(counter==0)
//		counter++;
//	else
//	{
//		if(buferArry[3]==buferArry[4])
//		{
//			System.out.println("PASS");
//		}
//		else
//		{
//			System.out.println("FAIL");
//		}
//	}
//}












/*
public void readCellsFromExcel() throws IOException
{
	File myFile = new File(fileSource);
	FileInputStream fis = new FileInputStream(myFile);
	XSSFWorkbook excelBook = new XSSFWorkbook(fis);
	XSSFSheet excelSheet = excelBook.getSheetAt(0);
	
	for(int i = 0; i <= 10; i++)
	{
		Row row = excelSheet.getRow(i);
		for(int j = 0; j <= 5; j++)
		{
			Cell cell = row.getCell(j);
			if(cell!= null)
			{
			System.out.print(cell + "\t");	// DEBUG
			}
		}	
		System.out.println();	// DEBUG
	}
	
	
}
*/