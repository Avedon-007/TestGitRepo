package lesson1.part2;


public class Clothes {
				protected String fabric;
				protected String style;
				private String size;
				private String type;
				private String seasonKind;
				private String forWhom;
				protected String color;
				protected double price;
				
				
				//CONSTRUCTORs//
	
	public Clothes(){}			
				
	public Clothes(String fabric, String style, String size, String type, String seasonKind, String forWhom, String color, double price) 
	{
		this.fabric = fabric;
		this.style = style;
		this.size = size;
		this.type = type;
		this.seasonKind = seasonKind;
		this.forWhom = forWhom;
		this.color = color;
		this.price = price;
	}
	
	public String getFabric() 
	{
		return fabric;
	}
	public void setFabric(String fabric) {
		this.fabric = fabric;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSeasonKind() {
		return seasonKind;
	}
	public void setSeasonKind(String seasonKind) {
		this.seasonKind = seasonKind;
	}
	public String getForWhom() {
		return forWhom;
	}
	public void setForWhom(String forWhom) {
		this.forWhom = forWhom;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
		
	public static void main(String[] args){
		
		Clothes tShirt = new Clothes("Nylon", "Sport", "S", "T-shirt", "Summer", "Adult", "Orange", 9.99);
		
		System.out.println(">>Constructor<<");
		System.out.println("The material of T-Shirt is: " + tShirt.getFabric());
		System.out.println("Style of T-Shirt is: " + tShirt.getStyle());
		System.out.println("Size of T-shirt is: " + tShirt.getSize());
		System.out.println("Type of T-Shirt is: " + tShirt.getType());
		System.out.println("Season kind of T-Shirt is: " + tShirt.getSeasonKind());
		System.out.println("For whom this T-Shirt: " + tShirt.getForWhom());
		System.out.println("The color of T-Shirt is: " + tShirt.getColor());
		System.out.println("The price of T-Shirt is: " + tShirt.getPrice());	
		
		tShirt.setPrice(5.49);
		System.out.println("SALE!!! New price of T-Shirt is: " + tShirt.getPrice());
		
		}
}

/*public void wash() {}
	public void dry() {}
	public void wear() {}
	*/
