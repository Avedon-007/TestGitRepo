/*
 Given an array of integers. Create a method (program) which takes two arguments - this array

and number that you are looking for - and returns quantity of this number in the array
 */

package lesson3.beginnerLevel;


public class Task_04
{

	private void showArray(int[] numbers)  /* private - becouse only for internal usage. */
	{
		for(int element: numbers)
			System.out.print(element + " ");
		System.out.println();
	}
	
	
	public void countNumbersInArray(int[] myArray, int[] myNumbers )
	{
		int quantityOfNumbers;
		System.out.print("Initial array is " );
		showArray(myArray);
		
		System.out.print("numbers which we will search in array are ");
		showArray(myNumbers);		
		
		for(int myNumber: myNumbers)
		{
			quantityOfNumbers = 0;
			for(int element: myArray)
			{
				if(element == myNumber)quantityOfNumbers++;
			}
			System.out.println("Quantity of number " + myNumber + " is " + quantityOfNumbers);
		}			
	}	
	
	
	public static void main(String[] args)
	{
		int[] myArray = {1,5,6,9,4,7,0,8,7,3,2,5,8,2,1,0,6,8};
		int[] myNumbers = {1, 2, -12, 3, 4, 5, 6, 7, 8, 9, 0};
		
		Task_04 task = new Task_04();
		task.countNumbersInArray(myArray, myNumbers);
					
	}
}
