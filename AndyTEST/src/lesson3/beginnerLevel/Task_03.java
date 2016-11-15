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
	public boolean checkNumbers(int num)
	{			
		int	remainder3 = num % 3;
		int	remainder5 = num % 5;
					
		return (  remainder3 == 0 ||  remainder5 == 0)? true: false;
	}	
			
		public static void main(String[] args)
		{		
			int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}; 
			Task_03 task = new Task_03();
			System.out.println(" Create a method (program) which returns True"
					+ " \n if the given non-negative number is a multiple of "
					+ "3 or a multiple of 5");		
			for(int newNum: num)
			{	
				System.out.println("For number " + newNum + " result is " + task.checkNumbers(newNum));
			}
		}
}



/*
private static Scanner scanner;
private static boolean isMultiple;
private static int num;
private static int remainder3;
private static int remainder5;	

public Task_03()
{
	isMultiple = false;
	int remainder3;
	int remainder5;
	int num ;		
}

public void remainder()
{
	Task_03 task1 = new Task_03();
	task1.Scan();
	remainder3 = num % 3;
	remainder5 = num % 5;
}	

public void Scan()
{
	System.out.print("Введите число: ");
	scanner = new Scanner(System.in);
	
	if(scanner.hasNextInt())
		num = scanner.nextInt();
	else
	{	
		System.out.println("ERROR!!! \nThe letters, symbols and float numbers are prohibited! \nPlease choose integer number!");
		System.exit(0);
	}
}
	
public static void main(String[] args)
{						
	Task_03 task = new Task_03();
	task.remainder();		
	
	if(num > 0) 
	{			
		if(remainder3 == 0 && remainder5 == 0)
		{	
			isMultiple = true;
			System.out.println(isMultiple);
			System.out.println("Число " + num + " кратное 3 и 5.");		
		}
		else if(remainder3 == 0 )
		{
			isMultiple = true;
			System.out.println(isMultiple);
			System.out.println("Число " + num + " кратное 3.");	
		}
		else if(remainder5 == 0 )
		{
			isMultiple = true;
			System.out.println(isMultiple);
			System.out.println("Число " + num + " кратное 5.");
		}		
		else
		{
			System.out.println(isMultiple);
			System.out.println("Число " + num + " не кратное 3 или 5.");
		}
	}		
}
*/