
public class Apple_iWatch {

		private String logo;		
		private String bracelet;
		

	public String getLogo() {
		return logo;
	}
	public void setLogo(String newLogo) {
		logo=newLogo;
	}		
	
	public String getBracelet() {
		return bracelet;
	}
	public void setBracelet(String newBracelet) {
		bracelet=newBracelet;
	}

	public void showTime() {}
	public void charge() {}
	
	
	
	public Apple_iWatch() {
		
		logo = "Apple";
		bracelet = "Steel";
	}
	
	
	public static void main(String[] args){
		
		Apple_iWatch iWatch_Sport = new Apple_iWatch();
		
		System.out.println("   Apple iWatch Sport");
		System.out.println("Logo: "+ iWatch_Sport.logo);
		System.out.println("Bracelet: "+ iWatch_Sport.bracelet);
	
	}
	
	
	
	
}
