/*
 Given an array of integers. Write a method which finds max and min elements in it and
multiplies them by 2.
 */
package lesson3.preIntermediateLevel;
import java.util.*;


public class Task_07 
{	
	public void minMaxArrayElementsAndMultBy2(int[] testArray)
	{		
		int	max = Arrays.stream(testArray).max().getAsInt();
		System.out.print("The Max element in array is: " + max);
		System.out.println();			
		int	min = Arrays.stream(testArray).min().getAsInt();
		System.out.print("The Min element in array is: " + min);
		System.out.println();
		int	newMax = max*2;
		int	newMin = min*2;
		System.out.println(max + " * 2 = " + newMax);
		System.out.println(min + " * 2 = " + newMin);
	}	
	
	public static void main(String[] args) 
	{	
		//Test Data
		int[] testArray = new int[]{1,2,3,4,5,6,1};
		//Instantiate new object
		Task_07 task = new Task_07();
		//Methods application
		System.out.println("Given an array of integers. Write a method which finds max and \n" +  
		"min elements in it and multiplies them by 2.");
		task.minMaxArrayElementsAndMultBy2(testArray);				
	}
}
