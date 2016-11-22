/*
  Imagine that you have a special skill which allows to calculate amount of digits in any integer positive
number. For example, if number is 12345, amount=15. Write a method which checks your
superpower for any hard-coded number.
 */


package lesson3.preIntermediateLevel;


public class Task_12 
{
	public void calculateDigitsInNumber(int num)
	{	
		try
		{
			if(num >= 0)
			{
				int[] array = Integer.toString(num).chars().map(c -> c-='0').toArray();
				int sum = 0;		
				for(int j = 0; j < array.length; j++)
					sum = sum + array[j];	
				System.out.print("The sum of amount of numbers is: " + sum);
			}			
			else
				System.out.println("ERROR! Please enter positive number");
		
		}catch(Exception e)
		{
			System.out.println("ERROR! " + e);
		}		
	}
	
	public static void main(String[] args)
	{
		//Test data
		int num = 12345;
		//Instantiate new object
		Task_12 task = new Task_12();
		//Method application
		task.calculateDigitsInNumber(num);
	}
}

/*

//long num = 1234567890123456789L;
//int[] array = Long.toString(num).chars().map(c -> c-='0').toArray();
//long sum =0l;
*/

