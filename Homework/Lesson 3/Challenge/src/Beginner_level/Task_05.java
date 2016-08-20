package Beginner_level;
import java.util.Scanner;

public class Task_05 
{
	private static int mark;
	private static String[] marks;
	
	public Task_05()
	{
		marks = new String[] {"Very poor", "Poor", "Average", "Good", "Excellent"};
		int mark;
	}
	
	public void Scan()
	{
		System.out.print("Choose your mark from 1 to 5: ");
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt())
			mark = scan.nextInt();		
		else
		{	
			System.out.println("ERROR!!! \nThe letters, symbols and float numbers are prohibited! \nPlease choose integer number!");
			System.exit(0);
		}		
	}
	
	public static void main(String[] args)
	{
		Task_05 task = new Task_05();
		task.Scan();
				
		int i = mark;

		if(i>0 && i<6)
			System.out.println("Your mark is: " + marks[i-1]);
		else
			System.out.println("Please choose your mark in range of 1 to 5!");	
	}
}
