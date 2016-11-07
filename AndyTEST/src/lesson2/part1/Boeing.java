package lesson2.part1;

import lesson1.part2.Planes;


public class Boeing extends Planes 
{
		private double lengthPlane;				
		private int crewNumber;
		
	public Boeing(){}
	
	public Boeing(String type, String engineType, int maxVelocity, double lengthPlane, int crewNumber)
	{
		this.type = type;
		this.engineType = engineType;
		this.maxVelocity = maxVelocity;
		this.lengthPlane = lengthPlane;
		this.crewNumber = crewNumber;
	}
		
	public double getLengthPlane() {
		return lengthPlane;
	}

	public void setLengthPlane(double lengthPlane) {
		this.lengthPlane = lengthPlane;
	}

	public int getCrewNumber() {
		return crewNumber;
	}

	public void setCrewNumber(int crewNumber) {
		this.crewNumber = crewNumber;
	}

	public static void main(String[] args){
		
		Boeing Boeing_747_100B = new Boeing("Airliner", "Jet engine", 800, 102.45, 2);
		
		System.out.println("   BOEING 747-100B");
		System.out.println("Type of aircraft: "+ Boeing_747_100B.getType());
		System.out.println("Engines type: "+ Boeing_747_100B.getEngineType());		
		System.out.println("Max. velocity: "+ Boeing_747_100B.getMaxVelocity() +" km/h");		
		System.out.println("Length of plane is: "+ Boeing_747_100B.getLengthPlane() +" m");
		System.out.println("Number of crew: "+ Boeing_747_100B.getCrewNumber());
	}
		
}
/*
 public void turnRight() {}
	public void turnLeft() {}	
		
		
	public 	Boeing() {
		
		type = "Airliner";
		engineType = "Jet engine";
		numberOfEngines = 4;
		maxVelocity = 955;
		length = 70.6;
		maxTakeoffWeight = 334;
		crew = 3;
	}
	
	*/
