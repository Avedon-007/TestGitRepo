package Pre_intermediate_level;

public class Task_05 
{
	private static int[] array;
	private static boolean isLoved;
	
	public Task_05()
	{
		array = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
		isLoved = true;
	}
	
	public void Logic()
	{
		Task_05 task1 = new Task_05();
		
		for(int i=0; i<array.length; i++)
		{			
			if(array[i]==7 || array[i] == 9 )
			{				
				if (isLoved)
					isLoved = false;
			}			
		}
	}
	
	public static void main(String[] args) 
	{
		Task_05 task2 = new Task_05();
		task2.Logic();
		
		if (!isLoved)
			System.out.println("Unloved numbers are present :(" + "\n" + isLoved);			
		else		
			System.out.println("No unloved numbers :)" + "\n" + isLoved);					
	}
}	

