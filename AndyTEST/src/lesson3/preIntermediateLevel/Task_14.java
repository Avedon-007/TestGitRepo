/*
 	Write a method which takes a word and prints it like a diagonal matrix. See example:
Input: “Test”
Output: T
		 e
		  s
		   t
 */

package lesson3.preIntermediateLevel;


public class Task_14 	// Вывести слово в диагональной матрице
{	
	public static void main(String[] args) 
	{		
		//Teas data
		String word = "Test";
		//INstantiate new object
		Task_14 task = new Task_14();
		//Method application
		//task.createDiagonalMatrix(word);
		task.showArray(task.createDiagonalMatrix(word));
	}	
		
		
			
}

/*

public class Task_14 	// Вывести слово в диагональной матрице
{
	private static Scanner sc1;
	
	public static void main(String[] args) 
	{		
		String word;
		char[] arrayWord;
		String s = "  ";
		String s1 = "";
		
		System.out.print("Enter the word: ");
		sc1 = new Scanner(System.in);
		word = sc1.nextLine();
		
		arrayWord = word.toCharArray();		
		
		System.out.println(arrayWord[0]);
		
		for(int i = 1; i < arrayWord.length; i++)
		{
			s1 = s1 + s;			
			System.out.println(s1 + arrayWord[i]);
		}					
	}
}

*/