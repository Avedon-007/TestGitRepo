/*
 Given an array of integer numbers. Create a method (program) which returns a new one where

each element is multiplied by 3
 */
package lesson3.beginnerLevel;

public class Task_01 
{	
	
	
	public int[] multiplyArrayByFactor(int[] numbers, int factor )
	{	
		int[] multiplyArrayByFactor = new int[numbers.length] ;
		for (int i = 0; i < numbers.length; i++){
			multiplyArrayByFactor[i] = numbers[i] * factor;
			
		}
		return multiplyArrayByFactor;
	}
	public void showArray(int[] numbers)
	{
		for(int element: numbers)
			System.out.print(element + " ");
		System.out.println();
	}
	public static void main(String[] args)
	{
	//Test data
		int[] numbers = new int[]{1,2,3,4,5};
		int factor = 3;
	//Instance of classes creation 
		Task_01 task = new Task_01();
		//Methods application 
		
		System.out.println("Given an array of integer numbers.\n "
				+ "Create a method (program) which returns a new one where each element is multiplied by 3");
		System.out.print("Initial array is ");
		task.showArray(numbers);
		System.out.println("Factor is " + factor);
		System.out.print("Modified array is ");
		task.showArray(task.multiplyArrayByFactor(numbers, factor));


	}
}
