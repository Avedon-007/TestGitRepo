package lesson1.part3.extendsPlanes;

//import lesson1.part2.Planes;


public class Airliner extends lesson1.part2.Planes 
{
	private int seatAirliner;		
	private int crewAirliner;
			
	public Airliner(){}
	
	public Airliner(int seatAirliner, int crewAirliner)
	{
		this.seatAirliner = seatAirliner;
		this.crewAirliner = crewAirliner;
	}

	public int getSeatAirliner() {
		return seatAirliner;
	}

	public void setSeatAirliner(int seatAirliner) {
		this.seatAirliner = seatAirliner;
	}

	public int getCrewAirliner() {
		return crewAirliner;
	}

	public void setCrewAirliner(int crewAirliner) {
		this.crewAirliner = crewAirliner;
	}	
}

/*
public void openChassis() {}
public void turnRight() {}
public void turnLeft() {}

*/