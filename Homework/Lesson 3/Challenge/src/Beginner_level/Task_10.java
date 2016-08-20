package Beginner_level;
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
			
		if(a > 0 && a <= 9)	//Проверяем, чтобы вводимое число было в заданном диапазоне.
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
