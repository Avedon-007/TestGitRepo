package lesson3.beginnerLevel;

public class Task_11 
{	
	public int[][] createArray(int dimension)
	{
		int[][] myArray = new int[dimension][dimension];
		boolean directionFlag = true;
		int xPosition = 1;
		int yPosition = 0;

		myArray[0][0] = 1;
		myArray[1][0] = 2;

		for(int i = 3; i <= dimension*dimension; i++)
		{
			if(directionFlag == true) 
			{
				xPosition--;
				yPosition++;
			}
			else 
			{
				xPosition++;
				yPosition--;
			}
			if((directionFlag == true) && (yPosition > dimension-1))	// right wall(border)
			{
				xPosition+=2;
				yPosition--;
				directionFlag = false;
			}
			else if((directionFlag == true) && (xPosition < 0)) // upper border
			{
				xPosition++;
				directionFlag = false;				
			}			
			else if((directionFlag == false) && (xPosition > dimension-1)) // bottom border
			{
				yPosition+=2;
				xPosition--;
				directionFlag = true;				
			}
			else if((directionFlag == false) && (yPosition < 0))	// left wall(border)
			{				
				yPosition++;
				directionFlag = true;
			}
		/*   //  Debug
			System.out.println("current number is " + i);
			System.out.println("xPosition=" + xPosition);
			System.out.println("yPositiony=" + yPosition);
		*/
			myArray[xPosition][yPosition] = i;
		}		
		return myArray;
	}
	
	public void showArray(int[][] myArray)
	{		
		for(int x[]: myArray)
		{			
			for(int y: x)
			{		
				if(y < 10)
					System.out.print("  ");
				if(y>9 && y< 100)
					System.out.print(" ");
				System.out.print(y + " ");
				
			}
			System.out.println();
		}
	}	
	
	public static void main(String[] args) 
	{
		Task_11 superArray = new Task_11();
		superArray.showArray(superArray.createArray(16)); // set dimension of array
	}
}
