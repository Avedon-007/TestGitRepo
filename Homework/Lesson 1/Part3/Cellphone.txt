abstract class Cellphone extends TouchScreenDevices {
			private String logo;		
			private String speaker;
			private String simCardSlot;
	
	public String getLogo() {
		return logo;
		}
	public void setLogo(String newLogo) {
		logo=newLogo;
		}		
			
	public String getSpeaker() {
		return speaker;
		}
	public void setSpeaker(String newSpeaker) {
		speaker=newSpeaker;
		}		
	
	public String getSimCardSlot() {
		return simCardSlot;
		}
	public void setSimCardSlot(String newSimCardSlot) {
		simCardSlot=newSimCardSlot;
		}		
			
	public void charge() {}
	public void call() {}
	
}