package Intermediate_level;
import java.util.*;

public class Task_08 
{
	private static Scanner sc1;	
	
	static String splitCamelCase(String str)  // метод дл€ разбиени€ ¬ерблюжей записи на слова
	{
		return str.replaceAll(String.format("%s|%s|%s", 
								"(?<=[A-Z])(?=[A-Z][a-z])", 
								"(?<=[^A-Z])(?=[A-Z])", 
								"(?<=[A-Za-z])(?=[^A-Za-z])" ), 
								" " 
								);
	}	
	
	public static void main(String[] args) 
	{
		String str;
		String newStr = "";		
		char newChar = ' ';		
		
		System.out.print("Enter CamelCase string: ");
		
		sc1 = new Scanner(System.in);
		str = sc1.nextLine();
	
		char[] buf = splitCamelCase(str).toCharArray(); // перевожу строку в буквенный массив
		
		for(int i = 0; i < buf.length; i++)
		{			
			char ch = buf[i];
			if(i == 0)     //1. первый символ переводим в верхний регистр
			{
				newChar = Character.toUpperCase(ch);
			}
			else if(i > 0)  //2. все последующие символы переводим в нижний регистр
			{
				if(ch == ' ') //3. пробел (чтобы пробел попал в массив)
				{
					newChar = ' ';
				}								
				else if(Character.isUpperCase(ch))					
				{					 
					newChar = Character.toLowerCase(ch);									
				}	
				else if(Character.isLowerCase(ch))
				{
					newChar = Character.toLowerCase(ch);
				}
			}	
			buf[i] = newChar;		// присваиваю элементам массива изменЄнные буквы						
		}	
		newStr = String.valueOf(buf); // перевожу массив обратно в строку
		System.out.print(newStr);
	}
}
