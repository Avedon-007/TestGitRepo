package Intermediate_level;
import java.util.Scanner;

public class Task_07
{
	private static int m, n, c, d;
	private static int first[][];
	private static int second[][];
	private static int sum[][];
	
	public Task_07()
	{
		int m, n, c, d;
		int first[][];
		int second[][];
		int sum[][];
	}
	
	public void Logic()
	{
		System.out.println("Enter the number of rows and columns of matrix:");
		Scanner scan = new Scanner(System.in);
		m = scan.nextInt();
	    n = scan.nextInt();
		int first[][] = new int[m][n];
	    int second[][] = new int[m][n];
	    int sum[][] = new int[m][n];
	    
	    System.out.println("Enter the elements of first matrix:");
		 
	      for (  c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	            first[c][d] = scan.nextInt();
	 
	      System.out.println("Enter the elements of second matrix:");
	 
	      for ( c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	            second[c][d] = scan.nextInt();
	 
	      for ( c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	             sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' to subtract matrices	
	      
		 System.out.println("Sum of entered matrices:-");
		 
	      for ( c = 0 ; c < m ; c++ )
	      {
	         for ( d = 0 ; d < n ; d++ )
	            System.out.print(sum[c][d]+"\t");
	 
	         System.out.println();
	      }
	}
	
	public static void main(String args[])
	{
	      Task_07 task = new Task_07();	     
	      task.Logic();	     
	}
}
