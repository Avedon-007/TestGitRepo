
public class AntonovPlane extends Planes {
		
		private String type;
		private String engineType;
		private int numberOfEngines;
		private int maxVelocity;
		private int numberOfChassis;
		private int maxCarrying;		
		private int crew;
	
	
	public String getType() {
			return type;
	}
 	public void setType(String newType) {
 			type=newType;
 	}
 	
 	public String getEngineType() {
 			return engineType;
 	}
	public void setEngineType(String newEngineType) {
			engineType=newEngineType;
	}
	
	public int getNumberOfEngines() {
			return numberOfEngines;
	}
	public void setNumberOfEngines(int newNumberOfEngines) {
			numberOfEngines=newNumberOfEngines;
	}
	
	public int getMaxVelocity() {
			return maxVelocity;
	}
	public void setMaxVelocity(int newMaxVelocity) {
		maxVelocity=newMaxVelocity;
	}
	
	public int getNumberOfChassis() {
			return numberOfChassis;
	}
	public void setNumberOfChassis(int newNumberOfChassis) {
		numberOfChassis=newNumberOfChassis;
	}

	public int getMaxCarrying() {
		return maxCarrying;
	}
	public void setMaxCarrying(int newMaxCarrying) {
		maxCarrying = newMaxCarrying;
	}

	public int getCrew() {
		return crew;
	}
	public void setCrew(int newCrew) {
		crew=newCrew;
	}		

	public void openDeckDoor() {}
	public void turnLight() {}
	
	
	
	
	
	public AntonovPlane(){
		
		type = "Cargo airplane";
		engineType = "Turboprop engine";
		numberOfEngines = 2;
		maxVelocity = 810;
		numberOfChassis = 3;
		maxCarrying = 7;
		crew = 3;
	}

	public static void main(String[] args){
		
		AntonovPlane An32 = new AntonovPlane();
		
		System.out.println("   AN32");
		System.out.println("Type: "+ An32.type);
		System.out.println("Engine: "+ An32.engineType);
		System.out.println("Number of engines: "+ An32.numberOfEngines);
		System.out.println("Max. velocity: "+ An32.maxVelocity +"km/h");
		System.out.println("Chassis: "+ An32.numberOfChassis);
		System.out.println("Max. carrying weight: "+ An32.maxCarrying +" tonnes");
		System.out.println("Crew: "+ An32.crew);
	}
}
