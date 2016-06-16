abstract class Concert extends Entertainments {
			private String artist;		
			private String light;
			private String scene;
	
	public String getArtist() {
		return artist;
		}
	public void setArtist(String newArtist) {
		artist=newArtist;
		}	
	
	public String getLight() {
		return light;
		}
	public void setLight(String newLight) {
		light=newLight;
		}		
	
	public String getScene() {
		return scene;
		}
	public void setScene(String newScene) {
		scene=newScene;
		}		
			
	public void sing() {}
	public void applaud() {}
	
}
