package lesson1.part3;

import lesson1.part2.MusicInstruments;

class Drum extends MusicInstruments 
{
			private String screwMaterial;		
			private String plasticMaker;
			private String ringMaterial;
	
   public Drum(){}
	
   public Drum(String screwMaterial, String plasticMaker, String ringMaterial, String powerSource)
   {
	   this.screwMaterial = screwMaterial;
	   this.plasticMaker = plasticMaker;
	   this.ringMaterial = ringMaterial;
	   this.powerSource = powerSource;
   }

   public String getScrewMaterial() {
	return screwMaterial;
}

   public void setScrewMaterial(String screwMaterial) {
	this.screwMaterial = screwMaterial;
}

   public String getPlasticMaker() {
	return plasticMaker;
}

   public void setPlasticMaker(String plasticMaker) {
	this.plasticMaker = plasticMaker;
}

   public String getRingMaterial() {
	return ringMaterial;
}

   public void setRingMaterial(String ringMaterial) {
	this.ringMaterial = ringMaterial;
}
			
   public static void main(String[] args)
	{
	   Drum drums1 = new Drum("Chrom", "Tama", "Chrom", "Non-electrical");
	   System.out.println("Screws material is: " + drums1.getScrewMaterial());
	   System.out.println("Plastic maker is: " + drums1.getPlasticMaker());
	   System.out.println("Ring material is: " + drums1.getRingMaterial() + "m");
	   System.out.println("Power source of instrument is: " + drums1.getPowerSource());
	}
	
}

/*
public void hit() {}
public void fitRing() {}

*/