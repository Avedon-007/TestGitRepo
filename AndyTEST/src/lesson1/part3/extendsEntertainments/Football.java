package lesson1.part3.extendsEntertainments;

import lesson1.part2.Entertainments;

class Football extends Entertainments 
{
			private String team1 = "Dynamo";	
			private String team2 = "Shakhtar";
			private String judgeName = "Petrenko";
			private String stadiumName = "Lviv arena";
			private String dateGame = "27.12.2016";
	
	public Football(){}
	
	public Football(String team1, String team2, String judgeName, String stadiumName, String dateGame, String activity)
	{
		this.team1 = team1;
		this.judgeName = judgeName;
		this.team2 = team2;
		this.stadiumName = stadiumName;
		this.dateGame = dateGame;
		this.activity = activity;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getJudgeName() {
		return judgeName;
	}

	public void setJudgeName(String judgeName) {
		this.judgeName = judgeName;
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public String getDateGame() {
		return dateGame;
	}

	public void setDateGame(String dateGame) {
		this.dateGame = dateGame;
	}
			
	public static void main(String[] args)
	{
		Football match1 = new Football();
		System.out.println("Match between " + match1.getTeam1() + " and " + match1.getTeam2());
		System.out.println("The judge is: " + match1.getJudgeName());
		System.out.println("Stadium is: " + match1.getStadiumName());
		System.out.println("The date of match is: " + match1.getDateGame());
		match1.setActivity("Active");
		System.out.println("Is entertainments active or not?: " + match1.getActivity());
		System.out.println();
		
		
		Football match2 = new Football("Vorskla", "Dnipro", "Savelev", "Dnipro arena", "12.11.2016", "Active");
		System.out.println("Match between " + match2.getTeam1() + " and " + match2.getTeam2());
		System.out.println("The judge is: " + match2.getJudgeName());
		System.out.println("Stadium is: " + match2.getStadiumName());
		System.out.println("The date of match is: " + match2.getDateGame());
		System.out.println("Is entertainments active or not?: " + match2.getActivity());
	}
	
}

/*
public void play() {}
public void hitBall() {}

*/