/*
 * Write a method for calculating quadratic equation. It takes a, b, c numbers and print the solution.
 */

package lesson3.preIntermediateLevel;


public class Task_13 		// ax2 + bx + c = 0 , при a != 0
{                                   
	
	
	public static void main(String[] args) 
	{
		//Test data
		int a = 3;
		int b = -6;
		int c = 9;
		//Instantiate new object
		Task_13 task = new Task_13();
		//Method application
		System.out.println("There is quadratic equation ax2 + bx + c = 0");
		System.out.println("If a = " + a + ", b = " + b + " and c = " + c + ", so");
		task.calculateQuadraticEquation(a, b, c);		
		
	}	
	
	public void calculateQuadraticEquation(int a, int b, int c)
	{
		double disc = Math.pow(b, 2) - 4 * a * c;
		System.out.println("Discriminant = " + disc);
		double x1, x2;
			if(disc < 0)
			{
				System.out.println("Discriminant < 0, the equation has no solusion.");
			}
			else if(disc == 0)
			{
				System.out.println("Discriminant = 0, the equation has one real root.");
				x1 = x2 = -(b / (2 * a));
				System.out.println("x1 = x2 = " + x1);
			}
			else  // (Disc > 0)
			{
				System.out.println("Discriminant > 0, the equation has two real root.");
				x1 = (-b - Math.sqrt(disc)) / (2 * a);
				x2 = (-b + Math.sqrt(disc)) / (2 * a);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
	}
}

/*
public static void main(String[] args) 
{
	int a, b, c;
	double x1, x2;
	double disc;
	
	System.out.println("There is quadratic equation ax2 + bx + c = 0");
//--------------------------------------------------------------	
	System.out.print("Enter value of a: ");		
	sc1 = new Scanner(System.in);	
	if(sc1.hasNextInt()) 
	{
		a = sc1.nextInt();			
		if(a == 0)
		{
			System.out.println("a=0, ERROR! Please, enter another value of a.");
			System.exit(0);	
		}
	}
	else 
	{
		a = 0; // присваеваем значение(любое), чтобы компилятор "не ругался". так как, если проверка выше не проходит, то переменной А ни чего не присвоится.
		System.out.println("!!!Error!!! Вы ввели не целое число или символ!");
		System.exit(0);
	}
	
//------------------------------------
	System.out.print("Enter value of b: ");		
	sc2 = new Scanner(System.in);			
	if(sc2.hasNextInt()) 
	{
		b = sc2.nextInt();
	}
	else
	{
		b = 0;  
		System.out.println("!!!Error!!! Вы ввели не целое число или символ!");
		System.exit(0);
	}
//----------------------------------		
							
	System.out.print("Enter value of c: ");		
	sc3 = new Scanner(System.in);			
	if(sc3.hasNextInt()) 
	{
		c = sc3.nextInt();
	}
	else
	{
		c = 0;
		System.out.println("!!!Error!!! Вы ввели не целое число или символ!");
		System.exit(0);
	}

//----------------------------------------				
	disc = Math.pow(b, 2) - 4 * a * c;
	System.out.println("Discriminant = " + disc);
	
		if(disc < 0)
		{
			System.out.println("Discriminant < 0, the equation has no solusion.");
		}
		else if(disc == 0)
		{
			System.out.println("Discriminant = 0, the equation has one real root.");
			x1 = x2 = -(b / (2 * a));
			System.out.println("x1 = x2 = " + x1);
		}
		else  // (Disc > 0)
		{
			System.out.println("Discriminant > 0, the equation has two real root.");
			x1 = (-b - Math.sqrt(disc)) / (2 * a);
			x2 = (-b + Math.sqrt(disc)) / (2 * a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
}	
}
*/