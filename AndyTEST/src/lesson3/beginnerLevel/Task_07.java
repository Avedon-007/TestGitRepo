/*
 Given an array of integers. Find and print the max element in it
 */
package lesson3.beginnerLevel;

public class Task_07 
{
	
	public int findMax(int max)
	{
		int[] arr = new int[]{-100,0,2,5,8,3,10,36,2,9};
		 max = 0;
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = max;
			
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[j] > max)				
					max = arr[j];				
			}
		}
		return max;
	}
	
	public static void main(String[] args)
	{		
		
		Task_07 task = new Task_07();
		
		System.out.println("Max element of array is: " + task.findMax());  //Почему в task.findMax(0) нужно НОЛЬ?
	}
}