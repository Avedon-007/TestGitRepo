package Advanced;
import java.util.Scanner;

public class Task_03_Metrics 
{
	private static Scanner sc1, sc2, sc3, sc4, sc5, sc6;
	private static int total;
	private static int pass;
	private static int fail;
	private static int unrez;
	private static int unrezHigh;
	private static int unrezBC;
	private static int unrezB;
	//private boolean isFalse = false;	
	
		
	//public static void main(String[] args)  // для проверки этого метода. раскоментировать необходимые стоки.
	
	public void metricsCalculation()
	{		
		System.out.print("Enter the number of PASSED test cases: ");
		sc1 = new Scanner(System.in);
		pass = sc1.nextInt();
		
		System.out.print("Enter the number of FAILED test cases: ");
		sc2 = new Scanner(System.in);
		fail = sc2.nextInt();
		
		System.out.print("Enter the complete number of UNRESOLVED issues (bugs): ");
		sc3 = new Scanner(System.in);
		unrez = sc3.nextInt();
		
		System.out.print("Enter the number of UNRESOLVED issues (bugs) with HIGH priority: ");
		sc4 = new Scanner(System.in);
		unrezHigh = sc4.nextInt();
		
		System.out.print("Enter the number of UNRESOLVED issues (bugs) with Blocker and Critical severity: ");
		sc5 = new Scanner(System.in);
		unrezBC = sc5.nextInt();
		
		System.out.print("Enter the number of UNRESOLVED issues (bugs) with Blocker: ");
		sc6 = new Scanner(System.in);
		unrezB = sc6.nextInt();
		
		
		total = pass + fail + unrez;
		//System.out.println("Total number of TC: " + total);
		
		// использую ИНТ, так как нужно только целое число, кейс не может быть на какуюто десятую часть Failed.
		//			|
		//if(fail < (int)((total * 20f) / 100f) && unrezHigh < 10 && unrezBC < 5 && unrezB < unrezBC && unrezB < (int)((unrez * 5f) / 100f))   
		//{
		//	isFalse = true;		
		//	System.out.println("Build is Stable");
		//}
		//else
		//{	
		//	isFalse = false;
		//	System.out.println("Build is Not Stable");
		//}
		
				
		//System.out.println(isFalse);
	}
	
	
	// использую методы GET для передачи переменных в класс Task_03_HappyTestManager
	public static int getTotal()
	{
		return total;
	}
	
	public static int getPass()
	{
		return pass;
	}
	
	public static int getFail()
	{
		return fail;
	}

	public static int getUnrez()
	{
		return unrez;
	}
	
	public static int getUnrezHigh()
	{
		return unrezHigh;
	}

	public static int getUnrezBC()
	{
		return unrezBC;
	}

	public static int getUnrezB() 
	{
		return unrezB;
	}
}
