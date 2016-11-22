/*
 Temperature converter. Write a program for temperature converter between Celsius and Kelvin and vice versa. 
 Use OOP for realizing separate class with appropriate methods and call them in the main class of your program.
 */

package lesson3.intermediateLevel;
import java.util.*;


public class Task_05_main 
{	
	public static void main(String[] args)
	{		
		//Test data
		double kelvinTemperarute = 0;
		double celsiusTemperature = 0;
		
		Task_05_Kelvin_2_Celsius convertKelvToCels = new Task_05_Kelvin_2_Celsius();
		convertKelvToCels.convert_Kel_2_Cel(kelvinTemperarute);	
		
		Task_05_Celsius_2_Kelvin convertCelsToKelv = new Task_05_Celsius_2_Kelvin();
		convertCelsToKelv.convert_Cel_2_Kel(celsiusTemperature);
	}
}

/*
public class Task_05_main 
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
*/