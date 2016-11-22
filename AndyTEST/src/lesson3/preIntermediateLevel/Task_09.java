/*
 Write a method which prints multiplication table for the input number. 
 Like this:
			2 x 2 = 4
			2 x 3 = 6
			2 x 4 = 8
				...
 */


package lesson3.preIntermediateLevel;


public class Task_09 
{
	public void multiplicationTable(int[] num)
	{
		try
		{
			for(int i = 0; i <= num.length-1; i++)
			{
				System.out.println("Multiplication table for " + num[i]);
				for(int k = 1; k <= 10; k++)
				{
					int multiplicationResult = num[i] * k;
					System.out.println(num[i] + " * " + k + " = " + multiplicationResult);
				}
				System.out.println();
			}
		}
		catch(Exception e)
		{
			System.out.println("!!!Error!!! Вы ввели не целое число или символ!" + e);
		}
	}
	
	public static void main(String[] args) 
	{
		//Test data
		int[] num = {-1, 0, 1, 2, 10, -0};
		//Instantiate new object
		Task_09 task = new Task_09();
		//Method application
		task.multiplicationTable(num);			
	}	
}
