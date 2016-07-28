package Pre_intermediate_level;

import java.math.BigInteger;

public class Task_08 {

	public static void main(String[] args) {

		long[] fibo = new long[100];
		//BigInteger big;
		long oddSum = 0;
		
		
		for(int i = 0; i < fibo.length; i++)
		{
			
			if(i < 2)
			{
				fibo[i] = 1;
			}
			else
			{
				fibo[i] = fibo[i-2] + fibo[i-1];
			}
				// Вывожу массив с последовательностью Фибоначи
				//big = BigInteger.valueOf(fibo[i]);
				System.out.println("fibo[" + i + "]" + BigInteger.valueOf(fibo[i]));
		 
		}
	
			for(int j = 0; j < fibo.length; j++)
			{
				if(fibo[j] % 2 == 1)
				{
					oddSum += fibo[j];
			//System.out.println(fibo[j]);   // вывожу не четные числа, чтобы убедиться
				
				}	
				
			}
			System.out.println("Сумма первых 100 чисел Фибоначи = " + oddSum);
			
	}
}
