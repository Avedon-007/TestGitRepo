
public class TShirt extends Clothes {
		private String fabric;
		private String neck;
		private String size;
		private String color;
		private double price;
	
		public String getFabric() {
			return fabric;
		}
		public void setFabric(String newFabric){
			fabric = newFabric;
		}

		public String getNeck(){
			return neck;
		}
		public void setNeck(String newNeck){
			neck = newNeck;
		}

		public String getSize(){
			return size;
		}
		public void setSize(String newSize){
			size = newSize;
		}

		public String getColor(){
			return color;
		}
		public void setColor(String newColor){
			color = newColor;
		}

		public double getPrice(){
			return price;
		}
		public void setPrice(double newPrice){
			price = newPrice;
		}

		public void wear() {}
		public void wash() {}
		public void dry() {}
	
	
	public TShirt() {
		fabric = "Nylon";
		neck = "Round";
		size = "XL";
		color = "Orang";
		price = 24.99;
	}
	
	public static void main(String[] args){
		
		TShirt FootballTShirt = new TShirt();
		
		System.out.println("   T-SHIRT");
		System.out.println("Fabric: "+ FootballTShirt.fabric);
		System.out.println("Neck: "+ FootballTShirt.neck);
		System.out.println("Size: "+ FootballTShirt.size);
		System.out.println("Color: "+ FootballTShirt.color);
		System.out.println("Price: "+ FootballTShirt.price +"$");
	}
	
}
