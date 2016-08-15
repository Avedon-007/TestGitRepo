package Intermediate_level;
import java.util.*;

public class Task_05 
{
	private static Scanner sc1;
	
	public static void main(String[] args)
	{		
		System.out.println("Celsius -> Kelvin, type \"C\"");
		System.out.println("Kelvin -> Celsius, type \"K\"");
		System.out.print("Choose the conversion:");
		
		sc1 = new Scanner(System.in);
		
		if(sc1.hasNextLine())
		{
			String c = sc1.nextLine();
			
			if(c.equalsIgnoreCase("C"))
			{				
				Celsius_2_Kelvin C2K = new Celsius_2_Kelvin(); // подключаю класс Celsius_2_Kelvin
				C2K.convert_Cel_2_Kel();
			}
			else if(c.equalsIgnoreCase("K"))
			{
				Kelvin_2_Celsius K2C = new Kelvin_2_Celsius();   // подключаю класс Kelvin_2_Celsius
				K2C.convert_Kel_2_Cel();
			}
			else
				System.out.println("ERROR!!! Please choose the conversion.");
		}
		else
			System.out.println("ERROR!!!");		
	}
}
