package lesson2.part2;*

import lesson2.part1.Concert;
import lesson2.part1.MusicInstrument;
import lesson2.part1.Musician;

public class Furshet {
	private String furshetDate;
	private Alcoholic myAlcoholic;
	
	public Furshet(String furshetDate, Alcoholic myAlcoholic) {
		this.furshetDate = furshetDate;
		this.myAlcoholic = myAlcoholic;
	}
	public String getFurshetDate() {
		return furshetDate;
	}
	public void setFurshetDate(String furshetDate) {
		this.furshetDate = furshetDate;
	}
	public Alcoholic getMyAlcoholic() {
		return myAlcoholic;
	}
	public void setMyAlcoholic(Alcoholic myAlcoholic) {
		this.myAlcoholic = myAlcoholic;
	}
	
	public static void main(String[] args) {
		Drink furshetDrink1 = new Drink ("Vine", "France", 1000);
		Alcoholic furshetPerson1 = new Alcoholic(20, furshetDrink1);		
		Furshet todayFurshet = new Furshet("27.10.2016", furshetPerson1);
		
		System.out.println("Instrument cost of performer " + todayConcert.getConcertPerformer().getHumanName() +
				" is " + todayConcert.getConcertPerformer().getMyInstrument().getInstrumentPrice());
		
		todayConcert.getConcertPerformer().setHumanName("Peter");
		todayConcert.getConcertPerformer().setMyInstrument(drums);
		System.out.println("Instrument cost of performer " + todayConcert.getConcertPerformer().getHumanName() +
				" is " + todayConcert.getConcertPerformer().getMyInstrument().getInstrumentPrice());
		
	}

}
