package lesson1.part3;

import lesson1.part2.WorkerOfCompany;

class Cleaner extends WorkerOfCompany 
{
			private String uniformType;		
			private String glovesType;
			private String tools;
	
	public Cleaner(){}
	
	public Cleaner(String nameWorker, String gender, String uniformType, String glovesType, String tools)
	{
		this.nameWorker = nameWorker;
		this.gender = gender;
		this.uniformType = uniformType;
		this.glovesType = glovesType;
		this.tools = tools;
	}

	public String getUniformType() {
		return uniformType;
	}

	public void setUniformType(String uniformType) {
		this.uniformType = uniformType;
	}

	public String getGlovesType() {
		return glovesType;
	}

	public void setGlovesType(String glovesType) {
		this.glovesType = glovesType;
	}

	public String getTools() {
		return tools;
	}

	public void setTools(String tools) {
		this.tools = tools;
	}
	
	public static void main(String[] args)
	{
		Cleaner cleanerRoberto = new Cleaner("Roberto", "Male", "Cleaning suit", "Cleaning gloves", "Mop");
		System.out.println("Name of clener is: " + cleanerRoberto.getNameWorker());
		System.out.println("The uniform type of cleaner is: " + cleanerRoberto.getUniformType());
		System.out.println("The gloves type of cleaner is: " + cleanerRoberto.getGlovesType());
		System.out.println("Gender of Jose is: " + cleanerRoberto.getGender());		
		System.out.println("Tools of cleaner is: " + cleanerRoberto.getTools());
		
	}		
	 
}


/*
 public void askForSalary() {}
 
public void askForHolidays() {}
public void clean() {}	
*/