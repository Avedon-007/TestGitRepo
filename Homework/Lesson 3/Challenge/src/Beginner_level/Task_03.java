package Beginner_level;

import java.util.Scanner;

public class Task_03 {

	public static void main(String[] args){
		
		boolean isMultiple = false;
		
		System.out.print("Введите первое число: ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int number1 = scanner.nextInt();
		
		int remainder1 = number1 % 3;
		
		if(number1 > 0 && remainder1 == 0){
			isMultiple = true;
			System.out.println(isMultiple);
			System.out.println("Число " + number1 + " кратное 3.");		
			}
		
		if(number1 > 0 && (remainder1 = number1 % 5) == 0){
			isMultiple = true;
			System.out.println(isMultiple);
			System.out.println("Число " + number1 + " кратное 5.");
		}
		
		else{
			System.out.println(isMultiple);
			System.out.println("Число " + number1 + " не кратное 3 или 5.");
		}
		
	}
}
