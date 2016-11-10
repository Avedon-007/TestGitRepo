/*
 There are several marks in the school: from 1 to 5 (the highest). Create a method (program)

which takes a mark and return your result (for ex. "Excellent", "Good", "Failed" etc.). Please do

not use if...else condition
 */

package lesson3.beginnerLevel;

public class Task_05 {

	public void showMarksNames(int[] myMarks) {
		String marksName;

		for (int mark : myMarks) {

			switch (mark) {
			case 1:
				marksName = "Very poor";
				break;
			case 2:
				marksName = "Poor";
				break;
			case 3:
				marksName = "Average";
				break;
			case 4:
				marksName = "Good";
				break;
			case 5:
				marksName = "Excellent";
				break;
			default: 
				marksName = "Invalid mark";
				break;
			}
		System.out.println("Name for mark " + mark + " is " + marksName);	
		}
	}

	public static void main(String[] args) {

		int[] myMarks = { 0, 1, 2, 3, 7, 0, 4, 5, 6 };

		Task_05 task = new Task_05();
		task.showMarksNames(myMarks);
		
	}
}
