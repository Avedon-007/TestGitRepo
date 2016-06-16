abstract class Guitar extends MusicInstruments {
			private String logo;		
			private String strings;
			private String belt;
	
	public String getLogo() {
		return logo;
		}
	public void setLogo(String newLogo) {
		logo=newLogo;
		}		
			
	public String getStrings() {
		return strings;
		}
	public void setStrings(String newStrings) {
		strings=newStrings;
		}		
	
	public String getBelt() {
		return belt;
		}
	public void setBelt(String newBelt) {
		belt=newBelt;
		}
	
	public void  pullStrings() {}
	public void fitBelt() {}
	
}
