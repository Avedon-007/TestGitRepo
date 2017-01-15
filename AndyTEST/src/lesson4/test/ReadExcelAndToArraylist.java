package lesson4.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelAndToArraylist 
{
	public static String fileSource = "C:\\Users\\ANDY\\Desktop\\SimpleScenariosChecklist_02.xlsx";
	
	public static void main(String[] args) throws IOException
	{
		File myFile = new File(fileSource);
		FileInputStream fis = new FileInputStream(myFile);
		HashMap<Integer, ColumnsNamesOfTable> hashMap = new HashMap<Integer, ColumnsNamesOfTable>();
		//HashMap<Double, ColumnsNamesOfTable> hashMap = new HashMap<Double, ColumnsNamesOfTable>();
		XSSFWorkbook excelBook = new XSSFWorkbook(fis);
		XSSFSheet excelSheet = excelBook.getSheetAt(0);
		
		Iterator<Row> rowIterator = excelSheet.iterator();
		while(rowIterator.hasNext())
		{			
			Row row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while(cellIterator.hasNext())
			{
				Cell cell = cellIterator.next();//						
				int i = 0;
		//>>>>>	//double i = 0;
				int j = 0;
				
				switch(cell.getCellType())
				{
				// Read the cell of "Test Case No"
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue() + "\t\t");
					System.out.println("!!!!!!!!!");	//DEBUG	
					i = Integer.parseInt(Double.toString(cell.getNumericCellValue()));
					//i = cell.getNumericCellValue();
					System.out.println("?????????");	//DEBUG	
					ColumnsNamesOfTable myInstance = new ColumnsNamesOfTable();
					myInstance.setTestCaseNo(cell.getNumericCellValue());
					break;		
				
				// Read other string cells
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue() + "\t\t");
					if(j==0)
					{						
						ColumnsNamesOfTable data = hashMap.get(i);
						System.out.println("!!!!!!!!!");	//DEBUG						
						data.setNameOfTestCaseNoColumn(cell.getStringCellValue());
						System.out.println("??????????");	//DEBUG
						hashMap.put(i,data);						
						j++;
					}
					else if(j==1)
					{
						ColumnsNamesOfTable data = hashMap.get(i);						
						data.setTestCaseName(cell.getStringCellValue());
						hashMap.put(i,data);
						j++;
					}
					
					
					else if(j==2)
					{
						ColumnsNamesOfTable data = hashMap.get(i);
						data.setSqlQuery(cell.getStringCellValue());
						hashMap.put(i,data);
						j++;
					}
					else if(j==3)
					{
						ColumnsNamesOfTable data = hashMap.get(i);
						data.setExpectedResult(cell.getStringCellValue());
						hashMap.put(i,data);
						j++;
					}
					else if(j==4)
					{
						ColumnsNamesOfTable data = hashMap.get(i);
						data.setActualResult(cell.getStringCellValue());
						hashMap.put(i,data);
						j++;
					}
					else
					{
						ColumnsNamesOfTable data = hashMap.get(i);
						data.setTestResult(cell.getStringCellValue());
						hashMap.put(i,data);
						j = 0;	// set j=0 for start form first String cell(in table it's "Test Case Name")
					}			
					break;		
						
				default:
					break;	
				}
				
				
			}
			System.out.println();
		}
		List<ColumnsNamesOfTable> dataInArrayList = new ArrayList<ColumnsNamesOfTable>();
		for(ColumnsNamesOfTable data : hashMap.values())
		{
			dataInArrayList.add(data);
		}
		
		fis.close();
	}

}


/*
public class ReadExcelAndToArraylist 
{
	public static String fileSource = "C:\\Users\\MAMA\\Desktop\\SimpleScenariosChecklist_02.xlsx";
	
	public static void main(String[] args) throws IOException
	{
		File myFile = new File(fileSource);
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook excelBook = new XSSFWorkbook(fis);
		XSSFSheet excelSheet = excelBook.getSheetAt(0);
		Iterator<Row> rowIterator = excelSheet.iterator();
//		Row row = excelSheet.getRow();
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		
		while(rowIterator.hasNext())
		{
			Row row = rowIterator.next();
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
		fis.close();
	}

}
*/






