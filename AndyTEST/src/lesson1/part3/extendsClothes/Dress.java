package lesson1.part3.extendsClothes;

import lesson1.part2.Clothes;

class Dress extends Clothes 
{
			private String beltMaterial;		
			private String buttonsColor;
			
	
	public Dress(){}
	
	public Dress(String beltMaterial, String buttonsColor, String fabric)
	{
		this.beltMaterial = beltMaterial;
		this.buttonsColor = buttonsColor;
		this.fabric = fabric;
	}

	public String getBeltMaterial() {
		return beltMaterial;
	}

	public void setBeltMaterial(String beltMaterial) {
		this.beltMaterial = beltMaterial;
	}

	public String getButtonsColor() {
		return buttonsColor;
	}

	public void setButtonsColor(String buttonsColor) {
		this.buttonsColor = buttonsColor;
	}
	
	public static void main(String[] args)
	{
		
		Dress cocktailDress = new Dress("Cotton", "Black", "Silk");
		
		System.out.println(">>Cocktail dress<<");
		System.out.println("The material of the dress is: " + cocktailDress.getFabric());
		System.out.println("The material of the belt is: " + cocktailDress.getBeltMaterial());
		
		System.out.println("Color of buttons is: " + cocktailDress.getButtonsColor());
					
	}
	
}

/*
public void zipUp() {}
public void tieBelt() {}

*/