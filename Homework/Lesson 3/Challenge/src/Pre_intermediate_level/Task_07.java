package Pre_intermediate_level;
import java.util.*;


public class Task_07 
{
	public static void main(String[] args) 
	{		
		int[] myArray = {1,2,3,4,5,6,1};
		int max = myArray[0];
		int min = myArray[0];
		
		max = Arrays.stream(myArray).max().getAsInt();
		min = Arrays.stream(myArray).min().getAsInt();
		 
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
		
		int newMax = max*2;
		int newMin = min*2;
		System.out.println("Max = " + newMax);
		System.out.print("Min = " + newMin);		
	}
}
