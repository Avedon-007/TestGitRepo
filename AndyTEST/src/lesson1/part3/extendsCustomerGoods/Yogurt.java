package lesson1.part3.extendsCustomerGoods;

import lesson1.part2.CustomerGoods;

public class Yogurt extends CustomerGoods 
{
			private String foodType;		
			private String dairyProductType;
			private String yogurtTaste;
	
	public Yogurt(){}
	
	public Yogurt(String foodType, String dairyProductType, String yogurtTaste, String typeOfPacking, String expiringDate)
	{
		this.foodType = foodType;
		this.dairyProductType = dairyProductType;
		this.yogurtTaste = yogurtTaste;
		this.typeOfPacking = typeOfPacking;
		this.expiringDate = expiringDate;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getDairyProductType() {
		return dairyProductType;
	}

	public void setDairyProductType(String dairyProductType) {
		this.dairyProductType = dairyProductType;
	}

	public String getYogurtTaste() {
		return yogurtTaste;
	}

	public void setYogurtTaste(String yogurtTaste) {
		this.yogurtTaste = yogurtTaste;
	}
	
	public static void main(String[] args)
	{		
		Yogurt yogurt1 = new Yogurt("Dairy product", "Yogurt", "Sweet, sour", "Bottles", "15.11.2016");		
		System.out.println("YOGURT:");
		System.out.println("The type of food is: " + yogurt1.getFoodType());
		System.out.println("The dairy type is: " + yogurt1.getDairyProductType());
		System.out.println("Taste of dairy product is: " + yogurt1.getYogurtTaste());		
		System.out.println("The type of packing is: " + yogurt1.getTypeOfPacking());		
		System.out.println("The expiring date is: " + yogurt1.getExpiringDate());				
	}	 
}
/*
public void open() {}
public void eat(){}	
*/