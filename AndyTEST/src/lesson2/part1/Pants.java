package lesson2.part1;

import lesson1.part2.Clothes;


public class Pants extends Clothes 
{
	private String brandName;
	private String dateOfProduction;
		
	public Pants(){}
	
	public Pants(String brandName, String fabric, String color, double price)
	{
		this.brandName = brandName;
		this.fabric = fabric;
		this.color = color;
		this.price = price;
	}
	
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getDateOfProduction() {
		return dateOfProduction;
	}

	public void setDateOfProduction(String dateOfProduction) {
		this.dateOfProduction = dateOfProduction;
	}

	public static void main(String[] args)
	{		
		Pants jeansPants = new Pants("D&G", "Cotton", "Dark blue", 34.99);		
		System.out.println("   JAENS PANTS");
		System.out.println("Brand name is: "+ jeansPants.getBrandName());
		System.out.println("Fabric is: "+ jeansPants.getFabric());
		System.out.println("Color is: "+ jeansPants.getColor());
		System.out.println("Price is: "+ jeansPants.getPrice() +"$");		
	}	
}

/*

public void wear() {}
public void wash() {}
public void dry() {}
public void clean() {}


public Pants() {
fabric = "Cotton";
style = "Straight";
size = "M";
color = "Dark blue";
price = 34.99;
}
*/