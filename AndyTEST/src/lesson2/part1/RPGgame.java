package lesson2.part1;

import lesson1.part2.Entertainments;



public class RPGgame extends Entertainments
{			
	private String gameName;		
	private String gameMaker; 
	private String ageLimit;
	private double price;
			
	public RPGgame(){}
	
	public RPGgame(String gameName, String gameMaker, String safety,  double price)
	{
		this.gameName = gameName;
		this.gameMaker = gameMaker;
		this.safety = safety;
		this.price = price;
	}
	
	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameMaker() {
		return gameMaker;
	}

	public void setGameMaker(String gameMaker) {
		this.gameMaker = gameMaker;
	}

	public String getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(String ageLimit) {
		this.ageLimit = ageLimit;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static void main(String[] args)
	{
		RPGgame stalker = new RPGgame("Stalker", "GSC", "Safe", 29.99);
		
		System.out.println("Name of the game is: " + stalker.getGameName());
		System.out.println("Name of the maker is: " + stalker.getGameMaker());
		System.out.println("Is the game safe?: " + stalker.getSafety());
		System.out.println("Price of the game is: " + stalker.getPrice() + "$");		
	}		
}

/*
public void buy() {}
public void play() {}


public RPG_game() {
	form = "Computer game";
	type = "Adult";
	activity = "Not active";
	ageLimit = "Pegi 18+";
	price = 29.99;
}
*/