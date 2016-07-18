package Beginner_level;

public class Task_01 {
		
	
	public static void main(String[] args){
		int[] numbers = {1,2,3,4,5};
		multiply(numbers, 3);
	}
	
	public static void multiply(int[] values, int factor){
		for (int i = 0; i < values.length; i++){
			values[i] = values[i] * factor;
			System.out.println(values[i]);
		}
	}
}
