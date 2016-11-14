package lesson1.part3.extendsEntertainments;

import lesson1.part2.Entertainments;

class Cinema extends Entertainments 
{
			private int moviegoersQuanttity;		
			private String screenSize;
	
	public Cinema(){}	
	
	public Cinema(String activity, int moviegoersQuanttity, String screenSize)
	{
		this.activity = activity;
		this.moviegoersQuanttity = moviegoersQuanttity;
		
		this.screenSize = screenSize;
	}

	public int getMoviegoersQuanttity() {
		return moviegoersQuanttity;
	}

	public void setMoviegoersQuanttity(int moviegoersQuanttity) {
		this.moviegoersQuanttity = moviegoersQuanttity;
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	
	public static void main(String[] args)
	{
		Cinema cinemaKodak = new Cinema("Not active", 500, "6x10 meters");
		System.out.println("Is entertainments active or not?: " + cinemaKodak.getActivity());
		System.out.println("How many people can cinema contains?: " + cinemaKodak.getMoviegoersQuanttity());
		System.out.println("The screen size is: " + cinemaKodak.getScreenSize());
	}
	
	
	
}
/*
 * public void wathc() {}
	public void sit() {}
	
	*/
