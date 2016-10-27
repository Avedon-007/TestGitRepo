package lesson1.part2;

public class Clothes {
	private String clothesColor;
	private String clothesMaterial;
	private String clothesContryOrigin;
	private double clothesPrice;

	public Clothes(String clothesColor, String clothesMaterial) {
		this.clothesColor = clothesColor;
		this.clothesMaterial = clothesMaterial;
	}

	public Clothes() {
		// TODO Auto-generated constructor stub
	}

	public Clothes(String clothesColor, String clothesMaterial, String clothesContryOrigin, double clothesPrice) {
		this.clothesColor = clothesColor;
		this.clothesMaterial = clothesMaterial;
		this.clothesContryOrigin = clothesContryOrigin;
		this.clothesPrice = clothesPrice;
	}

	public String getClothesColor() {
		return clothesColor;
	}

	public void setClothesColor(String clothesColor) {
		this.clothesColor = clothesColor;
	}

	public String getClothesMaterial() {
		return clothesMaterial;
	}

	public void setClothesMaterial(String clothesMaterial) {
		this.clothesMaterial = clothesMaterial;
	}

	public String getClothesContryOrigin() {
		return clothesContryOrigin;
	}

	public void setClothesContryOrigin(String clothesContryOrigin) {
		this.clothesContryOrigin = clothesContryOrigin;
	}

	public double getClothesPrice() {
		return clothesPrice;
	}

	public void setClothesPrice(double clothesPrice) {
		this.clothesPrice = clothesPrice;
	}

	public static void main(String[] args) {
		
		Clothes myInstance1 = new Clothes();		
		Clothes myInstance2 = new Clothes("Red", "Cotton");		
		Clothes myInstance3 = new Clothes("Red", "Cotton", "Ucraine", 200);
		System.out.println("Old color of my T-shirt was " +  myInstance3.getClothesColor());
		myInstance3.setClothesColor("Blue");
		System.out.println("New color of my T-shirt is " +  myInstance3.getClothesColor());
	}

}
