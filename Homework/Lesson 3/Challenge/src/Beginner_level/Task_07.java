package Beginner_level;

public class Task_07 
{
	private static int[] arr;
	private static int max;
	
	public Task_07()
	{
		arr = new int[]{-100,0,2,5,8,3,10,36,2,9};
		max = 0;
	}
	
	public void Max()
	{
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = max;
			
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[j] > max)				
					max = arr[j];				
			}
		}
	}
	
	public static void main(String[] args)
	{		
		Task_07 task = new Task_07();
		task.Max();		
		System.out.println("Max element: " + max);
	}
}