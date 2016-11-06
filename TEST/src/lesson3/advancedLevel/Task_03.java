package Advanced;


public class Task_03 
{
	private static boolean isFalse = false;
	private static int total;
	private static int fail;
	private static int unrez;
	private static int unrezHigh;
	private static int unrezBC;
	private static int unrezB;
	
	public Task_03()
	{
		isFalse = false;
		int total;
		int fail;
		int unrez;
		int unrezHigh;
		int unrezBC;
		int unrezB;		
	}
	
	public void Logic()
	{
		// подключаю метод metricsCalculation() из класса Task_03_Metrics
		Task_03_Metrics Metrics = new Task_03_Metrics();
		Metrics.metricsCalculation();
				
		// подключаю переменные из класса Task_03_Metrics
		total = Task_03_Metrics.getTotal();
		fail = Task_03_Metrics.getFail();
		unrez = Task_03_Metrics.getUnrez();
		unrezHigh = Task_03_Metrics.getUnrezHigh();
		unrezBC = Task_03_Metrics.getUnrezBC();
		unrezB = Task_03_Metrics.getUnrezB();
				
		 //if(fail < (int)((total * 20f) / 100f) && unrezHigh < 10 && unrezBC < 5 && unrezB < unrezBC && unrezB < (int)((unrez * 5f) / 100f))
		if(fail < (int)((total * 20f) / 100f))
		{
			if(unrezHigh < 10)
				if(unrezBC < 5)
					if(unrezB < unrezBC && unrezB < (int)((unrez * 5f) / 100f))
						System.out.println("Build is STABLE.");
					else
					{
						System.out.println("Build is NOT STABLE.");
						System.out.println("More than 5% unresolved Blocker issues of complete issues number.");
					}
				else
				{
					System.out.println("Build is NOT STABLE.");
					System.out.println("More than 5 unresolved issues with Blocker/Critical severity.");
				}
			else
			{
				System.out.println("Build is NOT STABLE.");
				System.out.println("More than 10 unresolved issues.");
			}	
		}
		else 
		{	
			System.out.println("Build is NOT STABLE.");
			System.out.println("More than 20% of failed test cases.");
		}		
	}
	
	
	
	public static void main(String[] args)
	{
		Task_03 task = new Task_03();
		task.Logic();		
	}
}
