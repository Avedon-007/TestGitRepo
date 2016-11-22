/*
 * Reversed array. Write a method which takes an array and returns inverted one.
 
 */

package lesson3.intermediateLevel;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class Task_03 
{
	//===================== 1 метод (использую Аппачевскую библиотеку для автоматического реверса массива) ======
	// ---------------------------- билиотеку добавлю в репозиторий---------------
		public static void main(String[] args)
		{
			int[] array = {1,2,3,4,5,6,7,8,9};			
			System.out.println("There is test array: " + Arrays.toString(array));
			
			ArrayUtils.reverse(array);
			System.out.print("There is reversed test array: ");
			System.out.print(Arrays.toString(array) + " ");
		}
		
		
		/*//============= 2 метод (без использования каких либо дополнительных переменных) ================== 
		static void PrintResult(int[] a) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();  // перенос курсора на след. строку
	    }

		public static void main(String... args) {
			int[] array = {1,2,3,4,5,6,7,8,9};
			for (int i = 0; i < array.length/2; i++) {
				array[i] = array[i] + array[array.length-1-i];
				array[array.length-1-i] = array[i] - array[array.length-1-i];
				array[i] = array[i] - array[array.length-1-i];
			}
			PrintResult(array);
		}
		*/
		
		
		/*	
		//================== 3 метод ( используем буферную переменную) =====================
		
		static void PrintResult(int[] a) 
		{
			for (int i = 0; i < a.length; i++) 
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();    // перенос курсора на след. строку
		}
	    
		public static void main(String... args) 
		{
			// массив у нас только один
			int[] array = {1,2,3,4,5,6,7,8,9};
			// идем по первой половине массива
			for (int i = 0; i < array.length/2; i++)
			{
				// меняем местами эл-т из первой половины
				// с симметричным ему эл-том из второй
				int tmp = array[i];
				array[i] = array[array.length-1-i];
				array[array.length-1-i]=tmp;
				
			}
			PrintResult(array);
			ArrayUtils.reverse(array);
			System.out.print(Arrays.toString(array) + " ");
		}	
		*/
			
}
