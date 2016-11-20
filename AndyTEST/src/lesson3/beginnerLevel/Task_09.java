/*
 Create method which takes two integers (a and b), performs their division (a/b) and outputs
  accurate result of division (this means the result should have a decimal part, if any)
 */
/*
 1. remake with array which contained pairs of numbers.
 2. use Try catch or If condition in separated method.
 */

package lesson3.beginnerLevel;


public class Task_09 
{	
	public void devisionOfIntegersAandB(int a, int b)
	{			
		try
		{
			double result = (float)a / b;			
			System.out.println("a/b= " + result);
		}
		catch(ArithmeticException e)
		{			
			System.out.println("Error! Division by zero " + e);
		}
	}
	
	public static void main(String[] args) 
	{
		//Test data
		int[][] testDataArray = {{1,1}, {2,1}, {-1,2}, {0,1}, {1,0}, {-5,-2}, {9,-4}, {-2,3}};
		
		//Instantiate new object
		Task_09 task = new Task_09();		
		//Methods application
		for(int[] paireData: testDataArray)
			task.devisionOfIntegersAandB(paireData[0], paireData[1]);			
	}
}

