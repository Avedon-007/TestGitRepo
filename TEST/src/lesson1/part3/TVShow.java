abstract class TVShow extends Entertainments {
			private String actor;		
			private String director;
			private String camera;
	
	public String getActor() {
		return actor;
		}
	public void setActor(String newActor) {
		actor=newActor;
		}			
			
	public String getDirector() {
		return director;
		}
	public void setDirector(String newDirector) {
		director=newDirector;
		}		
			
	public String getCamera() {
		return camera;
		}
	public void setCamera(String newCamera) {
		camera=newCamera;
		}		
	
	public void talk() {}
	public void shooting() {}
}
