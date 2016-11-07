package Pre_intermediate_level;
import java.util.*;


public class Task_07 
{
	private static int[] myArray;
	private static int max;
	private static int min;
	private static int newMax;
	private static int newMin;
	
	public Task_07()
	{
		myArray = new int[]{1,2,3,4,5,6,1};
		int max = myArray[0];
		int min = myArray[0];
		int newMax;
		int newMin;
	}
	
	public void MinMaxLogic()
	{
		max = Arrays.stream(myArray).max().getAsInt();
		min = Arrays.stream(myArray).min().getAsInt();
	}
	
	public void MultiplyMinMax()
	{
		newMax = max*2;
		newMin = min*2;
	}
	public static void main(String[] args) 
	{	
		Task_07 task = new Task_07();
		task.MinMaxLogic();
		task.MultiplyMinMax();
		
		/* Альтернативный способ.
		 * Используем цыкл.		
		for(int i = 0; i < myArray.length; i++)
			 if(myArray[i] > max)
				 max = myArray[i];
		 
		 for(int i = 1; i < myArray.length; i++)
			 if(myArray[i] < min)
				 min = myArray[i];
		 */		  
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);		
		System.out.println("Max * 2 = " + newMax);
		System.out.println("Min * 2 = " + newMin);		
	}
}
