abstract class Monitor extends TouchScreenDevices {
			private String logo;		
			private String connector;
			private String webCamera;
	
	public String getLogo() {
		return logo;
		}
	public void setLogo(String newLogo) {
		logo=newLogo;
		}	
			
	public String getConnector() {
		return connector;
		}
	public void setConnector(String newConnector) {
		connector=newConnector;
		}		
			
	public String getWebCamera() {
		return webCamera;
		}
	public void setWebCamera(String newWebCamera) {
		webCamera=newWebCamera;
		}		
						
	public void show() {}
	public void turnOn() {}
	
}