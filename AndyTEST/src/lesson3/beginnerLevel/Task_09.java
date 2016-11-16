/*
 Create method which takes two integers (a and b), performs their division (a/b) and outputs
  accurate result of division (this means the result should have a decimal part, if any)
 */

package lesson3.beginnerLevel;


public class Task_09 
{	
	public double devisionOfIntegersAandB(int a, int b)
	{
		double result = (float)a / b;
		return result;				
	}
	
	public static void main(String[] args) 
	{
		//Test data
		int a = 9;
		int b = 2;
		//Instantiate new object
		Task_09 task = new Task_09();		
		//Methods application
		System.out.println("a/b= " + task.devisionOfIntegersAandB(a, b));				
	}
}


/*
 
 ===================== B E F O R E =========================
 		
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

*/