/*
 	Given an array of integers. Write a method which prints the second half of the array. Include the
middle element to output, if the array has odd number of elements.
 */

package lesson3.preIntermediateLevel;

public class Task_04						
{		
	public void divideArrayOnHalf(int[] array)
	{
		try
		{
			for(int i = array.length/2; i <= array.length-1; i++)
			{				
				System.out.print(array[i]);
				System.out.print(" ");
			}
		}
		catch(Exception e)
		{
			System.out.println("ERROR!!!" + e);
		}
		
	}	
	
	public static void main(String[] args) 
	{
		//Test data
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		//Instantiate new object
		Task_04 task = new Task_04();
		//Method application
		System.out.print("The half of array is ");
		task.divideArrayOnHalf(array);
	}
}


/*
public class Task_04						
{		
	public void divideArrayOnHalf(int[] array)
	{
		System.out.print('{');		
		for(int i = array.length/2; i < array.length-1; i++)
		{				
			System.out.print(String.format("%1d, ", array[i]));
		}			
		System.out.print(String.format("%1d}", array[array.length-1]));	
	}	
	
	public static void main(String[] args) 
	{
		//Test data
		int[] array = {1,2,3,4,5,6,7,8,9,10,11};
		//Instantiate new object
		Task_04 task = new Task_04();
		//Method application
		System.out.print("The half of array is ");
		task.divideArrayOnHalf(array);
	}
}
*/