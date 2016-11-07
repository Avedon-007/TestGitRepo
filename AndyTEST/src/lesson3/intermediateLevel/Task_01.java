package Intermediate_level;
import java.util.Scanner;

public class Task_01 
{
	private static Scanner sc1;
	
	public static void main(String[] args)
	{
		long num = 0L;
		int[] array;
		long sum = 0L;		
		
		System.out.print("Enter your number: ");
		
		sc1 = new Scanner(System.in);
		if(sc1.hasNextLong())
		{
			num = sc1.nextLong();
			if(num < 0)
			{
				System.out.println("ERROR! The number < 0! Please, enter positive number.");
				System.exit(0);
			}			
		}
		else
		{
			System.out.println("!!!Error!!! Вы ввели не целое число или символ!");
			System.exit(0);
		}
		
		array = Long.toString(num).chars().map(c -> c-='0').toArray();
					
		for(int j = 0; j < array.length; j++)
		{
			sum = sum + array[j];
		}
		System.out.print("The sum of amount of numbers is: " + sum);
	}
}
