package lesson4.framework;

public class Runner 
{
	public static void main(String[] args) 
	{
		TestEnvironment myInstance = new TestEnvironment();

		  myInstance.initialiseEnvironmentVariables();

		  myInstance.createEnvironment();

		  myInstance.runTests();
	}
}
