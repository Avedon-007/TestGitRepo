package Pre_intermediate_level;
import java.util.Scanner;

public class Task_12 
{
	//private static Scanner sc1;
	
	public static void main(String[] args)
	{
		long num = 1234567890123456789L;
		int[] array = Long.toString(num).chars().map(c -> c-='0').toArray();
		long sum =0l;
			
		for(int j = 0; j < array.length; j++)
		{
			sum = sum + array[j];
		}
		System.out.print("The sum of amount of numbers is: " + sum);
	}
}
