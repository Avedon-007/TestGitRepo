package Pre_intermediate_level;
import java.util.stream.IntStream;


public class Task_06 
{	
	private static int[] myArray;
	private static int sum;
	private static double avrg;
	
	public Task_06()
	{
		myArray = new int[]{1,2,3,4,5,6,1};
		int sum;
		double avrg;
	}	
	public void MySum()
	{
		sum = IntStream.of(myArray).sum();
	}	
	public void Avrg()
	{
		avrg = sum/myArray.length;
	}
	public static void main(String[] args) 
	{
		Task_06 task1 = new Task_06();
		task1.MySum();
		task1.Avrg();		
		/*	Можно вычислить сумму через цыкл, но так больше кода
		 * int sum = 0;
		 * for(int i = 0; i < myArray.length; i++)
		 * 		sum = sum + myArray[i];
		 */		
		System.out.println("The sum of an array is: " + sum);		
		System.out.println("The arithmetical average is: " + avrg);
	}
}
