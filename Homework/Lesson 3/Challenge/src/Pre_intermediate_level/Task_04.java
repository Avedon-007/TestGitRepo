package Pre_intermediate_level;

public class Task_04 // вывести вторую половину массива. если нечётное количество елементов 
						// массива, то вывести и средний елемент тоже.
{
	public static void main(String[] args) 
	{
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		System.out.print('{');
			
		for(int i = array.length/2; i < array.length-1; i++)
		{				
			System.out.print(String.format("%1d, ", array[i]));
		}			
		System.out.print(String.format("%1d}", array[array.length-1]));		
	}
}
