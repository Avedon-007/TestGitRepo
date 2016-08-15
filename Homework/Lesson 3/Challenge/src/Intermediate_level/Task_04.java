package Intermediate_level;
import java.util.*;

public class Task_04   // Sum of numbers in the string.
{
	private static Scanner sc1;
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the string: ");
		sc1 = new Scanner(System.in);
		String str = sc1.nextLine();
		int[] array = new int[1000];
		int sum = 0;
		int num = 0;
		
		for(int i =0; i < str.length(); i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				num = Integer.valueOf(str.substring(i, i+1)).intValue();
				array[i] = num;  // буферный массив. в него записываем выбранные числа из строки.
				sum += array[i];
				//System.out.println(num); // проверка, вывожу только цифры.
			}			
		}
		System.out.println("The sum of digits in the string is: " + sum);
	}
}
