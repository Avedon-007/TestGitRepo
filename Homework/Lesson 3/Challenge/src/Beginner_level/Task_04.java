package Beginner_level;
import java.util.*;

public class Task_04
{
	private static int num;
	private static int count;
	private static int[] array;
	
	public Task_04()
	{
		int num;
		int count = 0;
		array = new int[]{1,5,6,9,4,7,0,8,7,3,2,5,8,2,1,0,6,8};
	}
	
	public void Scan()
	{
		System.out.print("Choose the number: ");
		Scanner scan = new Scanner(System.in);
		
		if(scan.hasNextInt())
			num = scan.nextInt();
		else
		{	
			System.out.println("ERROR!!! \nThe letters, symbols and float numbers are prohibited! \nPlease choose integer number!");
			System.exit(0);
		}
	}	
	
	public static void main(String[] args)
	{
		Task_04 task = new Task_04();
		task.Scan();
				
		if(num >= 0 && num < 10)
		{
			for(int i = 0; i < array.length; i++)
			{
				if(array[i] == num)
					count++;					
			}
			System.out.println("Your number is repeat in an array of " + count + " times");
		}
		else
			System.out.println("Please choose integer number in range 0 to 9.");				
	}
}
