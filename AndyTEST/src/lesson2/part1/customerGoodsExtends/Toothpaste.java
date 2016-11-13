package lesson2.part1.customerGoodsExtends;

import lesson1.part2.CustomerGoods;


public class Toothpaste extends CustomerGoods 
{	
	private String brandName;
	private String taste;
	private String nonFoodType;
	
	public Toothpaste(){}
	
	public Toothpaste(String brandName, String nonFoodType, String taste, double price)
	{
		this.brandName = brandName;
		this.nonFoodType = nonFoodType;
		this.taste = taste;
		this.price = price;
	}
	
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getNonFoodType() {
		return nonFoodType;
	}

	public void setNonFoodType(String nonFoodType) {
		this.nonFoodType = nonFoodType;
	}

	public static void main(String[] args)
	{		
		Toothpaste colgate = new Toothpaste("Golgate", "Personal care", "Fresh", 1.99);		
		System.out.println("     Colgate toothpaste:");
		System.out.println("Brand name: " + colgate.getBrandName());
		System.out.println("Non-food type: " + colgate.getNonFoodType());
		System.out.println("Taste of toothpaste is: " + colgate.getTaste());		
		System.out.println("Price of toothpaste: " + colgate.getPrice() + "$");		
	}	
}

/*
public void buy() {}
public void spread() {}
public void clean() {}

public Toothpaste() {
	goodsType = "Non-Food";
	color = "White and blue";
	smell = "Mint";
	typeOfPacking = "Plastic tube";
	taste = "Sweet and fresh";
	nonFoodType = "Presonal care";
	price = 3.59;
}
*/