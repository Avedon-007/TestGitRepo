
public class Toothpaste extends CustomerGoods {

	private String goodsType;
	private String color;
	private String smell;
	private String typeOfPacking;
	private String taste;
	private String nonFoodType;
	private double price;
	
	public String getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(String newGoodsType){
		goodsType = newGoodsType;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String newColor){
		color = newColor;
	}
	
	public String getSmell() {
		return smell;
	}
	public void setSmell(String newSmell){
		smell = newSmell;
	}
	
	public String getTypeOfPacking() {
		return typeOfPacking;
	}
	public void setTypeOfPacking(String newTypeOfPacking){
		typeOfPacking = newTypeOfPacking;
	}
	
	public String getTaste() {
		return taste;
	}
	public void setTaste(String newTaste){
		taste = newTaste;
	}
	
	public String getNonFoodType() {
		return nonFoodType;
		}
	public void setNonFoodType(String newNonFoodType) {
		nonFoodType=newNonFoodType;
		}	
	
	public double getPrice(){
		return price;
	}
	public void setPrice(double newPrice){
		price = newPrice;
		}
	
	public void buy() {}
	public void spread() {}
	public void clean() {}
	
	public Toothpaste() {
		goodsType = "Non-Food";
		color = "White and blue";
		smell = "Mint";
		typeOfPacking = "Plastic tube";
		taste = "Sweet and fresh";
		nonFoodType = "Presonal care";
		price = 3.59;
	}
	
	public static void main(String[] args){
		
		Toothpaste Colgate = new Toothpaste();
		
		System.out.println("     Colgate toothpaste:");
		System.out.println("Goods type: "+ Colgate.goodsType);
		System.out.println("Color: "+ Colgate.color);
		System.out.println("Smell: "+ Colgate.smell);
		System.out.println("Type of packing: "+ Colgate.typeOfPacking);
		System.out.println("Taste: "+ Colgate.taste);
		System.out.println("Food type: "+ Colgate.nonFoodType);
		System.out.println("Price: "+ Colgate.price +"$");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
