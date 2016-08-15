package Pre_intermediate_level;
import java.util.Scanner;

public class Task_14 	// ¬ывести слово в диагональной матрице
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
