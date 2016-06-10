abstract class Bookkeeper extends WorkerOfCompany {
			private String haircutType;		
			private String dressType;
			private String tools;
	
			
	public String getHaircutType() {
		return haircutType;
		}
	public void setHaircutType(String newHaircutType) {
		haircutType=newHaircutType;
		}		
			
			
	public String getDressType() {
		return dressType;
		}
	public void setDressType(String newDressType) {
		dressType=newDressType;
		}		
			
			
	public String getTools() {
		return tools;
		}
	public void setTools(String newTools) {
		tools=newTools;
		}		
			
	public void doHaircut() {}
	public void askForHolidays() {}
	public void count() {}	 
}