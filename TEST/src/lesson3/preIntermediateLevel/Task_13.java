package Pre_intermediate_level;
import java.util.Scanner;

public class Task_13 		// ax2 + bx + c = 0 , при a != 0
{                                   
	private static Scanner sc1;
	private static Scanner sc2;
	private static Scanner sc3;
	
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
