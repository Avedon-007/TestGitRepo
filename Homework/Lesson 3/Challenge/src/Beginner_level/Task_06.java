package Beginner_level;



public class Task_06 
{
    
	private static int[] range;
	
	public Task_06()
	{
		range = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,
				20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,
				38,39,40,41,42,43,44,45,46,47,48,49,50};
	}

	public static void main(String[] args)
	{	
		Task_06 task = new Task_06();
	/*	//------------ method #1 -------------------------
	 	for(int i = 2; i <= range.length; i=i+2)
	 	{
			System.out.println(range[i]);			
		}
		 */		
		//----------- method #2 --------------------------
		for(int j = 0; j < range.length; j++)
		{	
			if (range[j] != 0 && (range[j] % 2) == 0)			
				System.out.println(range[j]);			
		}		
	}    
}