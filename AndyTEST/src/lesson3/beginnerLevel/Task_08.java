/*
 Given a string and an int n. Return a string made of the first n characters of the string, followed 
 by the first n-1 characters of the string, and so on. 
 Example:
			yourMethod("Testing", 4) -> "TestTesTeT"
			yourMethod("Testing", 3) -> "TesTeT"
			yourMethod("Testing", 2) -> "TeT“
 */
package lesson3.beginnerLevel;

public class Task_08 
{		
	public void quantityCharactersOfString(String word, int n)
	{		
		 for(int i = n; i > 0; i--)
		 {	
			 System.out.print(word + ", " + i + " -> "); //
			 for(int k = i; k > 0; k--)				
				 System.out.print(word.substring(0, k));			 
			 System.out.println();			
		 }
	}	
			
	public static void main(String[] args) 
	{
		//Test data 
		String word = "Supercalifragilisticexpialidocious";
		int n = 6;  // set first n characters 
		//Instantiate new object
		Task_08 task = new Task_08();
		//Method application		
		 task.quantityCharactersOfString(word, n);  	
	}
}

