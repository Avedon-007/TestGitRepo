package lesson2.part1.touchScreenDevicesExtends;

import lesson1.part2.TouchScreenDevices;


public class Samsung�ellphone extends TouchScreenDevices 
{		
		private String brandName;		
		private String simCardSlotType;

	public Samsung�ellphone(){}
	
	public Samsung�ellphone(String brandName, String bodyMaterials)
	{
		this.brandName = brandName;
		this.bodyMaterials = bodyMaterials;
	}
			
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getSimCardSlotType() {
		return simCardSlotType;
	}

	public void setSimCardSlotType(String simCardSlotType) {
		this.simCardSlotType = simCardSlotType;
	}

	public static void main(String[] args)
	{		
		Samsung�ellphone samsungS4 = new Samsung�ellphone("Samsung", "Aluminium");		
		System.out.println("Brand name of the cellphone is: "+ samsungS4.getBrandName());
		System.out.println("The material of the phone body is: "+ samsungS4.getBodyMaterials());	
	}	
}

/*
public void charge() {}
public void call() {}



public Samsung_cellphone() {
	
	logo = "Samsung";
	simCardSlot = "Mini SIM-card clot";
}
*/