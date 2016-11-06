
public class Manager extends WorkerOfCompany {
	
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
		public void sale() {}
		
		public Manager() {
			
			haircutType = "Classic";
			clothesStyle = "Business";	
		}
		
		
		public static void main(String[] args){
			
			Manager Sale_manager = new Manager();
			
			System.out.println("   Sale manager");
			System.out.println("Hairecut type: "+ Sale_manager.haircutType);
			System.out.println("Clothes style: "+ Sale_manager.clothesStyle);
			
		}
	
}
