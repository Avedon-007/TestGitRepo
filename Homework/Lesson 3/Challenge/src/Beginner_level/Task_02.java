package Beginner_level;

public class Task_02 {
		
	
	public static void main(String[] args){	
		 int x = 5;
		 int y = 4;
		 boolean isTrue = false;
		
		if(x == 10){
			isTrue = true;
			System.out.println("x=10 " + isTrue);
			
		}
		
		if(y == 10){
			isTrue = true;
			System.out.println("y=10 " + isTrue);
			
		}
		
		if(x + y == 10){
			isTrue = true;
			System.out.println("x+y=10 " + isTrue);
			
		}
		else {
			System.out.println(isTrue);
		}
	}
}