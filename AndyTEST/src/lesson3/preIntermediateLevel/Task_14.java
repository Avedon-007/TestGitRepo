/*
 	Write a method which takes a word and prints it like a diagonal matrix. See example:
Input: “Test”
Output: T
		 e
		  s
		   t
 */

package lesson3.preIntermediateLevel;


public class Task_14 	// Вывести слово в диагональной матрице
{	
	public static void main(String[] args) 
	{		
		//Teas data
		String word = "Test";
		//INstantiate new object
		Task_14 task = new Task_14();
		//Method application
		//task.createDiagonalMatrix(word);
		task.showArray(task.createDiagonalMatrix(word));
	}	
		
		
		
		private char[][] createDiagonalMatrix(String word) 
		{
			char[] myArrayChar = word.toCharArray(); //convert String to char array
			
			//Create Matrix with filling of data from char array
			char[][] myArrayMatrix = new char[myArrayChar.length][myArrayChar.length];
			boolean directionFlag = true;
			char space = ' ';
			int xPosition = 0;
			int yPosition = 0;
			
		/	 for(int i = 0; i <= myArrayChar.length * myArrayChar.length; i++)
			{
				if(xPosition == 0 && yPosition == 0) 	// Set 0,0 element in Matrix
				{
					myArrayMatrix[xPosition][yPosition] = myArrayChar[0];					
					yPosition ++;
				}
				else if(directionFlag == true) 			//Set next element in Matrix moving down
				{
					if(xPosition != yPosition)
					{
					myArrayMatrix[xPosition][yPosition] = space;
					yPosition ++;
					}
					else
					{
						myArrayMatrix[xPosition][yPosition] = myArrayChar[i];						
						yPosition ++;
					}
				}
				else 									//Set next element in Matrix moving up
				{
					if(xPosition != yPosition)
					{
						myArrayMatrix[xPosition][yPosition] = space;
						yPosition --;
					}
					else
					{
						myArrayMatrix[xPosition][yPosition] = myArrayChar[i];
						yPosition --;
					}
				}
				if((directionFlag == true) && (yPosition > myArrayChar.length-1))  // Bottom border
				{
					xPosition ++;
					yPosition --;
					directionFlag = false;
					if(xPosition == yPosition)
					{
						myArrayMatrix[xPosition][yPosition] = myArrayChar[i];
						yPosition --;
					}
					else
					{
						myArrayMatrix[xPosition][yPosition] = space;
						yPosition --;
					}
				}
				else if((directionFlag == false) && (yPosition < 0))				// Upper border
				{
					xPosition ++;
					yPosition ++;
					directionFlag = true;
					myArrayMatrix[xPosition][yPosition] = space;
				}
				
				
				
				
				System.out.println(myArrayMatrix[i]);
				//xPosition ++;
				//yPosition ++;
			}
			return myArrayMatrix;
			
			//myArrayMatrix[xPosition][yPosition] = i;
		}

		public void showArray(char[][] myArrayMatrix)
		{		
			for(char x[]: myArrayMatrix)
			{			
				for(char y: x)
				{		
					System.out.print(y + " ");
				}
				System.out.println();
			}
		}	

	
}

/*

public class Task_14 	// Вывести слово в диагональной матрице
{
	private static Scanner sc1;
	
	public static void main(String[] args) 
	{		
		String word;
		char[] arrayWord;
		String s = "  ";
		String s1 = "";
		
		System.out.print("Enter the word: ");
		sc1 = new Scanner(System.in);
		word = sc1.nextLine();
		
		arrayWord = word.toCharArray();		
		
		System.out.println(arrayWord[0]);
		
		for(int i = 1; i < arrayWord.length; i++)
		{
			s1 = s1 + s;			
			System.out.println(s1 + arrayWord[i]);
		}					
	}
}

*/