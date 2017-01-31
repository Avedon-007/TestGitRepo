package lesson4.framework;

public class Runner 
{
	public static void main(String[] args) 
	{
		System.out.println("GETTING STARTED...");
		
		TestEnvironment myInstance = new TestEnvironment();

		  myInstance.initialiseEnvironmentVariables();

		  myInstance.createEnvironment();

		  myInstance.runTests();
		  
		  System.out.println("FINISH!!!");
	}
}
