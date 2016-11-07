package lesson1.part3;

import lesson1.part2.MusicInstruments;

public class Trumpet extends MusicInstruments 
{
			private String brandName;		
			private int keyQuantity;
			private String valveMaterial;
	
	public Trumpet(){}
	
	public Trumpet(String brandName, int keyQuantity, String valveMaterial, String typeOfInstrument)
	{
		this.brandName = brandName;
		this.keyQuantity = keyQuantity;
		this.valveMaterial = valveMaterial;
		this.typeOfInstrument = typeOfInstrument;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getKeyQuantity() {
		return keyQuantity;
	}

	public void setKeyQuantity(int keyQuantity) {
		this.keyQuantity = keyQuantity;
	}

	public String getValveMaterial() {
		return valveMaterial;
	}

	public void setValveMaterial(String valveMaterial) {
		this.valveMaterial = valveMaterial;
	}
	
	public static void main(String[] args)
	{
		Trumpet trumpet1 = new Trumpet("Calicchio", 3, "Bronze", "Brass");
		System.out.println("Brand name of instrument is: " + trumpet1.getBrandName());
		System.out.println("Number of keys of instrument is: " + trumpet1.getKeyQuantity());
		System.out.println("Valve material of instrument is: " + trumpet1.getValveMaterial() + "m");
		System.out.println("Type of instrument is: " + trumpet1.getTypeOfInstrument());		
	}	
}
/*
public void pushKey() {}
public void openValve() {}
*/