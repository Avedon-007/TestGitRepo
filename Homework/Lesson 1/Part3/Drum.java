abstract class Drum extends MusicInstruments {
			private String screw;		
			private String plastic;
			private String ring;
	
	public String getScrew() {
		return screw;
		}
	public void setScrew(String newScrew) {
		screw=newScrew;
		}		
			
	public String getPlastic() {
		return plastic;
		}
	public void setPlastic(String newPlastic) {
		plastic=newPlastic;
		}
	
	public String getRing() {
		return ring;
		}
	public void setRing(String newRing) {
		ring=newRing;
		}
			
	public void hit() {}
	public void fitRing() {}
	
}
