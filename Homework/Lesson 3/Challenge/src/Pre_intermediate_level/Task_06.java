package Pre_intermediate_level;
import java.util.stream.IntStream;


public class Task_06 
{	
	public static void main(String[] args) 
	{
		int[] myArray = {1,2,3,4,5,6,1};
		
		double sum = IntStream.of(myArray).sum();
		
		/*	Можно вычислить сумму через цыкл, но так больше кода
		 * int sum = 0;
		 * for(int i = 0; i < myArray.length; i++)
		 * 		sum = sum + myArray[i];
		 */		
		System.out.println("The sum of array is: " + sum);
		
		double avrg = sum/myArray.length;
		
		System.out.println("The arithmetical average is: " + avrg);
	}	
}
