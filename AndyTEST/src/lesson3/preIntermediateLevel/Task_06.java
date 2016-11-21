/*
 Given an array of integers. Write a method which calculates sum of all elements and arithmetic
average of them
 */

package lesson3.preIntermediateLevel;
import java.util.stream.IntStream;


public class Task_06 
{			
	public int sumOfArrayElements(int[] myArray)
	{
		int sumOfElements = IntStream.of(myArray).sum();
		return sumOfElements;
	}	
	public double averageOfArrayElements(int[] myArray, int sumOfElements)
	{
		double averageOfElements = sumOfElements/myArray.length;
		return averageOfElements;
	}
	public static void main(String[] args) 
	{
		//Test data
		int[] myArray = {1,2,3,4,5,6,1};
		//Instantiate new object
		Task_06 task1 = new Task_06();
		//Methods application
		System.out.println("The sum of array elements is: " + task1.sumOfArrayElements(myArray));		
		System.out.println("The arithmetical average of array elements is: " + task1.averageOfArrayElements(myArray, task1.sumOfArrayElements(myArray)));
	}
}
