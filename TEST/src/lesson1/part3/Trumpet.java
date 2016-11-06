abstract class Trumpet extends MusicInstruments {
			private String logo;		
			private String key;
			private String valve;
	
	public String getLogo() {
		return logo;
		}
	public void setLogo(String newLogo) {
		logo=newLogo;
		}
			
	public String getKey() {
		return key;
		}
	public void setKey(String newKey) {
		key=newKey;
		}		
			
	public String getValve() {
		return valve;
		}
	public void setValve(String newValve) {
		valve=newValve;
		}		
	
	public void pushKey() {}
	public void openValve() {}
	
}
