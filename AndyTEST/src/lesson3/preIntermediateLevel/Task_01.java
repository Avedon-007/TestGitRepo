/*
 A couple is going to go to the cinema. That's makes sense, if both of them have the same mood.
 There are two booleanparameters heSmileand sheSmilewhich indicate if each is smiling or
 not. Write a method which returns True if they're eventually going to go to the cinema, of False
 otherwise:
 			visitCinema(true, true) -> true
 			visitCinema(false, false) -> true
 			visitCinema(true, false) -> false
 */

package lesson3.preIntermediateLevel;

public class Task_01 
{
	private boolean decisionToGoCinema(boolean heSmile, boolean sheSmile) 
	{			
		return ((heSmile == true && sheSmile == true) || (heSmile == false && sheSmile == false))? true: false;
	}

	public static void main(String[] args) 
	{
		// Test data
		boolean heSmile = false;
		boolean sheSmile = true;
		// Instantiate new object
		Task_01 visit = new Task_01();
		// Methods application
		System.out.println("Has he good mood? - " + heSmile);
		System.out.println("Has she good mood? - " + sheSmile);
		System.out.println("Do they go to the cinema? - " + visit.decisionToGoCinema(heSmile, sheSmile));
	}
}

/*
 * import java.util.Scanner;
 * 
 * public class Task_01 { private static Scanner scan1; private static Scanner
 * scan2; private static String he; private static String she; private static
 * boolean heSmile; private static boolean sheSmile; private static boolean
 * goToCinema;
 * 
 * public Task_01() { he = null; she = null; heSmile = false; sheSmile = true;
 * goToCinema = false; }
 * 
 * public void Scan() {
 * System.out.print("Is he smiling? (type \"Y\" or \"N\"): "); Scanner scan1 =
 * new Scanner(System.in); if(scan1.hasNextLine()) he = scan1.nextLine();
 * 
 * System.out.print("Is she smiling? (type \"Y\" or \"N\"): "); Scanner scan2 =
 * new Scanner(System.in); if(scan2.hasNextLine()) she = scan2.nextLine(); }
 * 
 * public static void main(String[] args) { Task_01 visit = new Task_01();
 * visit.Scan();
 * 
 * //--------------Set the mood for him by using SCANNER
 * ---------------------------------------
 * 
 * if( he.equalsIgnoreCase("Y")) //"IgnoreCase" added to allow to enter upper
 * and lowercase. { heSmile = true; System.out.println("He has good mood."); }
 * else if(he.equalsIgnoreCase("N")) { heSmile = false;
 * System.out.println("He hasn't good mood."); } else
 * System.out.println("ERROR! Wrong character!");
 * 
 * //-----------------Set the mood for her by using SCANNER
 * -----------------------------
 * 
 * if(she.equalsIgnoreCase("Y")) { sheSmile = true;
 * System.out.println("She has good mood. "); } else
 * if(she.equalsIgnoreCase("N")) { sheSmile = false;
 * System.out.println("She hasn't good mood. "); } else
 * System.out.println("ERROR! Wrong character!");
 * 
 * //------------------------Are they going to the cinema?
 * ----------------------------
 * 
 * if(visit.heSmile == false && visit.sheSmile == false) { goToCinema = true;
 * System.out.print(":) They are going to the cinema: " + goToCinema); } else
 * if(heSmile == true && sheSmile == true) { goToCinema = true;
 * System.out.print(":) They are going to the cinema: " + goToCinema); } else {
 * goToCinema = false; System.out.print(":( They aren't going to the cinema: " +
 * goToCinema); } } }
 */