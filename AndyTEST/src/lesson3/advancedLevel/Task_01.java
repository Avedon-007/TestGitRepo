/*
 Password generator. Apple ID requires a password strong enough to protect your account, data and

money. It's difficult to come up a good example of password which meets the following requirements

from Apple:

- should include uppercase and lowercase Latin letters

- should include digit (-s)

- should be at least 8 characters.

Please write a program which generates a random password considering the above-mentioned

requirements. Choose the max length of password within reasonable limits (for ex. set mas password's

length = 15)
 */


package lesson3.advancedLevel;

import java.util.Random;

public class Task_01 
{
	public String generatePasswordTemplate(int passwordLength)
	{
		String passwordTemplate = "";
		do{Random random = new Random();
		for(int i = 1; i <=passwordLength; i++ ){
								
			switch (random.nextInt(3)) {
			case 0:
				passwordTemplate += "B";
				break;
			case 1:
				passwordTemplate += "S";
				break;
			case 2:
				passwordTemplate += "N";
				break;			
			}
			
		}} while(checkTemplate(passwordTemplate));
		
		return passwordTemplate; 
	}
	
	
	private boolean checkTemplate(String passwordTemplate) {
		boolean checkResult = true;
		
			// Use Regular Expression to check IF(string contains some letters/characters)
		
		
		return false;
	}


	public static void main(String[] args) 
	{
		Task_01 task = new Task_01();
		System.out.println(task.generatePasswordTemplate(15));
		
		
	}
}

/*
package lesson3.advancedLevel;
import org.apache.commons.lang3.RandomStringUtils;

public class Task_01 
{
	public Task_01()
	{	}
	
	public void Logic()
	{
		for(int i = 0; i < 10; i++)   // создаю 80(10*8) паролей с 8~15-ю знаками.		
			for(int j = 8; j <= 15; j++)
				System.out.println(RandomStringUtils.randomAlphanumeric(j));		
	}
	public static void main(String[] args) 
	{
		Task_01 task = new Task_01();
		task.Logic();
	}
}
*/