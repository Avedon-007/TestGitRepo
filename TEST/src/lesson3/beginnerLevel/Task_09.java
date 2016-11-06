package lesson3.beginnerLevel;

import java.util.Scanner;

public class Task_09 
{
	private static Scanner scan1;
	private static Scanner scan2;
	private static int a;
	private static int b;	
	private static double result;
	
	public Task_09()
	{
		a = 0;
		b = 0;	
		result = 0.0;
	}
	
	public void Scan()
	{
		System.out.print("Enter the number a: ");
		Scanner scan1 = new Scanner(System.in);		
		
		if(scan1.hasNextInt())
			a = scan1.nextInt();		
		else
		{	
			System.out.println("ERROR! The letters, symbols are prohibited! Please choose integer number!");
			System.exit(0);
		}
		
		System.out.print("Enter the number b: ");
		Scanner scan2 = new Scanner(System.in);
		
		if(scan2.hasNextInt())					
			b = scan2.nextInt();
		else
		{	
			System.out.println("ERROR! The letters, symbols are prohibited! Please choose integer number!");
			System.exit(0);
		}		
	}	
	
	public void Devision()
	{
		Task_09 task = new Task_09();
		task.Scan();
		result = (float)a / b;				
	}
	
	public static void main(String[] args) 
	{
		Task_09 task = new Task_09();
		task.Devision();
		System.out.println("a/b= " + result);				
	}
}
