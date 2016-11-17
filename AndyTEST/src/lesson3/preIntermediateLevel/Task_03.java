/*
 Given 2 integers, a and b. Write a method which returns true if one if them is 21 or if their sum

is 21.
 */


package lesson3.preIntermediateLevel;

import java.util.Scanner;

public class Task_03 
{
	private static Scanner scan1;
	private static Scanner scan2;
	private static  int a, b;
	private static  boolean isTrue;
	
	
	public Task_03()
	{
		a = 0;
		b = 0;
		isTrue = false;
	}
	
	public void Scan()
	{
		System.out.print("¬ведите целое число а: ");
		Scanner scan1 = new Scanner(System.in);
		
		if(scan1.hasNextInt())
		{
			a = scan1.nextInt();
		}
		else
		{	
			System.out.println("ERROR! The letters, symbols and float numbers are prohibited! \nPlease choose integer number!");
			System.exit(0);
		}
		
		System.out.print("¬ведите целое число b: ");
		Scanner scan2 = new Scanner(System.in);
		
		if(scan2.hasNextInt())
		{
			b = scan2.nextInt();
		}
		else
		{	
			System.out.println("ERROR! The letters, symbols and float numbers are prohibited! \nPlease choose integer number!");
			System.exit(0);
		}
	}	
	
	public static void main(String[] args)
	{	
		Task_03 task = new Task_03();
		task.Scan();
			 
		 if(a == 21)
		 {
			 isTrue = true;
			 System.out.println("a = " + " " + a + "\n" + isTrue);
			 System.exit(0);
		 }			 
		 else
		 {
	 		isTrue = false;
	 		//System.out.println("a = " + " " + a + " " + isTrue);
	 	 }
		
		 if(b == 21)
		 {
			 isTrue = true;
			 System.out.println("b = " + " " + b + "\n" + isTrue);
			 System.exit(0);
		 }
		 else
		 {
			 isTrue = false;
			// System.out.println("b = " + " " + b + " " + isTrue);
		 }
		
		 if(a + b == 21)
		 {
			isTrue = true;
			System.out.println("a + b = " + " " + (a + b) + "\n" + isTrue);			
		 }
		 else 
			System.out.println(isTrue);
	}	
}


/*
import java.util.Scanner;

public class Task_03 
{
	private static Scanner scan1;
	private static Scanner scan2;
	private static  int a, b;
	private static  boolean isTrue;
	
	
	public Task_03()
	{
		a = 0;
		b = 0;
		isTrue = false;
	}
	
	public void Scan()
	{
		System.out.print("¬ведите целое число а: ");
		Scanner scan1 = new Scanner(System.in);
		
		if(scan1.hasNextInt())
		{
			a = scan1.nextInt();
		}
		else
		{	
			System.out.println("ERROR! The letters, symbols and float numbers are prohibited! \nPlease choose integer number!");
			System.exit(0);
		}
		
		System.out.print("¬ведите целое число b: ");
		Scanner scan2 = new Scanner(System.in);
		
		if(scan2.hasNextInt())
		{
			b = scan2.nextInt();
		}
		else
		{	
			System.out.println("ERROR! The letters, symbols and float numbers are prohibited! \nPlease choose integer number!");
			System.exit(0);
		}
	}	
	
	public static void main(String[] args)
	{	
		Task_03 task = new Task_03();
		task.Scan();
			 
		 if(a == 21)
		 {
			 isTrue = true;
			 System.out.println("a = " + " " + a + "\n" + isTrue);
			 System.exit(0);
		 }			 
		 else
		 {
	 		isTrue = false;
	 		//System.out.println("a = " + " " + a + " " + isTrue);
	 	 }
		
		 if(b == 21)
		 {
			 isTrue = true;
			 System.out.println("b = " + " " + b + "\n" + isTrue);
			 System.exit(0);
		 }
		 else
		 {
			 isTrue = false;
			// System.out.println("b = " + " " + b + " " + isTrue);
		 }
		
		 if(a + b == 21)
		 {
			isTrue = true;
			System.out.println("a + b = " + " " + (a + b) + "\n" + isTrue);			
		 }
		 else 
			System.out.println(isTrue);
	}	
}
*/