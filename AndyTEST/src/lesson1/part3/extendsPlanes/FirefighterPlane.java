package lesson1.part3.extendsPlanes;

import lesson1.part2.Planes;


public class FirefighterPlane extends Planes 
{
				private int waterTank;		
				private int crew;				

	public FirefighterPlane(){}
	
	public FirefighterPlane(String color, int waterTank, int crew, int numberOfEngines)
	{
		this.color = color;
		this.waterTank = waterTank;
		this.crew = crew;
		this.numberOfEngines = numberOfEngines;
	}

	public int getWaterTank() {
		return waterTank;
	}

	public void setWaterTank(int waterTank) {
		this.waterTank = waterTank;
	}

	public int getCrew() {
		return crew;
	}

	public void setCrew(int crew) {
		this.crew = crew;
	}
	
	public static void main(String[] args)
	{
		FirefighterPlane An32P = new FirefighterPlane("red-white", 7, 3, 2);
		System.out.println("Color of fire fighter plane is: " + An32P.getColor());
		System.out.println("Water tank capacity is: " + An32P.getWaterTank() + "t");
		System.out.println("Crew is: " + An32P.getCrew());
		System.out.println("Number of engines is: " + An32P.getNumberOfEngines());
		
	}
}

/*
public void openHatch() {}
public void turnOnHeadLight() {}


*/