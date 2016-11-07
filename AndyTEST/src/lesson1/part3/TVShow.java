package lesson1.part3;

import lesson1.part2.Entertainments;

public class TVShow extends Entertainments 
{
			private String actorName;		
			private String directorName;
			private String cameramanName;
	
	public TVShow(){}
	
	public TVShow(String actorName, String directorName, String cameramanName)
	{
		this.actorName = actorName;
		this.directorName = directorName;
		this.cameramanName = cameramanName;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getCameramanName() {
		return cameramanName;
	}

	public void setCameramanName(String cameramanName) {
		this.cameramanName = cameramanName;
	}
	
	public static void main(String[] args)
	{
		TVShow comedyShow = new TVShow("John Smith", "James Woodman", "Ashly Carter");
		System.out.println("Actor name of TV-show is: " + comedyShow.getActorName());
		System.out.println("Director name of TV-show is: " + comedyShow.getDirectorName());
		System.out.println("Cameraman name of TV-show is: " + comedyShow.getCameramanName());
	}
}
/*
public void talk() {}
public void shooting() {}
*/