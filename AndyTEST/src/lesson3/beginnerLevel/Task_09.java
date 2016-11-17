/*
 Create method which takes two integers (a and b), performs their division (a/b) and outputs
  accurate result of division (this means the result should have a decimal part, if any)
 */
/*
 1. remake with array which contained pairs of numbers.
 2. use Try catch or If condition in separeited method.
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

