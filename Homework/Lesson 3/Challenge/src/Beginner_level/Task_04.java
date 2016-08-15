package Beginner_level;
import java.util.*;

public class Task_04
{
	public static void main(String[] args)
	{
		int num;
		int count = 0;
		int[] array = {1,5,6,9,4,7,0,8,7,3,2,5,8,2,1,0,6};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Choose the number: ");
		
		if(scan.hasNextInt())
		{
			num = scan.nextInt();			
			
			if(num >= 0 && num < 10)
			{
				for(int i = 0; i < array.length; i++)
				{
					if(array[i] == num)
						count++;					
				}
				System.out.println(count);
			}
			else
				System.out.println("Please choose integer number in range 0 to 9.");			
		}
		else
			System.out.println("ERROR! The letters, symbols are prohibited! Please choose integer number!");
	}
}
