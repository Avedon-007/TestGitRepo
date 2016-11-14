package lesson2.part1.musicInstrumentsExtends;

import lesson1.part2.MusicInstruments;


public class Flute extends MusicInstruments 
{			
			private int valveNumber;
			private String brandName;
			private double flutePrice;
	
	public Flute(){}
	
	public Flute(String typeOfInstrument, String brandName, int valveNumber, double flutePrice)
	{
		this.typeOfInstrument = typeOfInstrument;
		this.brandName = brandName;
		this.valveNumber = valveNumber;
		this.flutePrice = flutePrice;
	}
		
	public int getValveNumber() {
		return valveNumber;
	}

	public void setValveNumber(int valveNumber) {
		this.valveNumber = valveNumber;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getFlutePrice() {
		return flutePrice;
	}

	public void setFlutePrice(double flutePrice) {
		this.flutePrice = flutePrice;
	}

	public static void main(String[] args)
	{		
		Flute Gemeinhardt2SP = new Flute("Brass", "Gemeinhardt 2SP", 4, 299.99);			
			System.out.println("   Gemeinhardt 2SP:");
			System.out.println("Type Of Instrument: " + Gemeinhardt2SP.getTypeOfInstrument());
			System.out.println("Brand name of flute is: "+ Gemeinhardt2SP.getBrandName());
			System.out.println("Number of valves is: "+ Gemeinhardt2SP.getValveNumber());
			System.out.println("Price is: "+ Gemeinhardt2SP.getFlutePrice() +"$");			
	}	
}
/*
public void makeSound() {}
public void startPlay() {}	

	
public Flute(){
	typeOfInstrument = "Wind instrument";
	material = "Metal";
	powerSource = "Non-Electric";
	weight = 420;
	valve = 4;
	logo = "Gemeinhardt";
	price = 300.0;
}
*/