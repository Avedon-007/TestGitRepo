package Pre_intermediate_level;

public class Task_05 {

	public static void main(String[] args) {

		int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
		boolean isLoved = true;
		
				
		for(int i=0; i<array.length; i++){
			
			if(array[i]==7 || array[i] == 9 ){
				
				if (isLoved)
					isLoved = false;
			}
			
		}
		
		if (!isLoved){
			System.out.println("Unloved numbers are present :(" + " " + isLoved);}
		else{
			System.out.println("No unloved numbers :)" + " " + isLoved);}
			
	}
	
}
