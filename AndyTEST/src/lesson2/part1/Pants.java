
public class Pants extends Clothes {
		private String fabric;
		private String style;
		private String size;
		private String color;
		private double price;
	
		public String getFabric() {
			return fabric;
		}
		public void setFabric(String newFabric){
			fabric = newFabric;
		}

		public String getStyle(){
			return style;
		}
		public void setStyle(String newStyle){
			style = newStyle;
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
		public void clean() {}
	
	
	public Pants() {
		fabric = "Cotton";
		style = "Straight";
		size = "M";
		color = "Dark blue";
		price = 34.99;
	}
	
	public static void main(String[] args){
		
		Pants JeansPants = new Pants();
		
		System.out.println("   JAENS PANTS");
		System.out.println("Fabric: "+ JeansPants.fabric);
		System.out.println("Style: "+ JeansPants.style);
		System.out.println("Size: "+ JeansPants.size);
		System.out.println("Color: "+ JeansPants.color);
		System.out.println("Price: "+ JeansPants.price +"$");
	}
	
}
