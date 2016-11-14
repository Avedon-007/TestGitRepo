package lesson1.part3.extendsWorkerOfCompany;

import lesson1.part2.WorkerOfCompany;

class CEOFounder extends WorkerOfCompany 
{
		private String haircutType;		
		private String suitType;
		private String watchType;
	
	public CEOFounder(){}
	
	public CEOFounder(String nameWorker, String haircutType, String suitType, String watchType, int salary)
	{
		this.nameWorker = nameWorker;
		this.haircutType = haircutType;
		this.suitType = suitType;
		this.watchType = watchType;
		this.salary = salary;
	}

	
	public String getHaircutType() {
		return haircutType;
	}

	public void setHaircutType(String haircutType) {
		this.haircutType = haircutType;
	}

	public String getSuitType() {
		return suitType;
	}

	public void setSuitType(String suitType) {
		this.suitType = suitType;
	}

	public String getWatchType() {
		return watchType;
	}

	public void setWatchType(String watchType) {
		this.watchType = watchType;
	}

	public static void main(String[] args)
	{
		CEOFounder CEOFounderAndrew = new CEOFounder("Mr. Andrew", "Classic", "Business", "Ulyss Nardin", 20000000);
		System.out.println("Name of CEO Founder is: " + CEOFounderAndrew.getNameWorker());
		System.out.println("The haircut of CEO Founder is: " + CEOFounderAndrew.getHaircutType());
		System.out.println("The type of suit is: " + CEOFounderAndrew.getSuitType());
		System.out.println("Brand of watch is: " + CEOFounderAndrew.getWatchType());
		System.out.println("Salary of CEO Founder is: " + CEOFounderAndrew.getSalary() + " $/year");		
	}
}
/*
public void doHaircut() {}
public void manage() {}

*/