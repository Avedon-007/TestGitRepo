package Advanced;


public class Task_03 
{
	public static void main(String[] args)
	{
		boolean isFalse = false;
		
		// подключаю метод metricsCalculation() из класса Task_03_Metrics_Calculation
		Task_03_Metrics Metrics = new Task_03_Metrics();
		Metrics.metricsCalculation();
		
		// подключаю переменные из класса Task_03_Metrics_Calculation
		int total = Task_03_Metrics.getTotal();
		int fail = Task_03_Metrics.getFail();
		int unrez = Task_03_Metrics.getUnrez();
		int unrezHigh = Task_03_Metrics.getUnrezHigh();
		int unrezBC = Task_03_Metrics.getUnrezBC();
		int unrezB = Task_03_Metrics.getUnrezB();
		
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
}
