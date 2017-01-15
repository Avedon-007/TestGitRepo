package lesson4.test;

import java.io.IOException;
import java.util.ArrayList;

public class AddDataToArrayList 
{
	//private static ReadExcelNoPoi readCells;
	private static String[] t2;
	private static ArrayList<String[]> list = new ArrayList<String[]>();

	public static void main(String[] args) throws IOException 
	{		
//		ReadExcelNoPoi readCells = new ReadExcelNoPoi();
//		readCells.readCellsFromExcel();
		
		
		t2 = new String[6];
		t2[0] = "0";
		t2[1] = "0";
		t2[2] = "0";
		t2[3] = "0";
		t2[4] = "0";
		t2[5] = "0";
		list.add(t2);
		
		t2 = new String[6];
		t2[0] = "1";
		t2[1] = "2";
		t2[2] = "3";
		t2[3] = "4";
		t2[4] = "5";
		t2[5] = "6";
		list.add(t2);
		
		for(String[] tt: list)
		{
			for(String s: tt)
			{
				System.out.print(s + " ");
			}
			System.out.println();
		}
		
	}

}
