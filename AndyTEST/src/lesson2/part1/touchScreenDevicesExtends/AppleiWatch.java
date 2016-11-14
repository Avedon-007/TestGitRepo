package lesson2.part1.touchScreenDevicesExtends;

import lesson1.part2.TouchScreenDevices;


public class AppleiWatch extends TouchScreenDevices
{
		private String brandName;		
		private String braceletMaterial;
		
	public AppleiWatch(){}
	
	public AppleiWatch(String brandName, String braceletMaterial)
	{
		this.brandName = brandName;
		this.braceletMaterial = braceletMaterial;
	}	
	
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBraceletMaterial() {
		return braceletMaterial;
	}

	public void setBraceletMaterial(String braceletMaterial) {
		this.braceletMaterial = braceletMaterial;
	}

	public static void main(String[] args)
	{		
		AppleiWatch appleIWatchSport = new AppleiWatch("Apple", "Steel");		
		System.out.println("   Apple iWatch Sport");
		System.out.println("Brand name is: " + appleIWatchSport.getBrandName());
		System.out.println("Bracelet material is: " + appleIWatchSport.getBraceletMaterial());	
	}	
}
/*
 * public void showTime() {}
	public void charge() {}
	*/
