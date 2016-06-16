abstract class CargoPlane extends Planes {
				private String deck;		
				private String crew;
				private String belt;
				
	public String getDeck() {
		return deck;
		}
	public void setDeck(String newDeck) {
		deck=newDeck;
		}			
	
	public String getCrew() {
		return crew;
		}
	public void setCrew(String newCrew) {
		crew=newCrew;
		}			
				
	public String getBelt() {
		return belt;
		}
	public void setBelt(String newBelt) {
		belt=newBelt;
		}			
				
	public void openDeckDoor() {}
	public void turnLight() {}

}