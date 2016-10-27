package lesson2.part1;

public class MusicInstrument {
	private String instrumentType;
	private String instrumentMaterial;
	private String instrumentMaker;
	private double instrumentPrice;

	public MusicInstrument(String instrumentType, String instrumentMaterial, String instrumentMaker, double instrumentPrice) {
		this.instrumentType = instrumentType;
		this.instrumentMaterial = instrumentMaterial;
		this.instrumentMaker = instrumentMaker;
		this.instrumentPrice = instrumentPrice;
	}
	public String getInstrumentType() {
		return instrumentType;
	}
	public void setInstrumentType(String instrumentType) {
		this.instrumentType = instrumentType;
	}
	public String getInstrumentMaterial() {
		return instrumentMaterial;
	}
	public void setInstrumentMaterial(String instrumentMaterial) {
		this.instrumentMaterial = instrumentMaterial;
	}
	public String getInstrumentMaker() {
		return instrumentMaker;
	}
	public void setInstrumentMaker(String instrumentMaker) {
		this.instrumentMaker = instrumentMaker;
	}
	public double getInstrumentPrice() {
		return instrumentPrice;
	}
	public void setInstrumentPrice(double instrumentPrice) {
		this.instrumentPrice = instrumentPrice;
	}
	
	
}
