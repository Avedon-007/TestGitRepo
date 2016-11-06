package Intermediate_level;
import java.util.*;

public class Task_05 
{
	private static Scanner sc1;
	private static String c;
	
	public Task_05()
	{
		Scanner sc1;
		String c;
	}
	
	public void Scan()
	{
		System.out.println("Celsius -> Kelvin, type \"C\"");
		System.out.println("Kelvin -> Celsius, type \"K\"");
		System.out.print("Choose the conversion:");
		
		sc1 = new Scanner(System.in);
		if(sc1.hasNextLine())		
			c = sc1.nextLine();			
		else
			System.out.println("ERROR!!!");			
	}
	
	public void Logic()
	{
		if(c.equalsIgnoreCase("C"))
		{				
			Task_05_Celsius_2_Kelvin C2K = new Task_05_Celsius_2_Kelvin(); // подключаю класс Celsius_2_Kelvin
			C2K.convert_Cel_2_Kel();
		}
		else if(c.equalsIgnoreCase("K"))
		{
			Task_05_Kelvin_2_Celsius K2C = new Task_05_Kelvin_2_Celsius();   // подключаю класс Kelvin_2_Celsius
			K2C.convert_Kel_2_Cel();
		}
		else
			System.out.println("ERROR!!! Please choose the conversion.");
	}
	
	public static void main(String[] args)
	{		
		Task_05 task = new Task_05();
		task.Scan();
		task.Logic();			
	}
}
