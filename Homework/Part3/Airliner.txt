
abstract class Airliner extends Planes {
			private int seat;		
			private int crew;
			
	
	public int getSeat() {
		return seat;
		}
	public void setSeat(int newSeat) {
		seat=newSeat;
		}
	public int getCrew() {
		return crew;
		}
	public void setCrew(int newCrew) {
		crew=newCrew;
		}
	public void openChassis() {}
	public void turnRight() {}
	public void turnLeft() {}

}