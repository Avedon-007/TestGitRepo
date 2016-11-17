/*
 Create a method (program) which returns True if the given non-negative number is a multiple of

3 or a multiple of 5
 */
/*
 rewrite like task 1 and task 2 
 */
package lesson3.beginnerLevel;



public class Task_03 
{
	public boolean checkNumbersFromArray(int num)
	{			
		int	remainder3 = num % 3;
		int	remainder5 = num % 5;
					
		return ( num >= 0 && (remainder3 == 0 ||  remainder5 == 0))? true: false;
	}	
			
	public static void main(String[] args)
	{		
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10, -3, -5, 15}; 
		Task_03 task = new Task_03();
		System.out.println(" Create a method (program) which returns True"
							+ " \n if the given non-negative number is a multiple of "
							+ "3 or a multiple of 5");		
		for(int newNum: num)
			System.out.println("For number " + newNum + " result is " + task.checkNumbersFromArray(newNum));
	}	
}

