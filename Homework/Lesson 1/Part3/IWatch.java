abstract class IWatch extends TouchScreenDevices {
			private String logo;		
			private String bracelet;
			private String bluethooth;
	
	public String getLogo() {
		return logo;
		}
	public void setLogo(String newLogo) {
		logo=newLogo;
		}		
			
	public String getBracelet() {
		return bracelet;
		}
	public void setBracelet(String newBracelet) {
		bracelet=newBracelet;
		}
	
	public String getBluethooth() {
		return bluethooth;
		}
	public void setBluethooth(String newBluethooth) {
		bluethooth=newBluethooth;
		}
			
	public void showTime() {}
	public void charge() {}
	
}