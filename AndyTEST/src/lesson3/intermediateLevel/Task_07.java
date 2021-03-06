/*
 	Addition of matrices. Add two matrix according to the common math rules and print the output to
the console.
 */

package lesson3.intermediateLevel;


public class Task_07
{	
	public void addTwoMatrices(int[][]first, int[][]second)
	{		
	/	int sum[][] = new int[2][2];			
		//int sum[][] = null;
		
		for (int c = 0; c < first.length; c++ )
		{
			for (int d = 0; d < first[c].length; d++ )
			{	        	 
				sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' to subtract matrices
			}
		}
		 System.out.println("Sum of entered matrices:");
		 
	     for (int c = 0; c < sum.length; c++)
	     {
	        for (int d = 0; d < sum[c].length; d++)
	        {	        	 
	           System.out.print(sum[c][d]+"\t");
	        }
	        System.out.println();
	     }	      
	}
	
	public static void main(String args[])
	{
	    //Test data
		int[][] first = {{1, 2}, 
						 {3, 4}};
		int[][] second = {{4, 3}, 
						  {2, 1}};
		//Initiate new object
		Task_07 task = new Task_07();	
		//Method application
	      task.addTwoMatrices(first, second);	     
	}
}

/*
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
*/