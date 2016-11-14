package lesson1.part3.extendsWorkerOfCompany;

import lesson1.part2.WorkerOfCompany;

class Bookkeeper extends WorkerOfCompany 
{
			private String haircutType;		
			private String dressType;
			private String tools;
	
	public Bookkeeper(){}
	
	public Bookkeeper(String nameWorker, String haircutType, String dressType, String tools)
	{
		this.nameWorker = nameWorker;
		this.haircutType = haircutType;
		this.dressType = dressType;
		this.tools = tools;
	}

	public String getHaircutType() {
		return haircutType;
	}

	public void setHaircutType(String haircutType) {
		this.haircutType = haircutType;
	}

	public String getDressType() {
		return dressType;
	}

	public void setDressType(String dressType) {
		this.dressType = dressType;
	}

	public String getTools() {
		return tools;
	}

	public void setTools(String tools) {
		this.tools = tools;
	}
	
	public static void main(String[] args)
	{
		Bookkeeper bookkeeperSuisy = new Bookkeeper("Suisy", "Care haircut", "Long dress", "Calculater");
		System.out.println("Name of bookkeeper is: " + bookkeeperSuisy.getNameWorker());
		System.out.println("Haircut is: " + bookkeeperSuisy.getHaircutType());
		System.out.println("Dress type is: " + bookkeeperSuisy.getDressType());
		System.out.println("Tool is: " + bookkeeperSuisy.getTools());	
	}		
	
}

/*
public void doHaircut() {}
public void askForHolidays() {}
public void count() {}	 


*/