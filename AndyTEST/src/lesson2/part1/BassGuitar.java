package lesson2.part1;
import lesson1.part2.MusicInstruments;


public class BassGuitar extends MusicInstruments 
{
			private String beltMaterial;
			private int stringsNumber;
			private String brandName;
			private double bassGuitarPrice;
			
	public BassGuitar(){}
			
	public BassGuitar(String brandName, int stringsNumber, String powerSource, String beltMaterial, double bassGuitarPrice)
	{
		this.brandName = brandName;
		this.stringsNumber = stringsNumber;
		this.powerSource = powerSource;
		this.beltMaterial = beltMaterial;
		this.bassGuitarPrice = bassGuitarPrice;
	}		
	
	public String getBeltMaterial() {
		return beltMaterial;
	}

	public void setBeltMaterial(String beltMaterial) {
		this.beltMaterial = beltMaterial;
	}

	public int getStringsNumber() {
		return stringsNumber;
	}

	public void setStringsNumber(int stringsNumber) {
		this.stringsNumber = stringsNumber;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getBassGuitarPrice() {
		return bassGuitarPrice;
	}

	public void setBassGuitarPrice(double bassGuitarPrice) {
		this.bassGuitarPrice = bassGuitarPrice;
	}

	public static void main(String[] args)
	{		
		BassGuitar SandbergTT = new BassGuitar("Sandberg TT", 4, "Electric", "Leather", 1299.99);			
			System.out.println("   SANDBERG TT:");
			System.out.println("Brand name of Instrument: " + SandbergTT.getBrandName());
			System.out.println("Number of strings of Instrument: " + SandbergTT.getStringsNumber());
			System.out.println("Power source of Instrument: " + SandbergTT.getPowerSource());
			System.out.println("Belt material of Instrument: " + SandbergTT.getBeltMaterial());
			System.out.println("Price of Instrument: " + SandbergTT.getBassGuitarPrice());
		}	
}
/*
 * public void makeSound() {}
	public void startPlay() {}
	public void fitBelt() {}
	
	
	
	public Bass_guitar(){
		typeOfInstrument = "String";
		material = "Wood and metal";
		powerSource = "Electric";
		weight = 12;
		belt = "Leather";
		strings = 4;
		logo = "Sandberg";
		price = 1200.0;
	}
	*/
