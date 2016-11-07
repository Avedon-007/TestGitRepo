package Pre_intermediate_level;

public class Task_11 
{
	public static void main(String[] args) 
	{
		int[] array = {4,6,0,1,2,2,3,1,9,1,2,1,3};
		boolean isSeq = false;
		
		for(int i = 0; i < array.length-2; i++ )
		{
			if(array[i]==1 && array[i+1]==2 && array[i+2]==3)
			{
				//if (isSeq == false) // один раз присваевает ТРУ, если в массиве несколько совпадений
				//{
					isSeq = true;    // а так каждый раз присваевает ТРУ (удобно, если нужно знать количество совпадений
				//}				
			}
		}
		System.out.println(isSeq);
	}
}
