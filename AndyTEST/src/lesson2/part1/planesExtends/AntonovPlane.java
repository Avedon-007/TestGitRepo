package lesson2.part1.planesExtends;

import lesson1.part2.Planes;


public class AntonovPlane extends Planes 
{		
		private int maxCarrying;		
		private int crew;
	
	public AntonovPlane(){}
	
	public AntonovPlane(String type, String engineType, int maxVelocity, int maxCarrying, int crew)
	{
		this.type = type;
		this.engineType = engineType;
		this.maxVelocity = maxVelocity;
		this.maxCarrying = maxCarrying;
		this.crew = crew;
	}
			
	public int getMaxCarrying() 
	{
		return maxCarrying;
	}

	public void setMaxCarrying(int maxCarrying) 
	{
		this.maxCarrying = maxCarrying;
	}

	public int getCrew()
	{
		return crew;
	}

	public void setCrew(int crew) 
	{
		this.crew = crew;
	}

	public static void main(String[] args)
	{		
		AntonovPlane An32 = new AntonovPlane("Cargo airplane", "Turboprop engine", 510, 7, 3);		
		System.out.println("   AN32");
		System.out.println("Airplane type: "+ An32.getType());
		System.out.println("Engine type: "+ An32.getEngineType());		
		System.out.println("Max. velocity: "+ An32.getMaxVelocity() +" km/h");		
		System.out.println("Max. carrying weight: "+ An32.getMaxCarrying() +" tonnes");
		System.out.println("Crew: "+ An32.getCrew());
	}
}

/*
 * public void openDeckDoor() {}
	public void turnLight() {}
	
	============================================
	
	type = "Cargo airplane";
		engineType = "Turboprop engine";
		numberOfEngines = 2;
		maxVelocity = 810;
		numberOfChassis = 3;
		maxCarrying = 7;
		crew = 3;
	
	*/
