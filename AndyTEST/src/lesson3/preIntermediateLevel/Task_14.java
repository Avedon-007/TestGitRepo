/*
 	Write a method which takes a word and prints it like a diagonal matrix. See example:
Input: “Test”
Output: T
		 e
		  s
		   t
 */

package lesson3.preIntermediateLevel;


public class Task_14
{	
	public static void main(String[] args) 
	{		
		//Teas data
		String word = "Test";
		//INstantiate new object
		Task_14 task = new Task_14();
		//Method application
		task.createDiagonalMatrix(word);
	}	
		
	public void createDiagonalMatrix(String word)
	{
		char[] arrayWord = word.toCharArray();		
		String s = " ";
		String s1 = "";
		System.out.println(arrayWord[0]);
		
		for(int i = 1; i < arrayWord.length; i++)
		{
			s1 = s1 + s;			
			System.out.println(s1 + arrayWord[i]);
		}	
	}			
}