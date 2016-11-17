package lesson3.beginnerLevel;

public class Task_11 {

	
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
				xPosition++;
				yPosition--;
			}
			else 
			{
				xPosition--;
				yPosition++;
			}
			
			if((directionFlag = true) && (yPosition< 0)) // upper border
			{
				yPosition++;
				directionFlag = false;
				
			}
			if((directionFlag = true) && (xPosition> dimension-1))	// right wall(border)
			{
				xPosition--;
				yPosition+=2;
				directionFlag = false;
			}
			if((directionFlag = false) && (yPosition > dimension-1)) // bottom border
			{
				yPosition--;
				directionFlag = true;
				
			}
			if((directionFlag = false) && (xPosition < 0))	// left wall(border)
			{
				xPosition++;
				yPosition-=2;
				directionFlag = true;
			}
			System.out.println("current number is " + i);
			System.out.println("xPosition=" + xPosition);
			System.out.println("yPositiony=" + yPosition);

			myArray[xPosition][yPosition] = i;
		}
		
		
		return myArray;
	}
	
	public void showArray(int[][] myArray)
	{
		for(int x[]:myArray)
		{
			for(int y: x)
			{
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

	
	
	
	public static void main(String[] args) 
	{
		Task_11 superArray = new Task_11();
		superArray.showArray(superArray.createArray(10));
	}

}
