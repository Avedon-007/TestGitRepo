package lesson2.part2;

public class Drink {
	private String drinkName;
	private String drinkCountryName;
	private double drinkPrice;
	
	public Drink(String drinkName, String drinkCountryName, double drinkPrice) {
		this.drinkName = drinkName;
		this.drinkCountryName = drinkCountryName;
		this.drinkPrice = drinkPrice;
	}
	public String getDrinkName() {
		return drinkName;
	}
	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}
	public String getDrinkCountryName() {
		return drinkCountryName;
	}
	public void setDrinkCountryName(String drinkCountryName) {
		this.drinkCountryName = drinkCountryName;
	}
	public double getDrinkPrice() {
		return drinkPrice;
	}
	public void setDrinkPrice(double drinkPrice) {
		this.drinkPrice = drinkPrice;
	}
	
	
}
