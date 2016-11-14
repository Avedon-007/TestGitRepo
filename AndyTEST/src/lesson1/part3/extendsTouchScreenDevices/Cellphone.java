package lesson1.part3.extendsTouchScreenDevices;

import lesson1.part2.TouchScreenDevices;

class Cellphone extends TouchScreenDevices 
{
			private String logo;		
			private int speakerQuantity;
			private String simCardSlot;
	
	public Cellphone(){}
			
	public Cellphone(String typeOfScreen, String logo, int speakerQuantity, String simCardSlot)
	{
		this.typeOfScreen = typeOfScreen;
		this.logo = logo;
		this.speakerQuantity = speakerQuantity;
		this.simCardSlot = simCardSlot;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public int getSpeakerQuantity() {
		return speakerQuantity;
	}

	public void setSpeaker(int speakerQuantity) {
		this.speakerQuantity = speakerQuantity;
	}

	public String getSimCardSlot() {
		return simCardSlot;
	}

	public void setSimCardSlot(String simCardSlot) {
		this.simCardSlot = simCardSlot;
	}
	
	public static void main(String[] args)
	{
		Cellphone cellphoneSamsungS6 = new Cellphone("AMOLed", "SUMSUNG", 2, "Yes");
		System.out.println("Screen type of Samsung S6 is: " + cellphoneSamsungS6.getTypeOfScreen());
		System.out.println("The logo of Samsung S6 is: " + cellphoneSamsungS6.getLogo());
		System.out.println("There are " + cellphoneSamsungS6.getSpeakerQuantity() + " speakers");
		System.out.println("Has Samsung S6 SIM card slot?: " + cellphoneSamsungS6.getSimCardSlot());
		
	}	
}
/*
public void charge() {}
public void call() {}

*/