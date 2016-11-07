package lesson1.part2;

public class MusicInstruments
{
	protected String typeOfInstrument;
	private String material;
	private double size;
	protected String powerSource;
	private double weight;
	
	//CONSTRUCTORs//
	
	public MusicInstruments(){}
	
	public MusicInstruments(String typeOfInstrument, String material, double size, String powerSource, double weight)
	{
		this.typeOfInstrument = typeOfInstrument;
		this.material = material;
		this.size = size;
		this.powerSource = powerSource;
		this.weight = weight;
	}
	
		
	public String getTypeOfInstrument() {
		return typeOfInstrument;
	}
	public void setTypeOfInstrument(String typeOfInstrument) {
		this.typeOfInstrument = typeOfInstrument;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public String getPowerSource() {
		return powerSource;
	}
	public void setPowerSource(String powerSource) {
		this.powerSource = powerSource;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public static void main(String[] args)
	{
		MusicInstruments Guitar1 = new MusicInstruments("String", "Wood", 1.1, "Non-electric", 0.850);
		System.out.println("Type of instrument is: " + Guitar1.getTypeOfInstrument());
		System.out.println("Material of instrument is: " + Guitar1.getMaterial());
		System.out.println("Size of instrument is: " + Guitar1.getSize() + "m");
		System.out.println("Power source of instrument is: " + Guitar1.getPowerSource());
		System.out.println("Weight of instrument is: " + Guitar1.getWeight() + "kg");
	}
	
	
}

/*
public void makeSound() {}
public void startPlay() {}
public void stopPlay() {}
public void repair() {}


*/