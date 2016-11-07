
public class Bass_guitar extends MusicInstruments {
			private String typeOfInstrument;
			private String material;
			private String powerSource;
			private int weight;
			private String belt;
			private int strings;
			private String logo;
			private double price;
			
			
	public String getTypeOfInstrument() {
				return typeOfInstrument;
				}
	public void setTypeOfInstrument(String newTypeOfInstrument) {
				typeOfInstrument=newTypeOfInstrument;
				}

	public String getMaterial() {
				return material;
				}
	public void setMaterial(String newMaterial) {
				material=newMaterial;
				}
	
	public String getPowerSource() {
			return powerSource;
		}
	public void setPowerSource(String newPowerSource) {
				powerSource=newPowerSource;
				}
	
	public int getWeight() {
				return weight;
				}
	public void setWeight(int newWeight) {
				weight=newWeight;
				}
	
	public String getBelt() {
		return belt;
		}
	public void setBelt(String newBelt) {
		belt=newBelt;
		}	
			
	public int getStrings() {
		return strings;
		}
	public void setStrings(int newStrings) {
		strings = newStrings;
		}		
					
	public String getLogo() {
		return logo;
		}
	public void setLogo(String newLogo) {
		logo = newLogo;
		}
	
	public double getPrice(){
		return price;
	}
	public void setPrice(double newPrice){
		price = newPrice;
	}
	
	public void makeSound() {}
	public void startPlay() {}
	public void fitBelt() {}
	
	
	public Bass_guitar(){
		typeOfInstrument = "String";
		material = "Wood and metal";
		powerSource = "Electric";
		weight = 12;
		belt = "Leather";
		strings = 4;
		logo = "Sandberg";
		price = 1200.0;
	}
	
	public static void main(String[] args){
		
		Bass_guitar SandbergTT = new Bass_guitar();
			
			System.out.println("   SANDBERG TT:");
			System.out.println("Type Of Instrument: "+ SandbergTT.typeOfInstrument);
			System.out.println("Material: "+ SandbergTT.material);
			System.out.println("PowerSource: "+ SandbergTT.powerSource);
			System.out.println("Weight: "+ SandbergTT.weight +"kg");
			System.out.println("Belt: "+ SandbergTT.belt);
			System.out.println("Strings: "+ SandbergTT.strings);
			System.out.println("Logo: "+ SandbergTT.logo);
			System.out.println("Price: "+ SandbergTT.price +"$");
			
		}
	
}
