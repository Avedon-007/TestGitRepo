package lesson4;

import java.io.File;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


public class ReadOldExcel 
{
	public static void main(String[] args) throws Exception
	{
		File myFile = new File("C:\\Users\\ANDY\\Desktop\\Test.xls");
		Workbook myWorkbook = Workbook.getWorkbook(myFile);
		Sheet mySheet = myWorkbook.getSheet(0);
		int row = mySheet.getRows();
		int col = mySheet.getColumns();
		for(int i = 0; i < row; i++)
		{	
			for(int j = 0; j < col; j++)
			{
				Cell myCell = mySheet.getCell(j, i);
				System.out.print(myCell.getContents() + "\t");
			}
		System.out.println();
		}
	}		
}