/*
public class ReadExcelAndToArraylist 
{
	public static String fileSource = "C:\\Users\\MAMA\\Desktop\\SimpleScenariosChecklist_02.xlsx";
	
	public static void main(String[] args) throws IOException
	{
		File myFile = new File(fileSource);
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook excelBook = new XSSFWorkbook(fis);
		XSSFSheet excelSheet = excelBook.getSheetAt(0);
		Iterator<Row> rowIterator = excelSheet.iterator();
//		Row row = excelSheet.getRow();
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		
		while(rowIterator.hasNext())
		{
			String outputResult="";
			Row row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while(cellIterator.hasNext())
			{
				Cell cell = cellIterator.next();//						
				ReadExcelAndToArraylist myObject = new ReadExcelAndToArraylist();
				myObject.getExcelCell(cell);					
			}
			System.out.println();
		}
		fis.close();
	}

	public static void  getExcelCell(Cell cell) // Method which decides data type of Cell
	{
		String result = "";
		switch(cell.getCellType())
		{
		case Cell.CELL_TYPE_STRING:
			System.out.print(cell.getStringCellValue() + "\t\t");
			break;
		case Cell.CELL_TYPE_NUMERIC:
			System.out.print(cell.getNumericCellValue() + "\t\t");
			break;		
		default:
			break;	
		}
	
	}
}
*/




/*
public class ReadExcelAndToArraylist 
{
	public static String fileSource = "C:\\Users\\MAMA\\Desktop\\SimpleScenariosChecklist_02.xlsx";
	
	public static void main(String[] args) throws IOException
	{
		File myFile = new File(fileSource);
		FileInputStream fis = new FileInputStream(myFile);
		HashMap<Integer, ColumnsNamesOfTable> hashMap = new HashMap<Integer, ColumnsNamesOfTable>();
		XSSFWorkbook excelBook = new XSSFWorkbook(fis);
		XSSFSheet excelSheet = excelBook.getSheetAt(0);
		
		Iterator<Row> rowIterator = excelSheet.iterator();
		while(rowIterator.hasNext())
		{			
			Row row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while(cellIterator.hasNext())
			{
				Cell cell = cellIterator.next();//						
				
				//ReadExcelAndToArraylist myObject = new ReadExcelAndToArraylist();
				//myObject.getExcelCell(cell);	
				getExcelCell(cell, hashMap);
				
			}
			System.out.println();
		}
		List<ColumnsNamesOfTable> dataInArrayList = new ArrayList<ColumnsNamesOfTable>();
		for(ColumnsNamesOfTable d : hashMap.values())
		{
			dataInArrayList.add(d);
		}
		
		fis.close();
	}

	public static void  getExcelCell(Cell cell, HashMap<Integer, ColumnsNamesOfTable> hashMap) // Method which decides data type of Cell
	{		
		int i = 0;
		int j = 0;
		
		switch(cell.getCellType())
		{
		// Read the cell of "Test Case No"
		case Cell.CELL_TYPE_NUMERIC:
			System.out.print(cell.getNumericCellValue() + "\t\t");			
			i = Integer.parseInt(Double.toString(cell.getNumericCellValue()));
			
			ColumnsNamesOfTable myInstance = new ColumnsNamesOfTable();
			myInstance.setTestCaseNo(cell.getNumericCellValue());
			break;		
		
		// Read other string cells
		case Cell.CELL_TYPE_STRING:
			System.out.print(cell.getStringCellValue() + "\t\t");
			if(j==0)
			{
				ColumnsNamesOfTable data = hashMap.get(i);
				data.setTestCaseName(cell.getStringCellValue());
				hashMap.put(i,data);
				j++;
			}
			else if(j==1)
			{
				ColumnsNamesOfTable data = hashMap.get(i);
				data.setSqlQuery(cell.getStringCellValue());
				hashMap.put(i,data);
				j++;
			}
			else if(j==2)
			{
				ColumnsNamesOfTable data = hashMap.get(i);
				data.setExpectedResult(cell.getStringCellValue());
				hashMap.put(i,data);
				j++;
			}
			else if(j==3)
			{
				ColumnsNamesOfTable data = hashMap.get(i);
				data.setActualResult(cell.getStringCellValue());
				hashMap.put(i,data);
				j++;
			}
			else
			{
				ColumnsNamesOfTable data = hashMap.get(i);
				data.setTestResult(cell.getStringCellValue());
				hashMap.put(i,data);
				j = 0;	// set j=0 for start form first String cell(in table it's "Test Case Name")
			}			
			break;		
				
		default:
			break;	
		}
	
	}
}
*/