abstract class Apple extends CustomerGoods {
			private String foodType;			
			private String fruitType;
			private String taste;
	
	public String getFoodType() {
		return foodType;
		}
	public void setFoodType(String newFoodType) {
		foodType=newFoodType;
		}
	public String getFruitType() {
		return fruitType;
		}
	public void setFruitType(String newFruitType) {
		fruitType=newFruitType;
		}
	public String getTaste() {
		return taste;
		}
	public void setTaste(String newTaste) {
		taste=newTaste;
		}
	public void wash() {}
	public void eat(){}	 
}