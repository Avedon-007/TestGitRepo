package Beginner_level;

public class Task_07 
{
	public static void main(String[] args)
	{		
		int[] arr = {-100,0,2,5,8,3,10,36,2,9};
		int max = 0;
		
		for(int i = 0; i <= arr.length; i++)
		{
			arr[i] = max;
			
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[j] > max)
				{
					max = arr[j];
				}
			}
		}
		System.out.println("Max element: " + max);
	}		
}
