package lesson3.intermediateLevel;


public class Task_05_Kelvin_2_Celsius 
{	
	public void convert_Kel_2_Cel(double kelvinTemperarute)    // создаю метод без мейна, чтоб его можно было использовать в Task_05
	{
		try
		{
			float tC = 0f;
			float tK = 0f;			
			if(tK >= 0)
			{	
				tC = tK - Task_05_Celsius_2_Kelvin.COEFFICIEN; // взял переменную COEFFICIEN из класса Celsius_2_Kelvin, 
														//чтобы не дублировать её, так как она уже создана была
				System.out.println("The temperature in Celsius is: " + tC);
			}
			else
				System.out.println("ERROR!!! The temperature cannot be lower than absolute ZERO (-273.15 C).");			
		}
		catch(Exception e)
		{
			System.out.println("ERROR!!! You should use digits with comma if it's float number." + e);
		}
	}
}

