public class Apple extends CustomerGoods {
			private String foodType;			
			private String color;
			private String taste;
			private double price;
			
	public String getFoodType() {
		return foodType;
		}
	public void setFoodType(String newFoodType) {
		foodType=newFoodType;
		}
	public String getFruitType() {
		return color;
		}
	public void setColor(String newColor) {
		color=newColor;
		}
	public String getTaste() {
		return taste;
		}
	public void setTaste(String newTaste) {
		taste=newTaste;
		}
	
	public double getPrice(){
		return price;
	}
	public void setPrice(double newPrice){
		price = newPrice;
	}
	
	public void wash() {}
	public void eat(){}	 

	
	//*Constructor
	//*creating several objects

	public Apple(String gt, String col, String ts, double pr) {

			 foodType = gt;
			 color = col;
			taste = ts;
			price = pr;
			
// Also we can add:  	System.out.println(gt+" "+col+" "+ts+" "+pr);
// It will be printed as string				
								
}

	public static void main(String[] args){

		Apple redApple=new Apple("Friut","red","sweet", 12.5 );

		System.out.println(">>Constructor<<");
		System.out.println("RED APPLE:");
		System.out.println(redApple.foodType);
		System.out.println(redApple.color);
		System.out.println(redApple.taste);
		System.out.println(redApple.price +"$");

		Apple greenApple=new Apple("Friut","green","sour", 10.39 );

		System.out.println(">>Constructor<<");
		System.out.println("GREEN APPLE:");
		System.out.println(greenApple.foodType);
		System.out.println(greenApple.color);
		System.out.println(greenApple.taste);
		System.out.println(greenApple.price +"$");
	}
}