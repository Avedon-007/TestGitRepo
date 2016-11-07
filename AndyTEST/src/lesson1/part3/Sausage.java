package lesson1.part3;

import lesson1.part2.CustomerGoods;

abstract class Sausage extends CustomerGoods 
{
			private String foodType;		
			private String butcheryType;
			private String foodTaste;
	
	public Sausage(){}
	
	public Sausage(String foodType, String butcheryType, String dateOfProduction)
	{
		this.foodType = foodType;
		this.butcheryType = butcheryType;
		this.dateOfProduction = dateOfProduction;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getButcheryType() {
		return butcheryType;
	}

	public void setButcheryType(String butcheryType) {
		this.butcheryType = butcheryType;
	}

	public String getFoodTaste() {
		return foodTaste;
	}

	public void setFoodTaste(String foodTaste) {
		this.foodTaste = foodTaste;
	}
	
	
	
}
/*
public void cut() {}
public void eat(){}	 
*/