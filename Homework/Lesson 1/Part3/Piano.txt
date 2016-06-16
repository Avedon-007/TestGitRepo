abstract class Piano extends MusicInstruments {
			private String logo;		
			private String key;
			private String pedal;
	
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
			
	public String getPedal() {
		return pedal;
		}
	public void setPedal(String newPedal) {
		pedal=newPedal;
		}		
			
	public void pushPedal() {}
	public void openCover() {}
	
}
