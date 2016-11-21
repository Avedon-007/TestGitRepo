/*
 You don't like number 7 and number 9. Write a method which checks input array and returns
True if the array doesn't contain your unloved numbers.
 */


package lesson3.preIntermediateLevel;

public class Task_05 
{	
	public boolean searchUnlovedNumbersInArray(int[] testArray)
	{
		boolean unLovedNumber = true;		
		for(int i = 0; i < testArray.length; i++)
		{			
			if((testArray[i] == 7) || (testArray[i] == 9) || (testArray[i] == -7) || (testArray[i] == -9) )
			{				
				if (unLovedNumber)
					unLovedNumber = false;
			}			
		}
		return unLovedNumber;
	}
	
	public static void main(String[] args) 
	{
		//Test data
		int[] testArray = {-7, 0, 1, 2, 3, 4, 5, 6, 8, 10, 11};
		//Instantiate new object
		Task_05 task2 = new Task_05();
		//Method application
		System.out.println("You don't like number 7 and number 9. Write a method which checks input array and returns " + 
"\nTrue if the array doesn't contain your unloved numbers.");
		System.out.println();
		System.out.print("{");
		for(int i = 0; i < testArray.length; i++)
		{
			System.out.print(testArray[i] + " ");
			
		}
		System.out.print("}");
		System.out.println();
		System.out.println("Array hasn't unloved numbers?: " + task2.searchUnlovedNumbersInArray(testArray));				
	}
}	

/*
 * public class Task_05 
{
	
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
*/
