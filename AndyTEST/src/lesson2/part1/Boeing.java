
public class Boeing extends Planes {

		private String type;
		private String engineType;
		private int numberOfEngines;
		private int maxVelocity;
		private double length;
		private int maxTakeoffWeight;		
		private int crew;
		
		
		
	public String getType() {
			return type;
	}
 	public void setType(String newType) {
 			type = newType;
 	}
 	
 	public String getEngineType() {
 			return engineType;
 	}
	public void setEngineType(String newEngineType) {
			engineType = newEngineType;
	}
	
	public int getNumberOfEngines() {
			return numberOfEngines;
	}
	public void setNumberOfEngines(int newNumberOfEngines) {
			numberOfEngines = newNumberOfEngines;
	}
	
	public int getMaxVelocity() {
			return maxVelocity;
	}
	public void setMaxVelocity(int newMaxVelocity) {
		maxVelocity = newMaxVelocity;
	}
	
	public double getLength(){
		return length;
	}
	public void setLength(double newLength) {
		length = newLength;
	}
		
	public int getMaxTakeoffWeight(){
		return maxTakeoffWeight;
	}
	public void setMaxTakeoffWeight(int newMaxTakeoffWeight) {
		maxTakeoffWeight = newMaxTakeoffWeight;
	}
		
	public int getCrew() {
		return crew;
	}
	public void setCrew(int newCrew) {
		crew = newCrew;
	}		
	
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
		
	
	public static void main(String[] args){
		
		Boeing Boeing_747_100B = new Boeing();
		
		System.out.println("   BOEING 747-100B");
		System.out.println("Type: "+ Boeing_747_100B.type);
		System.out.println("Engine: "+ Boeing_747_100B.engineType);
		System.out.println("Number of engines: "+ Boeing_747_100B.numberOfEngines);
		System.out.println("Max. velocity: "+ Boeing_747_100B.maxVelocity +" km/h");
		System.out.println("Chassis: "+ Boeing_747_100B.length +" m");
		System.out.println("Max. carrying weight: "+ Boeing_747_100B.maxTakeoffWeight +" kg");
		System.out.println("Crew: "+ Boeing_747_100B.crew);
	}
		
}
