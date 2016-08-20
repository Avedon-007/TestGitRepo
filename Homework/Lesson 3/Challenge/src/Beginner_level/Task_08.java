package Beginner_level;

public class Task_08 
{
	private static String word;
	private static int n;
	
	public Task_08()
	{
		word = "Supercalifragilisticexpialidocious";
		n = 5;
	}
	
	public void setNumber(int n)
	{
		this.n = n;
	}
		
	public static void main(String[] args) 
	{
		 Task_08 task = new Task_08();
		 task.setNumber(6);    // можно задать число n
		 
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
