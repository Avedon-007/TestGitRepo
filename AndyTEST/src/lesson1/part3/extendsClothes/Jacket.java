package lesson1.part3.extendsClothes;

import lesson1.part2.Clothes;

abstract class Jacket extends Clothes 
{
			private String sleavesType;		
			private String pocketType;
			private String collarType;
	
	public Jacket(){}
	
	public Jacket(String sleavesType, String pocketType, String collarType)
	{
		this.sleavesType = sleavesType;
		this.pocketType = pocketType;
		this.collarType = collarType;
	}

	public String getSleavesType() {
		return sleavesType;
	}

	public void setSleavesType(String sleavesType) {
		this.sleavesType = sleavesType;
	}

	public String getPocketType() {
		return pocketType;
	}

	public void setPocketType(String pocketType) {
		this.pocketType = pocketType;
	}

	public String getCollarType() {
		return collarType;
	}

	public void setCollarType(String collarType) {
		this.collarType = collarType;
	}
	
	
	
}
/*
 * public void zipUp() {}
	public void openPocket() {}
	*/
