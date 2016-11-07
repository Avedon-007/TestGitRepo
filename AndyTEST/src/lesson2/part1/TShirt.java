package lesson2.part1;

import lesson1.part2.Clothes;


public class TShirt extends Clothes 
{		
	private String brandName;	
	private String neckType;
		
	public TShirt(){}
	
	public TShirt(String brandName, String color, String neckType, double price)
	{
		this.brandName = brandName;
		this.neckType = neckType;
		this.color = color;
		this.price = price;
	}
		
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getNeckType() {
		return neckType;
	}

	public void setNeckType(String neckType) {
		this.neckType = neckType;
	}

	public static void main(String[] args)
	{		
		TShirt footballTShirt = new TShirt("Nike", "Blue", "Round neck", 49.99);		
		System.out.println("   T-SHIRT");
		System.out.println("Brand name of T-Shirt is: " + footballTShirt.getBrandName());
		System.out.println("Neck type is: "+ footballTShirt.getNeckType());		
		System.out.println("Color of T-Shirt is: "+ footballTShirt.getColor());
		System.out.println("Price: "+ footballTShirt.getPrice() +"$");
	}	
}

/*
public void wear() {}
public void wash() {}
public void dry() {}


public TShirt() {
fabric = "Nylon";
neck = "Round";
size = "XL";
color = "Orang";
price = 24.99;
}
*/