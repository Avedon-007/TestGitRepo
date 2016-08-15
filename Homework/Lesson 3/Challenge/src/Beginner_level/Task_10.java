package Beginner_level;
import java.util.Scanner;

public class Task_10 
{
	private static Scanner sc1;
	
	public static void main(String[] args) 
	{		
		int a = 0;	
		String star = new String("***********************");
		
		System.out.print("Введите число (не дробное) от 1 до 9: ");
		
		sc1 = new Scanner(System.in);
		
		if(sc1.hasNextInt())	// hasNextInt позволяет ввести любой символ и цифру. Чтоб потом при выводе небыло ошибки.
		{	
			a = sc1.nextInt();
			
			if(a > 0 && a <= 9)	//Проверяем, чтобы вводимое число было в заданном диапазоне.
			{   								
				for(int i = 1; i < a; i++)
				{											
					System.out.println(star.substring(0, i));
				}
				
				for(int i = a; i > 0; i--)
				{						
					System.out.println(star.substring(0, i));					
				}							
			}
			else
			{
				System.out.println("ERROR!!! Неправельный ввод данных!");
			}
		}
		else
		{
			System.out.println("ERROR!!! Неправельный ввод данных!");
		}
	}
}
