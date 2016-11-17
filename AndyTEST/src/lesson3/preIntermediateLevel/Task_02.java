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
		char[] wordArray = word.toCharArray();		//convert Word to char array
		char bufer = wordArray[0];		
		wordArray[0] = wordArray[wordArray.length - 1];
		wordArray[wordArray.length - 1] = bufer;		
		String newWord = new String(wordArray);		
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

/*
public class Task_02 
{
	private static String word;
	private static char[] wordArray;
	private static char bufer;
	private static String newWord;
	
	public Task_02()
	{
		word = "How wants to live foreve";
		char bufer;
		char[] wordArray;
		String newWord;
	}
	
	public void Swap()
	{
		Task_02 task = new Task_02();		
		char[] wordArray = word.toCharArray();		
		bufer = wordArray[0];		
		wordArray[0] = wordArray[wordArray.length - 1];
		wordArray[wordArray.length - 1] = bufer;		
		newWord = new String(wordArray);
	}

	public static void main(String[] args) 
	{
		Task_02 task = new Task_02();		
		task.Swap();					
		System.out.println(newWord);
	}
}
*/