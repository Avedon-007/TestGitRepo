package Pre_intermediate_level;

public class Task_02 {

	public static void main(String[] args) {

		String word = new String("How wants to live foreve");
		char bufer ;
		
		char[] wordArray = word.toCharArray();
		
		bufer = wordArray[0];
		
		wordArray[0] = wordArray[wordArray.length - 1];
		wordArray[wordArray.length - 1] = bufer;
		
		String newWord = new String(wordArray);
					
		System.out.println(newWord);

	}

}
