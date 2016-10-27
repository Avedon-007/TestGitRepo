package lesson2.part1;

public class Musician extends Human {
	private int yearExperience;
	private MusicInstrument myInstrument;
	
	public Musician(String humanName, String humanCountry, int yearExperience, MusicInstrument myInstrument) {
		this.humanName = humanName;
		this.humanCountry = humanCountry;
		this.yearExperience = yearExperience;
		this.myInstrument = myInstrument;
	}
	public int getYearExperience() {
		return yearExperience;
	}
	public void setYearExperience(int yearExperience) {
		this.yearExperience = yearExperience;
	}
	public MusicInstrument getMyInstrument() {
		return myInstrument;
	}
	public void setMyInstrument(MusicInstrument myInstrument) {
		this.myInstrument = myInstrument;
	}
	
	
}
