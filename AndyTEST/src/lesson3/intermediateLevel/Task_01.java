/*
 Superpower (complicated). Imagine that you have a special skill which allows to calculate amount of
digits in any integer positive number. For example, if number is 12345, amount=15. Write a program
which checks your superpower when user enters necessary number via console (in IDE). Use error
guessing technique for provide additional checks.
 */

package lesson3.intermediateLevel;
import java.util.Scanner;

public class Task_01 
{	
	public static void main(String[] args)
	{			
		Task_01 task = new Task_01();
		task.calculateDigitsInNumber(task.scanner());
	}
	
	public long  scanner()
	{
		System.out.print("Enter your number: ");
		long num = 0L;
		Scanner sc1 = new Scanner(System.in);
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
		return num;
	}

	
	public void calculateDigitsInNumber(long num)
	{
		int[] array = Long.toString(num).chars().map(c -> c-='0').toArray();
		long sum = 0L;		
		for(int j = 0; j < array.length; j++)
		{
			sum = sum + array[j];
		}
		System.out.print("The sum of amount of numbers is: " + sum);
	}
}
