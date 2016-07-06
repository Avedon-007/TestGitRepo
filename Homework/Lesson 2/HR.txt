
public class HR extends WorkerOfCompany {

	private String haircutType;		
	private String clothesStyle;
	
	
	public String getHaircutType() {
		return haircutType;
		}
	public void setHaircutType(String newHaircutType) {
		haircutType=newHaircutType;
		}		
			
			
	public String getClothesStyle() {
		return clothesStyle;
		}
	public void setClothesStyle(String newClothesStyle) {
		clothesStyle = newClothesStyle;
		}		
	
	public void doHaircut() {}
	public void askForHolidays() {}
	
	
	public HR() {
		
		haircutType = "Classic";
		clothesStyle = "Business";	
	}
	
	
	public static void main(String[] args){
		
		HR HR_manager = new HR();
		
		System.out.println("   HR");
		System.out.println("Hairecut type: "+ HR_manager.haircutType);
		System.out.println("Clothes style: "+ HR_manager.clothesStyle);
		
	}
}
