package Beginner_level;

import java.util.Scanner;

public class Task_09 
{
	private static Scanner sc1;
	private static Scanner sc2;
	
	public static void main(String[] args) 
	{
		int a = 0;
		int b = 0;
		boolean isNoError = false;
			
		System.out.print("������� ����� ����� �= ");	
		sc1 = new Scanner(System.in);
	//--------------------------------------------------------------------------------
		if(sc1.hasNextInt())
		{
			a = sc1.nextInt();
			isNoError = true;
		}
		else 
		{
			System.out.println("!!!Error!!! �� ����� ������ ��� �� ����� �����(� ������)!");
			isNoError = false;	
		}	
	//--------------------------------------------------------------------------------------
		System.out.print("������� ����� ����� b= ");
		sc2 = new Scanner(System.in);
	
		if(sc2.hasNextInt())
		{
			b = sc2.nextInt();
			isNoError = true;
		}
		else
		{
			System.out.println("!!!Error!!! �� ����� ������ ��� �� ����� �����(� ������)!");
			isNoError = false;
		}	
	//----------------------------------------------------------------------------------------	
		if(isNoError == true)
		{
			System.out.println("a/b= " + (float)a/b);	
		}
		else
		{
			System.out.println("a/b= " + "ERROR");
		}
	}	
}
