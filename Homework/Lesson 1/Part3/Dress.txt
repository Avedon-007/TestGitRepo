abstract class Dress extends Clothes {
			private String belt;		
			private String buttons;
			private String lace;
	
	public String getBelt() {
		return belt;
		}
	public void setBelt(String newBelt) {
		belt=newBelt;
		}		
			
	public String getButtons() {
		return buttons;
		}
	public void setButtons(String newButtons) {
		buttons=newButtons;
		}
	
	public String getLace() {
		return lace;
		}
	public void setLace(String newLace) {
		lace=newLace;
		}
	
	public void zipUp() {}
	public void tieBelt() {}
	
}
