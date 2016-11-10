/*
 Print all even numbers from range (0..50). Try to solve this in more than one way
 */

package lesson3.beginnerLevel;

public class Task_06 {

	public void showAllEvenNumbersMethod1() {
		for (int i = 0; i <= 50; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public void showAllEvenNumbersMethod2() {
		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0)
				System.out.print(i + " ");
		}
		System.out.println();
	}

	public void showAllEvenNumbersMethod3() {
		// use Do While
	}

	public static void main(String[] args) {
		Task_06 task = new Task_06();
		task.showAllEvenNumbersMethod1();
		task.showAllEvenNumbersMethod2();

	}
}