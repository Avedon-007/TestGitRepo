/*
  The longest word. Write a method which returns the longest word in the input string. Compare only
letters separated by space symbol.
 */
 
package lesson3.intermediateLevel;

import java.util.StringTokenizer;

public class Task_06    // the longest word in string 
{
	
	public void Logic(String sentence)
	{
		String maxWord = "";
		int maxLength = 0;
		int c = 0;
		//finding the length of the sentence       
		StringTokenizer str = new StringTokenizer(sentence,"; ? ' . : , !"); //converting String into StringTokenizer object
        c = str.countTokens();         
        for(int i = 0; i < c; i++)
        {
        	String word = str.nextToken(); //extracting tokens (i.e. words) one at a time
        	int count = word.length();   
        	
            if(count > maxLength) //checking for maximum length
            {
            	maxLength = count;
            	maxWord = word;
            }
        }
        System.out.println("The longest word in sentence is: " + maxWord);
        System.out.println("Number of letters in the longest word in sentence is: " + maxLength);
	}	
	
    public static void main(String args[])
    {
    	//Test data
    	String sentence = "Who wants to live forever?";
    	//Instantiate new object
    	Task_06 task = new Task_06();
    	//Method application
    	task.Logic(sentence);      
    }
}

