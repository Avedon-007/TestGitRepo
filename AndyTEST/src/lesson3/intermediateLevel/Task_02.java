/*
  Lucky tickets. As you may know tram tickets have numbering in the range from 000 001 to 999 999.
Many people try to find a lucky ticket, where the sum of the first three digits = the sum of the second
three digits. For example, 205 151 is a lucky ticket. Write a program for calculating of how many lucky
tickets people can find in the one roll.
 */

package lesson3.intermediateLevel;

public class Task_02 
{
	public static void main(String[] args) 
	{	
		//Test dataS
		int rengeOfTicketNumbers = 999999;
		//Instantiate new object
		Task_02 luckyTicketNumbers = new Task_02();
		luckyTicketNumbers.searchLuckyNumbers(rengeOfTicketNumbers);		
	}	
		
	public void searchLuckyNumbers(int x)
	{		
		for(int i = 1; i <= x; i++)
		{
			int b = i % 1000; // вычисляю остаток от деления по модулю.(то есть, забераю число после запятой, 
								//а число перед запятой не учитываю).
			int b1 = b % 10;
			int b2 = b / 10;			
			int b3 = b2 % 10;			
			int b4 = b2 / 10;			
			int sum2 = b1 + b3 + b4;
			
			int a = i / 1000; /* вычисляю неполное целое число с помощью обычного деления. так как 
								переменная А у нас INT, то получим только целое число без округления.
								(то есть, забераю число перед запятой, а число после запятой неучитываю).*/
			int a1 = a % 10;
			int a2 = a / 10;
			int a3 = a2 % 10;
			int a4 = a2 / 10;			
			int sum1 = a1 + a3 + a4;
						
			if(sum2 == sum1)
			{
				System.out.println("This is lucky number: " + a4 + a3 + a1 + b4 + b3 + b1);
			}
			else
			{
				//System.out.println("This is NOT lucky number: " + a4 + a3 + a1 + b4 + b3 + b1);
			}			
		}		
	}	
}

