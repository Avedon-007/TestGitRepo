package Intermediate_level;
import java.util.*;

public class Task_04   // Sum of numbers in the string.
{
	private static Scanner sc1;
	private static int[] array;
	private static int sum;
	private static int num;
	private static String str;
	
	public Task_04()
	{
		array = new int[1000];
		sum = 0;
		num = 0;
		String str;
	}
	
	public void Scan()
	{
		System.out.println("Enter the string: ");
		sc1 = new Scanner(System.in);
		str = sc1.nextLine();
	}
	
	public void Logic()
	{
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
	}
	public static void main(String[] args) 
	{
		Task_04 task = new Task_04();
		task.Scan();	
		task.Logic();		
		System.out.println("The sum of digits in the string is: " + sum);
	}
}
