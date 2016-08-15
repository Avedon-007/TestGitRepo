package Pre_intermediate_level;

import java.math.BigInteger;

public class Task_08 
{
	public static void main(String[] args) 
	{
		BigInteger[] fibo = new BigInteger[100];
		BigInteger oddSum = BigInteger.ZERO;
		
		fibo[0]=BigInteger.ZERO;
		fibo[1]=BigInteger.ONE;
		fibo[2]=BigInteger.ONE;
	
		for(int i = 3; i < fibo.length; i++)
		{			
			fibo[i] = fibo[i-1].add(fibo[i-2]); // filling the array with Fibonacci numbers						
		}
							
		for(int j = 0; j < fibo.length; j++)
		{
			if(fibo[j].mod(new BigInteger("2")).equals(BigInteger.ONE)) // choosing odd numbers only
			{
				oddSum = oddSum.add(fibo[j]);  // counting sum of odd numbers									
			}					
		}			
		System.out.println("Сумма первых 100 нечётных чисел Фибоначи = " + oddSum);		
	}
}
