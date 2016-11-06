package lesson3.beginnerLevel;

public class Task_02 
{	
	private static int x;
	private static  int y;
	private static int sum;
	private static  boolean isTrue;
	
	public Task_02()
	{
		x = 6;
		y = 4;
		sum = 0;
		isTrue = false;
	}
	
	public void sum()
	{
		sum = x + y;
	}	
	
	public static void main(String[] args)
	{			
		Task_02 task = new Task_02();
		task.sum();
						 
		if(x == 10)
		{			
			isTrue = true;
			System.out.println("x=10 " + isTrue);			
		}		
		else if(y == 10)
		{
			isTrue = true;
			System.out.println("y=10 " + isTrue);			
		}		
		else if(sum == 10)
		{
			isTrue = true;
			System.out.println("x+y=" + sum + " " + isTrue);			
		}
		else 
		{
			isTrue = false;
			System.out.println(isTrue);
		}
	}
}