package lesson3.beginnerLevel;

public class Task_01 
{	
	private static int[] numbers;
	private static int factor;
	
	public Task_01()
	{
		numbers = new int[]{1,2,3,4,5};
		factor = 3;
	}	
	
	public void multiply()
	{
		Task_01 task = new Task_01();
		task.setFactor(2);  // можно задать множитель
		
		for (int i = 0; i < numbers.length; i++){
			numbers[i] = numbers[i] * factor;
			System.out.print(numbers[i]);
			System.out.print(" ");
		}
	}
	public void setFactor(int factor)
	{
		this.factor = factor;
	}
	public static void main(String[] args)
	{
		Task_01 task = new Task_01();
		task.multiply();   // вывожу метод multiply() на экран, так как в нём есть 	System.out.println(numbers[i])
	}
}
