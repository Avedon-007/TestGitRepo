abstract class Sausage extends CustomerGoods {
			private String foodType;		
			private String butcheryType;
			private String taste;
	
	public String getFoodType() {
		return foodType;
		}
	public void setFoodType(String newFoodType) {
		foodType=newFoodType;
		}		
			
	public String getButcheryType() {
		return butcheryType;
		}
	public void setButcheryType(String newButcheryType) {
		butcheryType=newButcheryType;
		}		
			
	public String getTaste() {
		return taste;
		}
	public void setTaste(String newTaste) {
		taste=newTaste;
		}		
	
	public void cut() {}
	public void eat(){}	 
}
