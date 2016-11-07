package Intermediate_level;
import java.util.*;

public class Task_05_Kelvin_2_Celsius 
{
	private static Scanner sc1;
	
	public void convert_Kel_2_Cel()    // создаю метод без мейна, чтоб его можно было использовать в Task_05
	{
		float tC = 0f;
		float tK = 0f;
		
		System.out.print("Enter the temperature in Kelvin: ");
		sc1 = new Scanner(System.in);
		
		if(sc1.hasNextFloat())
		{
			tK = sc1.nextFloat();
			if(tK >= 0)
			{	
				tC = tK - Task_05_Celsius_2_Kelvin.COEFFICIEN; // взял переменную COEFFICIEN из класса Celsius_2_Kelvin, 
														//чтобы не дублировать её, так как она уже создана была
				System.out.println("The temperature in Celsius is: " + tC);
			}
			else
				System.out.println("ERROR!!! The temperature cannot be lower than absolute ZERO (-273.15 C).");
		}
		else
			System.out.println("ERROR!!! You should use digits with comma if it's float number.");
	}
}
