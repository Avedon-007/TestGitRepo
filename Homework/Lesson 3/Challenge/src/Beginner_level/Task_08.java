package Beginner_level;

public class Task_08 
{
	public static void main(String[] args) 
	{
		 String word = new String("Supercalifragilisticexpialidocious");
		 int n = 5;
		 
		 for(int i = n; i >= 0; i--)
		 {			
			 for(int k = i; k > 0; k--)
			 {			 
				 System.out.print(word.substring(0, k));
			 }		
			 System.out.println(word.substring(34));
		 }
	}
}
