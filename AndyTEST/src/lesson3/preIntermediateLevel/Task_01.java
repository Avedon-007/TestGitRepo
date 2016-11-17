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
		boolean mood = false;
		if(heSmile == true && sheSmile == true) mood = true;
		return mood;
				
	}

	public static void main(String[] args) 
	{
		// Test data
		boolean heSmile = false;
		boolean sheSmile = true;
		// Instantiate new object
		Task_01 visitCinema = new Task_01();
		// Methods application
		System.out.println("Has he good mood? - " + heSmile);
		System.out.println("Has she good mood? - " + sheSmile);
		System.out.println("Do they go to the cinema? - " + visitCinema.decisionToGoCinema(heSmile, sheSmile));
	}
}
