package Pre_intermediate_level;

import java.util.Scanner;

public class Task_03 {

	private static Scanner sc1;
	private static Scanner sc2;
	
	public static void main(String[] args){	
		 int a = 0;
		 int b = 0;
		 boolean isTrue = false;
	//----------------------------------Работаем с числом а --------------------------------------------	
		 System.out.print("Введите челое число (не дробное) а: ");
		 
		 sc1 = new Scanner(System.in);
		
		 if(sc1.hasNextInt()){
			 		a = sc1.nextInt();
		 
			 if(a == 21){
				 isTrue = true;
				 System.out.println("a = " + " " + a + " " + isTrue);
				 }
			 
			 else{
	 			 isTrue = false;
	 			System.out.println("a = " + " " + a + " " + isTrue);
	 		 	}
		 }
//-----------------------------------Работаем с числом b ---------------------------------------------		 
		 System.out.print("Введите челое число (не дробное) b: ");
		 
		 sc2 = new Scanner(System.in);
		
		 if(sc2.hasNextInt()){
			 		b = sc2.nextInt();
		 
		 		 if(b == 21){
		 			 isTrue = true;
		 			 System.out.println("b = " + " " + b + " " + isTrue);
		 		 	}
		 		 else{
		 			 isTrue = false;
		 			System.out.println("b = " + " " + b + " " + isTrue);
		 		 	}
		}
	//------------------------------------------------------------------------------	
		if(a + b == 21){
			isTrue = true;
			System.out.println("a + b = " + " " + (a + b) + " " + isTrue);
			
		}
		else {
			System.out.println(isTrue);
		}
		
	}
		
}
