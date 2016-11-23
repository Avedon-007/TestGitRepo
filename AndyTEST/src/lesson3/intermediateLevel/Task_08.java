/*
 * CamelCaseSeparator. Some testing frameworks can read names of test methods and include them to
the report like a beautiful sentence. As you know, we use camelCaseNamingPolicy during writing our
tests. Please write a method which takes a test name and returns beautiful sentence for report.
Example:
		Input: "checkChangingProfilePicture“
		Output: "Check changing profile picture"
 */



package lesson3.intermediateLevel;


public class Task_08 
{
	
	public String splitCamelCase(String testString)  // метод для разбиения Верблюжей записи на слова
	{
		return testString.replaceAll(String.format("%s|%s|%s", 
								"(?<=[A-Z])(?=[A-Z][a-z])", 
								"(?<=[^A-Z])(?=[A-Z])", 
								"(?<=[A-Za-z])(?=[^A-Za-z])" ), 
								" ");
	}	
	
		
	public void Logic(String testString)
	{
		char[] buf = splitCamelCase(testString).toCharArray(); // перевожу строку в буквенный массив
		String newStr = "";
		char newChar = ' ';	
		for(int i = 0; i < buf.length; i++)
		{			
			char ch = buf[i];
					
			if(i == 0)     //1. первый символ переводим в верхний регистр			
				newChar = Character.toUpperCase(ch);
			
			else if(i > 0)  //2. все последующие символы переводим в нижний регистр
			{
				if(ch == ' ') //3. пробел (чтобы пробел попал в массив)				
					newChar = '*';												
				else if(Character.isUpperCase(ch))								 
					newChar = Character.toLowerCase(ch);			
				else 				
					newChar = ch;				
			}	
			buf[i] = newChar;		// присваиваю элементам массива изменённые буквы						
		}	
		 newStr = String.valueOf(buf); // перевожу массив обратно в строку
		System.out.println(newStr);
	}	
	
	public static void main(String[] args) 
	{
		//Test data
		String testString = "canWeLoveAgaine";
		//Instantiate new object
		Task_08 task = new Task_08();
		//Method application
		//System.out.print("New string: " + );
		task.Logic(task.splitCamelCase(testString));
	}
}

