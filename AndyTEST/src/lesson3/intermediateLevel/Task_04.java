/*
 	Sum of numbers in the string. Given a string. Write a method which returns the sum of the numbers appearing in the string, 
 	ignoring all other characters. Provide all necessary checks. Example:
					yourMethod("krm236abw") -> 11
					yourMethod("aa49b55") -> 23
 */


package lesson3.intermediateLevel;


public class Task_04   // Sum of numbers in the string.
{			
	public static void main(String[] args) 
	{
		//Test data
		String testString = "bh46hbhj5b5h";
		//Instantiate new object
		Task_04 task = new Task_04();
		//Method application		
		System.out.println("The sum of digits in the string is: " + task.countSumOfDigitsInString(testString));
	}
	
	public int countSumOfDigitsInString(String testString)
	{
		int sum = 0;		
		for(int i =0; i < testString.length(); i++)
		{
			if(Character.isDigit(testString.charAt(i)))
			{
				int num = Integer.valueOf(testString.substring(i, i+1)).intValue();
				int[] array = new int[testString.length()];  // буферный массив. в него записываем выбранные числа из строки.
				array[i] = num;  
				sum += array[i];
				//System.out.println(num); // проверка, вывожу только цифры.
			}			
		}
		return sum;
	}
}
