abstract class Tablet extends TouchScreenDevices {
			private String logo;		
			private String wiFi;
			private String flashCard;
	
	public String getLogo() {
		return logo;
		}
	public void setLogo(String newLogo) {
		logo=newLogo;
		}		
			
	public String getWiFi() {
		return wiFi;
		}
	public void setWiFi(String newWiFi) {
		wiFi=newWiFi;
		}		
			
	public String getFlashCard() {
		return flashCard;
		}
	public void setFlashCard(String newFlashCard) {
		flashCard=newFlashCard;
		}	
			
	public void charge() {}
	public void surfInternet() {}
	
}