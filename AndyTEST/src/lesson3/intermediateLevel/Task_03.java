package Intermediate_level;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class Task_03 
{
	//===================== 1 ����� (��������� ����������� ���������� ��� ��������������� ������� �������) ======
	// ---------------------------- ��������� ������� � �����������---------------
		public static void main(String[] args)
		{
			int[] array = {1,2,3,4,5,6,7,8,9};
			ArrayUtils.reverse(array);
			System.out.print(Arrays.toString(array) + " ");
		}
		
		
		/*//============= 2 ����� (��� ������������� ����� ���� �������������� ����������) ================== 
		static void PrintResult(int[] a) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();  // ������� ������� �� ����. ������
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
		//================== 3 ����� ( ���������� �������� ����������) =====================
		
		static void PrintResult(int[] a) 
		{
			for (int i = 0; i < a.length; i++) 
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();    // ������� ������� �� ����. ������
		}
	    
		public static void main(String... args) 
		{
			// ������ � ��� ������ ����
			int[] array = {1,2,3,4,5,6,7,8,9};
			// ���� �� ������ �������� �������
			for (int i = 0; i < array.length/2; i++)
			{
				// ������ ������� ��-� �� ������ ��������
				// � ������������ ��� ��-��� �� ������
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
