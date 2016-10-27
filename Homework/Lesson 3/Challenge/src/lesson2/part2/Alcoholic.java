package lesson2.part2;

public class Alcoholic extends lesson2.part1.Human {
	private int alcoholYearsExperiance;
	private Drink myDrink;
	
	public Alcoholic(int alcoholYearsExperiance, Drink myDrink) {
		this.alcoholYearsExperiance = alcoholYearsExperiance;
		this.myDrink = myDrink;
	}
	public int getAlcoholYearsExperiance() {
		return alcoholYearsExperiance;
	}
	public void setAlcoholYearsExperiance(int alcoholYearsExperiance) {
		this.alcoholYearsExperiance = alcoholYearsExperiance;
	}
	public Drink getMyDrink() {
		return myDrink;
	}
	public void setMyDrink(Drink myDrink) {
		this.myDrink = myDrink;
	}
	
	
}
