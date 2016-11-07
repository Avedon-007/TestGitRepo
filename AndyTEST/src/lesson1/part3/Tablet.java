package lesson1.part3;

import lesson1.part2.TouchScreenDevices;

public class Tablet extends TouchScreenDevices 
{
			private String brandName;		
			private String wiFiStandart;
			private String flashCardFormat;
	
	public Tablet(){}
	
	public Tablet(String typeOfScreen, String brandName, String wiFiStandart, String flashCardFormat)
	{
		this.typeOfScreen = typeOfScreen;
		this.brandName = brandName;
		this.wiFiStandart = wiFiStandart;
		this.flashCardFormat = flashCardFormat;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getWiFiStandart() {
		return wiFiStandart;
	}

	public void setWiFiStandart(String wiFiStandart) {
		this.wiFiStandart = wiFiStandart;
	}

	public String getFlashCardFormat() {
		return flashCardFormat;
	}

	public void setFlashCardFormat(String flashCardFormat) {
		this.flashCardFormat = flashCardFormat;
	}
			
	public static void main(String[] args)
	{
		Tablet maizuTab = new Tablet("IPS", "MAIZU", "N", "MicroSD");
		System.out.println("Brand name of table is: " + maizuTab.getBrandName());
		System.out.println("Wifi standart of tablet is: " + maizuTab.getWiFiStandart());
		System.out.println("Flash card format of tablet is: " + maizuTab.getFlashCardFormat());
		System.out.println("Screen type of tablet is: " + maizuTab.getTypeOfScreen());
	}		
}
/*
public void charge() {}
public void surfInternet() {}

*/