package lesson1.part2;

public class WorkerOfCompany 
{
	protected String nameWorker;
	protected int salary;
	protected int age;
	protected String gender;
	private int height;
	private int weight;
	private String heirColor;
	private String eyesColor;
	private String fragrance; 
	private boolean isChildren;
	private String maritalStatus;
	
	public WorkerOfCompany(){}
	
	public WorkerOfCompany(String nameWorker, int salary, int age, String gender, boolean isChildren, String maritalStatus)
	{
		this.nameWorker = nameWorker;
		this.salary = salary;
		this.age = age;
		this.gender = gender;
		this.isChildren = isChildren;
		this.maritalStatus = maritalStatus;
	}
	
	public String getNameWorker() {
		return nameWorker;
	}

	public void setNameWorker(String nameWorker) {
		this.nameWorker = nameWorker;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getHeirColor() {
		return heirColor;
	}

	public void setHeirColor(String heirColor) {
		this.heirColor = heirColor;
	}

	public String getEyesColor() {
		return eyesColor;
	}

	public void setEyesColor(String eyesColor) {
		this.eyesColor = eyesColor;
	}

	public String getFragrance() {
		return fragrance;
	}

	public void setFragrance(String fragrance) {
		this.fragrance = fragrance;
	}

	public boolean isChildren() {
		return isChildren;
	}

	public void setChildren(boolean isChildren) {
		this.isChildren = isChildren;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
			
	public static void main(String[] args)
	{
		WorkerOfCompany cleanerJose = new WorkerOfCompany("Jose", 150, 55, "male", true, "married");
		System.out.println("Name of clener is: " + cleanerJose.getNameWorker());
		System.out.println("Salary of Jose is: " + cleanerJose.getSalary());
		System.out.println("Age of Jose is: " + cleanerJose.getAge());
		System.out.println("Gender of Jose is: " + cleanerJose.getGender());
		System.out.println("Has Jose children?: " + cleanerJose.isChildren);
		System.out.println("Is jose married?: " + cleanerJose.getMaritalStatus());		
	}	
}

/*
public void run() {}



*/