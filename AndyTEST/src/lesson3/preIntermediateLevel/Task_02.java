/*
 Given a string. Write a method which swaps first and last characters and returns a new modified
 string:
 		swapChar("Cool text") -> "tool texC“
 */

package lesson3.preIntermediateLevel;

public class Task_02 
{	
	public String swapFirstAndLastChar(String word)
	{			
		String newWord = word.substring(word.length() - 1, word.length()) + word.substring(1,word.length() - 1) + word.substring(0,1);		
		return newWord;
	}

	public static void main(String[] args) 
	{
		//Test data
		String word = "How wants to live foreve";
		//Instantiate new object
		Task_02 task = new Task_02();							
		//Methods application
		System.out.println("The string which need to swap is: " + word);
		System.out.println("Result of swaping is: " + task.swapFirstAndLastChar(word));
	}
}

