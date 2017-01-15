package lesson4.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;



import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelNoPoi 
{
	private static String fileSource = "C:\\Users\\ANDY\\Desktop\\SimpleScenariosChecklist_02.xlsx";
	private static String[] myArrayForArrayList;
	private static ArrayList<String[]> arrayListOfTestCases = new ArrayList<String[]>();
	
	
	public static void main(String[] args) throws IOException	// DEBUG
	//public String readCellsFromExcel() throws IOException
	{
		File myFile = new File(fileSource);
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook excelBook = new XSSFWorkbook(fis);
		XSSFSheet excelSheet = excelBook.getSheetAt(0);
		
		//String resultOfReadCell = "";
		for(Row row: excelBook.getSheetAt(0))
		{			
			for(int j = 0; j <= 5; j++)
			{
				Cell cell = row.getCell(j);
				if(cell!= null)
				{					
					//System.out.print(cell + "\t\t\t\t\t");	// DEBUG
					myArrayForArrayList = new String[6];				
					myArrayForArrayList[j] = cell.getStringCellValue();
					System.out.print(myArrayForArrayList[j] + "\t");	//DEBUG					
					arrayListOfTestCases.add(myArrayForArrayList);
				}
			}	
			System.out.println();
		}
		
		//return resultOfReadCell;
		
	}
	
	
	
}

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