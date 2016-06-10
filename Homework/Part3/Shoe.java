abstract class Shoe extends Clothes {
			private String shoelace;		
			private String insoles;
			private String toe;
	
	public String getShoelace() {
		return shoelace;
		}
	public void setShoelace(String newShoelace) {
		shoelace=newShoelace;
		}		
			
	public String getInsoles() {
		return insoles;
		}
	public void setInsoles(String newInsoles) {
		insoles=newInsoles;
		}		
			
	public String getToe() {
		return toe;
		}
	public void setToe(String newToe) {
		toe=newToe;
		}		
			
	public void toTieShoelace() {}
	public void fitInsoles() {}
	
}
