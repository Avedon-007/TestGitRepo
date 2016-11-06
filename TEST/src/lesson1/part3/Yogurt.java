abstract class Yogurt extends CustomerGoods {
			private String foodType;		
			private String dairyProductType;
			private String taste;
	
	public String getFoodType() {
		return foodType;
		}
	public void setFoodType(String newFoodType) {
		foodType=newFoodType;
		}		
			
	public String getDairyProductType() {
		return dairyProductType;
		}
	public void setDairyProductType(String newDairyProductType) {
		dairyProductType=newDairyProductType;
		}	
			
	public String getTaste() {
		return taste;
		}
	public void setTaste(String newTaste) {
		taste=newTaste;
		}	
	
	public void open() {}
	public void eat(){}	 
}