package lesson1.part3;

import lesson1.part2.CustomerGoods;

public class Apple extends CustomerGoods 
{
			private String foodType;			
			private String foodColor;
			private String foodTaste;
			private double foodPrice;
			
	public Apple(){}
	
	public Apple(String goodsType, String foodType, String foodColor, String foodTaste, double foodPrice)
	{
		this.goodsType = goodsType;
		this.foodType = foodType;
		this.foodColor = foodColor;
		this.foodTaste = foodTaste;
		this.foodPrice = foodPrice;
	}
									
	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getFoodColor() {
		return foodColor;
	}

	public void setFoodColor(String foodColor) {
		this.foodColor = foodColor;
	}

	public String getFoodTaste() {
		return foodTaste;
	}

	public void setFoodTaste(String foodTaste) {
		this.foodTaste = foodTaste;
	}

	public double getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}

	public static void main(String[] args){

		Apple redApple = new Apple("Food", "Friut", "Red", "Sweet", 12.5 );
		System.out.println("RED APPLE:");
		System.out.println("Type of goods: " + redApple.getGoodsType());
		System.out.println("Food type: " + redApple.getFoodType());
		System.out.println("Color: " + redApple.getFoodColor());
		System.out.println("Taste: " + redApple.getFoodTaste());
		System.out.println("Price: " + redApple.getFoodPrice() +"$");
		System.out.println();

		Apple greenApple = new Apple("Food", "Friut", "Green","Sour", 10.39 );
		System.out.println("GREEN APPLE:");
		System.out.println("Type of goods: " + greenApple.getGoodsType());
		System.out.println("Food type: " + greenApple.getFoodType());
		System.out.println("Color: " + greenApple.getFoodColor());
		System.out.println("Taste: " + greenApple.getFoodTaste());
		System.out.println("Price: " + greenApple.getFoodPrice() +"$");
	}
}

/*
public void wash() {}
public void eat(){}	 



*/