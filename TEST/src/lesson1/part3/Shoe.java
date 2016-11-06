package lesson1.part3;

import lesson1.part2.Clothes;

abstract class Shoe extends Clothes 
{
			private String shoelaceMaterial;		
			private String insolesMaterial;
			private String toeMaterial;
	
	public Shoe(){}
	
	public Shoe(String style, String shoelaceMaterial, String insolesMaterial, String toeMaterial)
	{
		this.style = style;
		this.shoelaceMaterial = shoelaceMaterial;
		this.insolesMaterial = insolesMaterial;
		this.toeMaterial  =toeMaterial;
	}

	public String getShoelaceMaterial() {
		return shoelaceMaterial;
	}

	public void setShoelaceMaterial(String shoelaceMaterial) {
		this.shoelaceMaterial = shoelaceMaterial;
	}

	public String getInsolesMaterial() {
		return insolesMaterial;
	}

	public void setInsolesMaterial(String insolesMaterial) {
		this.insolesMaterial = insolesMaterial;
	}

	public String getToeMaterial() {
		return toeMaterial;
	}

	public void setToeMaterial(String toeMaterial) {
		this.toeMaterial = toeMaterial;
	}
			
	
	
}
/*
public void toTieShoelace() {}
public void fitInsoles() {}
*/