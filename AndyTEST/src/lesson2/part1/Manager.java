package lesson2.part1;

import lesson1.part2.WorkerOfCompany;


public class Manager extends WorkerOfCompany 
{	
		private String haircutType;		
		private String clothesStyle;
		
	public Manager(){}
	
	public Manager(String nameWorker, String clothesStyle, int age, int salary)
	{
		this.nameWorker = nameWorker;
		this.clothesStyle = clothesStyle;
		this.age = age;	
		this.salary = salary;
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
			Manager saleManager = new Manager("Garry Mogan", "Casual", 29, 600);			
			System.out.println("   Sale manager");
			System.out.println("Name of worker is: "+ saleManager.getNameWorker());
			System.out.println("Age of worker is: "+ saleManager.getAge());
			System.out.println("Clothes style: "+ saleManager.getClothesStyle());
			System.out.println("Salary of worker is: "+ saleManager.getSalary() + "$");
	}	
}



/*
public void doHaircut() {}
public void askForHolidays() {}
public void sale() {}

public Manager() {
	
	haircutType = "Classic";
	clothesStyle = "Business";	
}
*/