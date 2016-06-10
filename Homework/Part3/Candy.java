abstract class Candy extends CustomerGoods {
			private String foodType;		
			private String sweetsType;
			private String taste;
	
	public String getFoodType() {
		return foodType;
		}
	public void setFoodType(String newFoodType) {
		foodType=newFoodType;
		}		
			
				
	public String getSweetsType() {
		return sweetsType;
		}
	public void setSweetsType(String newSweetsType) {
		sweetsType=newSweetsType;
		}		
			
			
	public String getTaste() {
		return taste;
		}
	public void setTaste(String newTaste) {
		taste=newTaste;
		}		
	
	public void uncover() {}
	public void eat(){}	 
}