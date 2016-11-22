package lesson3.intermediateLevel;


public class Task_05_Celsius_2_Kelvin 
{
	public static final float COEFFICIEN = 273.15f;
	
	public void convert_Cel_2_Kel(double celsiusTemperature) // создаю метод без мейна, чтоб его можно было использовать в Task_05
	{
		try
		{
			float tC = 0f;
			float tK = 0f;			
			if(tC >= -COEFFICIEN)
			{	
				tK = tC + COEFFICIEN;
				System.out.println("The temperature in Kelvin is: " + tK);
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

/*
public class Task_05_Celsius_2_Kelvin 
{
	public static final float COEFFICIEN = 273.15f;
	private static Scanner sc1;
	
	public void convert_Cel_2_Kel() // создаю метод без мейна, чтоб его можно было использовать в Task_05
	{
		float tC = 0f;
		float tK = 0f;
		
		System.out.print("Enter the temperature in Celsius: ");
		sc1 = new Scanner(System.in);
		
		if(sc1.hasNextFloat())
		{
			tC = sc1.nextFloat();
			
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
*/