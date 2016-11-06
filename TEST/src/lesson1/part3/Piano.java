package lesson1.part3;

import lesson1.part2.MusicInstruments;

abstract class Piano extends MusicInstruments 
{
			private String brandName;		
			private int keysQuantity;
			private int pedalsQuantity;
	
	public Piano(){}
	
	public Piano(String brandName, int keysQuantity)
	{
		this.brandName = brandName;
		this.keysQuantity = keysQuantity;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getKeysQuantity() {
		return keysQuantity;
	}

	public void setKeysQuantity(int keysQuantity) {
		this.keysQuantity = keysQuantity;
	}

	public int getPedalsQuantity() {
		return pedalsQuantity;
	}

	public void setPedalsQuantity(int pedalsQuantity) {
		this.pedalsQuantity = pedalsQuantity;
	}
}
/*
public void pushPedal() {}
public void openCover() {}
*/