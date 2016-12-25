package lesson4.test;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TestWriteToFile {

	// public static void main(String[] args)
	public static void testWriteToFile() 
	{
		File file = new File("testWriteToFile_1.txt");
		try 
		{
			PrintWriter output = new PrintWriter(file);
			output.println("Test string");
			output.print(1234567890);
			output.println(" New string");
			output.close();
		} catch (IOException exptn) 
		{
			System.out.printf("ERROR!!! %s\n", exptn);
		}
	}
}
