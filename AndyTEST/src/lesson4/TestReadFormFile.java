package lesson4;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class TestReadFormFile {

	//public static void main(String[] args) throws IOException
	private static void testReadFromFile() throws IOException
	{
		// Specify path to your file
		File file = new File("testReadFile.txt");

		// Create special input stream for reading data
		FileInputStream fInput = new FileInputStream(file);

		// Construct BufferedReader from InputStreamReader
		BufferedReader buff = new BufferedReader(new InputStreamReader(fInput));

		// Print all existing lines from file to the console
		String line = null;
		while ((line = buff.readLine()) != null) 
		{
			System.out.println(line);
		}
		buff.close();
	}
}