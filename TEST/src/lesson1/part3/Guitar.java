package lesson1.part3;

import lesson1.part2.MusicInstruments;

abstract class Guitar extends MusicInstruments 
{
			private String guitarBrandName;		
			private String stringsQuantity;
			private String beltMaterial;
	
	public Guitar(){}
	
	public Guitar(String guitarBrandName, String stringsQuantity)
	{
		this.guitarBrandName = guitarBrandName;
		this.stringsQuantity = stringsQuantity;
	}

	public String getGuitarBrandName() {
		return guitarBrandName;
	}

	public void setGuitarBrandName(String guitarBrandName) {
		this.guitarBrandName = guitarBrandName;
	}

	public String getStringsQuantity() {
		return stringsQuantity;
	}

	public void setStringsQuantity(String stringsQuantity) {
		this.stringsQuantity = stringsQuantity;
	}

	public String getBeltMaterial() {
		return beltMaterial;
	}

	public void setBeltMaterial(String beltMaterial) {
		this.beltMaterial = beltMaterial;
	}

	
	
	
}

/*
public void  pullStrings() {}
public void fitBelt() {}


*/