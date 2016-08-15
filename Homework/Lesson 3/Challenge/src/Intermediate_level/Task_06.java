package Intermediate_level;
import java.util.*;

public class Task_06    // the longest word in string 
{
	private static Scanner sc1;
	
    public static void main(String args[])
    {
    	String sentence;   // variable for whole sentence
    	String word;   // variable for 1 word
    	String maxWord = ""; // variable for longest word    	
    	
        sc1 = new Scanner(System.in);
        System.out.print("Enter any sentence: ");
        sentence = sc1.nextLine();
        
        //finding the length of the sentence
              
        int count;   // variable for counting letters in word
        int maxLength = 0;
        
        StringTokenizer str = new StringTokenizer(sentence,"; ? ' . : , !"); //converting String into StringTokenizer object
        int c = str.countTokens(); 
        
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
        System.out.println("Longest word = " + maxWord + "\nLength = " + maxLength);
    }
}
