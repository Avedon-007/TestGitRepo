/*
 Given 2 integers, a and b. Write a method which returns true if one if them is 21 or if their sum

	is 21.
 
 */
package lesson3.preIntermediateLevel;

public class Task_03 
{	
	public static void main(String[] args)
	{	
		//Test data
		int[][] myArray = {{21, 1}, {4, 21}, {11, 10}, {10, 11}, {23, -2}, {0, 21}, {21, 0}, {5, 6}, {-10, -11}, {-21, -21}};
		//Instantiate new object
		Task_03 task = new Task_03();
		//Methods application
		System.out.println("Given 2 integers, a and b. Write a method which returns true \nif one if them is 21 or if their sum is 21.");
		System.out.println();
		for(int[] newParametr: myArray)
		{
			System.out.println("The result for " + newParametr[0] + " and " + newParametr[1] + " is " + task.checkElementsOfArray(newParametr[0], newParametr[1]));
		}
	}

	private boolean checkElementsOfArray(int i, int j) 
	{		
		return (i + j == 21 || i == 21 || j == 21)? true: false;
	}	
}