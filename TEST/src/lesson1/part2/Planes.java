package lesson1.part2;

public class Planes 
{
	protected String type;
	protected String engineType;
	protected int numberOfEngines;
	protected String color;
	private String comfort;
	private String materials;
	protected int maxVelocity;
	private int maxFlightWeight;
	private int numberOfChassis;
	private int fuelTanks;
	
	//CONSTRUCTORs//
	
	public Planes(){}
	
	public Planes(String type, String engineType, int maxVelocity, int maxFlightWeight)
	{
		this.type = type;
		this.engineType = engineType;
		this.maxVelocity = maxVelocity;
		this.maxFlightWeight = maxFlightWeight;
	}
		
	public String getType() 
	{
		return type;
	}
	public void setType(String type) 
	{
		this.type = type;
	}
	public String getEngineType()
	{
		return engineType;
	}
	public void setEngineType(String engineType) 
	{
		this.engineType = engineType;
	}
	public int getNumberOfEngines() 
	{
		return numberOfEngines;
	}
	public void setNumberOfEngines(int numberOfEngines) 
	{
		this.numberOfEngines = numberOfEngines;
	}
	public String getColor() 
	{
		return color;
	}
	public void setColor(String color) 
	{
		this.color = color;
	}
	public String getComfort() 
	{
		return comfort;
	}
	public void setComfort(String comfort)
	{
		this.comfort = comfort;
	}
	public String getMaterials()
	{
		return materials;
	}
	public void setMaterials(String materials) 
	{
		this.materials = materials;
	}
	public int getMaxVelocity()
	{
		return maxVelocity;
	}
	public void setMaxVelocity(int maxVelocity)
	{
		this.maxVelocity = maxVelocity;
	}
	public int getMaxFlightWeight() 
	{
		return maxFlightWeight;
	}
	public void setmMaxFlightWeight(int maxFlightWeight) 
	{
		this.maxFlightWeight = maxFlightWeight;
	}
	public int getNumberOfChassis()
	{
		return numberOfChassis;
	}
	public void setNumberOfChassis(int numberOfChassis) 
	{
		this.numberOfChassis = numberOfChassis;
	}
	public int getFuelTanks() 
	{
		return fuelTanks;
	}
	public void setFuelTanks(int fuelTanks) 
	{
		this.fuelTanks = fuelTanks;
	}
		

	public static void main(String[] args)
	{
		Planes planeAntonov124 = new Planes("Cargo", "Jet", 800, 400);
		System.out.println("Type of Antonov plane An-124 is: " + planeAntonov124.getType());
		System.out.println("Engine type of Antonov plane An-124 is: " + planeAntonov124.getEngineType());
		System.out.println("Max velocity of Antonov plane An-124 is: " + planeAntonov124.getMaxVelocity() + "km");
		System.out.println("Max flight weight of Antonov plane An-124 is: " + planeAntonov124.getMaxFlightWeight() + "t");		
	}	
}

/*
public void fly() {}

*/