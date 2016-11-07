package Pre_intermediate_level;
import java.util.Scanner;

public class Task_09 
{
	private static Scanner sc1;
	
	public static void main(String[] args) 
	{
		int num = 0;
		int sum = 0;
		
		System.out.print("Enter the number: ");
		
		sc1 = new Scanner(System.in);		
				
		if(sc1.hasNextInt())
		{	
			num = sc1.nextInt();
			
			for(int i = 1; i <= 10; i++)
			{
				sum = num * i;
				System.out.println(num + " * " + i + " = " + sum);
			}
		}				
		else
		{
			System.out.println("!!!Error!!! Вы ввели не целое число или символ!");
		}		
	}	
}
