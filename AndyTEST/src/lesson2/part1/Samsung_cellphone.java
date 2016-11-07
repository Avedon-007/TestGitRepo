
public class Samsung_cellphone extends TouchScreenDevices {
		
		private String logo;		
		private String simCardSlot;

	public String getLogo() {
			return logo;
	}
	public void setLogo(String newLogo) {
			logo=newLogo;
	}		
	
	public String getSimCardSlot() {
			return simCardSlot;
	}
	public void setSimCardSlot(String newSimCardSlot) {
			simCardSlot=newSimCardSlot;
	}		
	
	public void charge() {}
	public void call() {}
	
	
	
	public Samsung_cellphone() {
		
		logo = "Samsung";
		simCardSlot = "Mini SIM-card clot";
	}
	
	public static void main(String[] args){
		
		Samsung_cellphone Samsung_S4 = new Samsung_cellphone();
		
		System.out.println("   Samsung S4");
		System.out.println("Logo: "+ Samsung_S4.logo);
		System.out.println("Style: "+ Samsung_S4.simCardSlot);
	
	}
	
}
