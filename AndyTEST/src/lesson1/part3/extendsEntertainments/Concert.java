package lesson1.part3.extendsEntertainments;

public class Concert {
	private String dateOfConcert;
	private Musician concertPerformer;
	
	public Concert(String dateOfConcert, Musician concertPerformer) {
		this.dateOfConcert = dateOfConcert;
		this.concertPerformer = concertPerformer;
	}
	public String getDateOfConcert() {
		return dateOfConcert;
	}
	public void setDateOfConcert(String dateOfConcert) {
		this.dateOfConcert = dateOfConcert;
	}
	public Musician getConcertPerformer() {
		return concertPerformer;
	}
	public void setConcertPerformer(Musician concertPerformer) {
		this.concertPerformer = concertPerformer;
	}
	
	public static void main(String[] args) {
		MusicInstrument guitar = new MusicInstrument("String", "Acoustic", "USA", 99.99);
		MusicInstrument drums = new MusicInstrument("Drums", "Plastic", "Brasil", 49.99);
		Musician musician1 = new Musician("John", "Spain", 15, guitar);
		Concert todayConcert = new Concert("27.10.2016", musician1);
		
		System.out.println("Instrument cost of performer " + todayConcert.getConcertPerformer().getHumanName() +
				" is " + todayConcert.getConcertPerformer().getMyInstrument().getInstrumentPrice());
		
		todayConcert.getConcertPerformer().setHumanName("Peter");
		todayConcert.getConcertPerformer().setMyInstrument(drums);
		System.out.println("Instrument cost of performer " + todayConcert.getConcertPerformer().getHumanName() +
				" is " + todayConcert.getConcertPerformer().getMyInstrument().getInstrumentPrice());
		
	}
}

/*
private String instrumentType;
private String instrumentMaterial;
private String instrumentMaker;
private double instrumentPrice;


private String humanName;
private String humanCountry;

*/