/*
 	Create method which gets a number form 1 to 9 (for example 4) and then prints the follow output:
	For number 4:				For number 3:
	*							*
	**							**
	***							***
	****						**
	***							*
	**
	*
	
 */



/* 
 Try implement only 1 FOR with FLAG attribute
 
 */



package lesson3.beginnerLevel;


public class Task_10 
{
	public void printStarsInOrder(int a)
	{		
		String star = "***********************";
		if(a > 0 && a <= 9)	//���������, ����� �������� ����� ���� � �������� ���������.
		{   								
			for(int i = 1; i < a; i++)											
				System.out.println(star.substring(0, i));
				
			for(int i = a; i > 0; i--)						
				System.out.println(star.substring(0, i));							
		}		
	}	
		
	public static void main(String[] args) 
	{		
		//Test data
		int a = 3;
		//Instantiate new object 
		Task_10 task = new Task_10();
		//Method application
		task.printStarsInOrder(a);			
	}
}


/*
import java.util.Scanner;

public class Task_10 
{
	private static Scanner scan1;
	private static int a;
	private static String star;
	
	public Task_10()
	{
		a = 0;
		star = "***********************";
	}
	
	public void Scan()
	{
		System.out.print("Enter the number (not float) in range of 1 to 9: ");
		Scanner scan1 = new Scanner(System.in);		
		
		if(scan1.hasNextInt())
			a = scan1.nextInt();		
		else
		{	
			System.out.println("ERROR! The letters, symbols and float numbers are prohibited! \nPlease choose integer number!");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) 
	{		
		Task_10 task = new Task_10();
		task.Scan();		
			
		if(a > 0 && a <= 9)	//���������, ����� �������� ����� ���� � �������� ���������.
		{   								
			for(int i = 1; i < a; i++)											
				System.out.println(star.substring(0, i));
				
			for(int i = a; i > 0; i--)						
				System.out.println(star.substring(0, i));							
		}
		else			
			System.out.println("ERROR!!! Your number is not in range of 1 to 9!");	
	}
}
*/