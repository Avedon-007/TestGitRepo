package Beginner_level;

import java.util.Scanner;

public class Task_03 {

	public static void main(String[] args){
		
		boolean isMultiple = false;
		
		System.out.print("������� ������ �����: ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int number1 = scanner.nextInt();
		
		int remainder1 = number1 % 3;
		
		if(number1 > 0 && remainder1 == 0){
			isMultiple = true;
			System.out.println(isMultiple);
			System.out.println("����� " + number1 + " ������� 3.");		
			}
		
		if(number1 > 0 && (remainder1 = number1 % 5) == 0){
			isMultiple = true;
			System.out.println(isMultiple);
			System.out.println("����� " + number1 + " ������� 5.");
		}
		
		else{
			System.out.println(isMultiple);
			System.out.println("����� " + number1 + " �� ������� 3 ��� 5.");
		}
		
	}
}
