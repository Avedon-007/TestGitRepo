package Pre_intermediate_level;

import java.util.Scanner;

public class Task_01 
{
		private static Scanner sc1;
		private static Scanner sc2;

	public static void main(String[] args) 
	{		
			String he = null;
			String she = null;
			boolean heSmile = false;
			boolean sheSmile = true;
			boolean goToCinema = false;

//--------------Set the mood for him by using SCANNER ---------------------------------------
		System.out.print("Is he smiling? (type \"Y\" or \"N\"): ");
		
		sc1 = new Scanner(System.in);
			
		he = sc1.nextLine();
	
		if( he.equalsIgnoreCase("Y"))  //"IgnoreCase" added to allow to enter upper and lowercase.
		{    
			heSmile = true;
		
			System.out.println("He has good mood.");
		}
		else if(he.equalsIgnoreCase("N"))
		{		
			heSmile = false;
			System.out.println("He hasn't good mood.");
		}
		else
		{		
			System.out.println("ERROR! Wrong character!");	
		}

//-----------------Set the mood for her by using SCANNER -----------------------------		
		System.out.print("Is she smiling? (type \"Y\" or \"N\"): ");
	
		sc2 = new Scanner(System.in);
	
		she = sc2.nextLine();

		if(she.equalsIgnoreCase("Y"))
		{
			sheSmile = true;	
			System.out.println("She has good mood ");
		}
		else if(she.equalsIgnoreCase("N"))
		{
			sheSmile = false;
			System.out.println("She hasn't good mood ");
		}
		else
		{
			System.out.println("ERROR! Wrong character!");
		}

//------------------------Are they going to the cinema? ----------------------------
		if(heSmile == false && sheSmile == false)
		{
			goToCinema = true;
			System.out.print(":) They are going to the cinema: " + goToCinema);
		}
		else if(heSmile == true && sheSmile == true)
		{
			goToCinema = true;
			System.out.print(":) They are going to the cinema: " + goToCinema);
		}
		else
		{
			goToCinema = false;
			System.out.print(":( They aren't going to the cinema: " + goToCinema);
		}
	}
}