
public class OrangeJuice extends CustomerGoods {
	private String goodsType;
	private String color;
	private String smell;
	private String typeOfPacking;
	private String taste;
	private String foodType;
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
	
	public String getFoodType() {
		return foodType;
		}
	public void setFoodType(String newFoodType) {
		foodType=newFoodType;
		}	
	
	public double getPrice(){
		return price;
	}
	public void setPrice(double newPrice){
		price = newPrice;
	}
	
	public void buy() {}
	public void pourInGlass() {}
	public void drink() {}
	
	
	public OrangeJuice() {
		goodsType = "Food";
		color = "Orange";
		smell = "Orange";
		typeOfPacking = "Plastic bottle";
		taste = "sweet and sour";
		foodType = "Drinks";
		price = 5.99;
	}
	
	public static void main(String[] args) {
	
		OrangeJuice SandoraJuice = new OrangeJuice();
		
		System.out.println("   Sandora Orange Juice:");
		System.out.println("Goods type: "+ SandoraJuice.goodsType);
		System.out.println("Color: "+ SandoraJuice.color);
		System.out.println("Smell: "+ SandoraJuice.smell);
		System.out.println("Type of packing: "+ SandoraJuice.typeOfPacking);
		System.out.println("Taste: "+ SandoraJuice.taste);
		System.out.println("Food type: "+ SandoraJuice.foodType);
		System.out.println("Price: "+ SandoraJuice.price +"$");
	
	}
}
