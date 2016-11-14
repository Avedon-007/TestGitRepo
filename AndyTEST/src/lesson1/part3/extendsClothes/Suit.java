package lesson1.part3.extendsClothes;

import lesson1.part2.Clothes;

public class Suit extends Clothes 
{
			private String tieColor;		
			private String shirtColor;
			private String pantsColor;
	
	public Suit(){}
	
	public Suit(String tieColor, String shirtColor, String pantsColor)
	{
		this.tieColor = tieColor;
		this.shirtColor = shirtColor;
		this.pantsColor = pantsColor;
	}
			
	public String getTieColor() {
		return tieColor;
	}

	public void setTieColor(String tieColor) {
		this.tieColor = tieColor;
	}

	public String getShirtColor() {
		return shirtColor;
	}

	public void setShirtColor(String shirtColor) {
		this.shirtColor = shirtColor;
	}

	public String getPantsColor() {
		return pantsColor;
	}

	public void setPantsColor(String pantsColor) {
		this.pantsColor = pantsColor;
	}

	public static void main(String[] args){
		
	Suit smokingSuit = new Suit("Black", "White", "Black");		
	System.out.println("Color of tie is: " + smokingSuit.getTieColor());
	System.out.println("Color of shirt is: " + smokingSuit.getShirtColor());
	System.out.println("Color of pants is: " + smokingSuit.getPantsColor());
	
	smokingSuit.setShirtColor("Black");
	System.out.println("NEW color of shirt is: " + smokingSuit.getShirtColor());
		
		}
	
}
/*
public void toTieATie() {}
public void clean() {}
*/