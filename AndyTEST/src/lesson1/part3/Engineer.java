package lesson1.part3;

import lesson1.part2.WorkerOfCompany;

public class Engineer extends WorkerOfCompany 
{
			private String glassesType;		
			private String suitType;			
	
	public Engineer(){}
	
	public Engineer(String nameWorker, int age, String glassesType, String suitType)
	{
		this.nameWorker = nameWorker;
		this.age = age;
		this.glassesType = glassesType;
		this.suitType = suitType;		
	}

	public String getGlassesType() {
		return glassesType;
	}

	public void setGlassesType(String glassesType) {
		this.glassesType = glassesType;
	}

	public String getSuitType() {
		return suitType;
	}

	public void setSuitType(String suitType) {
		this.suitType = suitType;
	}

	public static void main(String[] args)
	{
		Engineer enginnerMario = new Engineer("Mario", 27, "classic", "business");
		System.out.println("Name of engineer is: " + enginnerMario.getNameWorker());		
		System.out.println("Age of Jose is: " + enginnerMario.getAge());
		System.out.println("Glass type is: " + enginnerMario.getGlassesType());
		System.out.println("Suit type is: " + enginnerMario.getSuitType());		
	}
}
/*

public void askForSalary() {}
public void askForHolidays() {}
public void invent() {}	 

*/