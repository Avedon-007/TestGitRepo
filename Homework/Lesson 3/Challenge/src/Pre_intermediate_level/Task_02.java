package Pre_intermediate_level;

public class Task_02 
{
	private static String word;
	private static char[] wordArray;
	private static char bufer;
	private static String newWord;
	
	public Task_02()
	{
		word = "How wants to live foreve";
		char bufer;
		char[] wordArray;
		String newWord;
	}
	
	public void Swap()
	{
		Task_02 task = new Task_02();		
		char[] wordArray = word.toCharArray();		
		bufer = wordArray[0];		
		wordArray[0] = wordArray[wordArray.length - 1];
		wordArray[wordArray.length - 1] = bufer;		
		newWord = new String(wordArray);
	}

	public static void main(String[] args) 
	{
		Task_02 task = new Task_02();		
		task.Swap();					
		System.out.println(newWord);
	}
}
