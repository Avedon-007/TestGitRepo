package lesson2.part1;

import lesson1.part2.WorkerOfCompany;


public class HR extends WorkerOfCompany 
{
	private String haircutType;		
	private String clothesStyle;
	
	public HR(){}
	
	public HR(String nameWorker, String haircutType, String clothesStyle)
	{
		this.nameWorker = nameWorker;
		this.haircutType = haircutType;
		this.clothesStyle = clothesStyle;
	}
	
	public String getHaircutType() {
		return haircutType;
	}

	public void setHaircutType(String haircutType) {
		this.haircutType = haircutType;
	}

	public String getClothesStyle() {
		return clothesStyle;
	}

	public void setClothesStyle(String clothesStyle) {
		this.clothesStyle = clothesStyle;
	}

	public static void main(String[] args)
	{		
		HR hrManager = new HR("Sara Rods", "Short haircut", "Business");		
		System.out.println("   HR");
		System.out.println("HR name is: "+ hrManager.getNameWorker());
		System.out.println("Hairecut type: "+ hrManager.getHaircutType());
		System.out.println("Clothes style: "+ hrManager.clothesStyle);		
	}
}

/*
 * 
	public void doHaircut() {}
	public void askForHolidays() {}
	
	
	public HR() {
		
		haircutType = "Classic";
		clothesStyle = "Business";	
	}
	*/
