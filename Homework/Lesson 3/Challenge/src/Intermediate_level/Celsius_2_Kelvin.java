package Intermediate_level;
import java.util.*;

public class Celsius_2_Kelvin 
{
	public static final double COEFFICIEN = 273.15;
	private static Scanner sc1;
	
	public void convert_Cel_2_Kel() // создаю метод без мейна, чтоб его можно было использовать в Task_05
	{
		double tC = 0;
		double tK = 0;
		
		System.out.print("Enter the temperature in Celsius: ");
		sc1 = new Scanner(System.in);
		
		if(sc1.hasNextDouble())
		{
			tC = sc1.nextDouble();
			
			if(tC >= -COEFFICIEN)
			{	
				tK = tC + COEFFICIEN;
				System.out.println("The temperature in Kelvin is: " + tK);
			}
			else
				System.out.println("ERROR!!! The temperature cannot be lower than absolute ZERO (-273.15 C).");
		}
		else		
			System.out.println("ERROR!!! You should use digits with comma if it's float number.");				
	}
}
