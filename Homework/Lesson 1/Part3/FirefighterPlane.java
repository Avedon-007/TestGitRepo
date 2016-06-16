
abstract class FirefighterPlane extends Planes {
				private String waterTank;		
				private String crew;
				private String radio;

	public String getWaterTank() {
		return waterTank;
		}
	public void setWaterTank(String newWaterTank) {
		waterTank=newWaterTank;
		}			
				
	public String getCrew() {
		return crew;
		}
	public void setCrew(String newCrew) {
		crew=newCrew;
		}			
				
	public String getRadio() {
		return radio;
		}
	public void setRadio(String newRadio) {
		radio=newRadio;
		}			
	
	public void openHatch() {}
public void turnOnHeadLight() {}

}