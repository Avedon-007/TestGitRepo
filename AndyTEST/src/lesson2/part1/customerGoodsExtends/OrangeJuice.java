package lesson2.part1.customerGoodsExtends;

import lesson1.part2.CustomerGoods;


public class OrangeJuice extends CustomerGoods 
{	
	private String taste;
	private String foodType;
	
	public OrangeJuice(){}
	
	public OrangeJuice(String typeOfPacking, String dateOfProduction, String taste, double price)
	{
		this.typeOfPacking = typeOfPacking;
		this.dateOfProduction = dateOfProduction;
		this.taste = taste;
		this.price = price;
	}
	
	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public static void main(String[] args) 
	{	
		OrangeJuice sandoraJuice = new OrangeJuice("Tetra pack", "11.10.2012", "Sweet, sour", 1.99);		
		System.out.println("   Sandora Orange Juice:");
		System.out.println("Type of packing: "+ sandoraJuice.getTypeOfPacking());
		System.out.println("Date of production: "+ sandoraJuice.getDateOfProduction());
		System.out.println("Taste: "+ sandoraJuice.getTaste());
		System.out.println("Price: "+ sandoraJuice.getPrice() +"$");
	}
}

/*
public void buy() {}
public void pourInGlass() {}
public void drink() {}


public OrangeJuice() {
	goodsType = "Food";
	color = "Orange";
	smell = "Orange";
	typeOfPacking = "Plastic bottle";
	taste = "sweet and sour";
	foodType = "Drinks";
	price = 5.99;
}
*/