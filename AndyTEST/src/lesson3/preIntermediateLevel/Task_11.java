/*
 Given an array of integer positive numbers. For example, {4, 6, 0, 1, 2, 3, 1, 9}, but it can be any
random. Write Java-program which returns True, if sequence {1, 2, 3} appears somewhere in the
array. Provide additional boundary checks
 */


package lesson3.preIntermediateLevel;

public class Task_11 
{
	public static void main(String[] args) 
	{
		//Test data		
		int[] testArray = {4,6,0,1,3,2,3,1,9,1,2,1,3};
		//Instantiate new object
		Task_11 task_11 = new Task_11();
		//Method application		
		System.out.println("The array has sequence 1 2 3 - " + task_11.checkArrayForSequence(testArray));
	}
	
	public boolean checkArrayForSequence(int[] testArray)
	{
		boolean isSeq = false;
		for(int i = 0; i < testArray.length-2; i++)
		{
			if((testArray[i] == 1) && (testArray[i+1] == 2) && (testArray[i+2] == 3)) isSeq = true;							
		}
		return isSeq;
	}	
}
