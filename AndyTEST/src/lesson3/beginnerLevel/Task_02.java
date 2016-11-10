/*
 Given two integers, x and y. Create a method (program) which returns True if one if them is 10

or if their sum is 10
 */

package lesson3.beginnerLevel;

public class Task_02 
{	
	
	
	public boolean checkElementsCondition(int x, int y)
	{
		return ( x == 10|| y == 10|| x + y == 10)? true: false;
	}	
	
	
	public static void main(String[] args)
	{	
		int[][] parameters = {{1,1}, {10,1},{1,10},{5,4},{-4,0}, {-10,20}, {6,4}};
		
		Task_02 task = new Task_02();
		
		System.out.println("Given two integers, x and y.\n "
				+ "Create a method (program) which returns True if one if them is 10 or if their sum is 10");
		for(int[] newPair: parameters)
		{
			System.out.println("For pair of numbers " + newPair[0] + " and " + newPair[1] + " result is " 
		+ task.checkElementsCondition(newPair[0], newPair[1]));
		}		
	}
	
	
}
