package Intermediate_level;
import java.util.*;

public class Task_06    // the longest word in string 
{
	private static Scanner sc1;
	private static String sentence;   // variable for whole sentence
	private static String word;   // variable for 1 word
	private static String maxWord; // variable for longest word 
	private static int count;   // variable for counting letters in word
	private static int maxLength;
	private static int c;
	private static StringTokenizer str;
	
	public Task_06()
	{
		Scanner sc1;
		String sentence;
		String word;
		String maxWord = "";
		int count;
		maxLength = 0;
		c = 0;
		StringTokenizer str;
	}
	
	public void Scan()
	{
		sc1 = new Scanner(System.in);
        System.out.print("Enter any sentence: ");
        sentence = sc1.nextLine();
	}
	
	public void Logic()
	{
		//finding the length of the sentence       
    	str = new StringTokenizer(sentence,"; ? ' . : , !"); //converting String into StringTokenizer object
        c = str.countTokens();         
        for(int i = 0; i < c; i++)
        {
        	word = str.nextToken(); //extracting tokens (i.e. words) one at a time
        	count = word.length();                
            if(count > maxLength) //checking for maximum length
            {
            	maxLength = count;
            	maxWord = word;
            }
        }
	}	
	
    public static void main(String args[])
    {
    	Task_06 task = new Task_06();
    	task.Scan();
    	task.Logic();        
        System.out.println("Longest word = " + maxWord + "\nLength = " + maxLength);
    }
}
