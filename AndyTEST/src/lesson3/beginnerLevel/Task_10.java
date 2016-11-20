/*
 	Create method which gets a number form 1 to 9 (for example 4) and then prints the follow output:
	For number 4:				For number 3:
	*							*
	**							**
	***							***
	****						**
	***							*
	**
	*
	
 */



/* 
 Try implement only 1 FOR with FLAG attribute
 
 */



package lesson3.beginnerLevel;


public class Task_10 
{
	public void printStarsInOrder(int a)
	{		
		String star = "***********************";
		if(a > 0 && a <= 9)	//Проверяем, чтобы вводимое число было в заданном диапазоне.
		{   								
			for(int i = 1; i < a; i++)											
				System.out.println(star.substring(0, i));
				
			for(int i = a; i > 0; i--)						
				System.out.println(star.substring(0, i));							
		}		
	}	
		
	public static void main(String[] args) 
	{		
		//Test data
		int a = 4;
		//Instantiate new object 
		Task_10 task = new Task_10();
		//Method application
		task.printStarsInOrder(a);			
	}
}

