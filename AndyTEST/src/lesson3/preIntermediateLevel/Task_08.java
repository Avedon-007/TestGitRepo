/*
 Write a method which calculates a sum of first 100 odd elements of Fibonacci sequence.
 */

package lesson3.preIntermediateLevel;

import java.math.BigInteger;

public class Task_08 
{
	public void sumofFibonacciOddElements(BigInteger[] fibo)
	{
		BigInteger oddSum = BigInteger.ZERO;		
		fibo[0]=BigInteger.ZERO;
		fibo[1]=BigInteger.ONE;
		fibo[2]=BigInteger.ONE;
		// filling the array with Fibonacci numbers	
		for(int i = 3; i < fibo.length; i++)
		{			
			fibo[i] = fibo[i-1].add(fibo[i-2]); 					
		}
		// choosing odd numbers only					
		for(int j = 0; j < fibo.length; j++)
		{
			if(fibo[j].mod(new BigInteger("2")).equals(BigInteger.ONE)) 
			{
				oddSum = oddSum.add(fibo[j]);  // counting sum of odd numbers									
			}					
		}	
		System.out.println("Сумма первых 100 нечётных чисел Фибоначи = " + oddSum);
	}
		
	public static void main(String[] args) 
	{
		BigInteger[] fibo = new BigInteger[100];
		
		Task_08 task = new Task_08();
		task.sumofFibonacciOddElements(fibo);					
	}
}
