abstract class Engineer extends WorkerOfCompany {
			private String glassesType;		
			private String suitType;
			private String tools;
	
	public String getGlassesType() {
		return glassesType;
		}
	public void setGlassesType(String newGlassesType) {
		glassesType=newGlassesType;
		}		
			
	public String getSuitType() {
		return suitType;
		}
	public void setSuitType(String newSuitType) {
		suitType=newSuitType;
		}		
			
	public String getTools() {
		return tools;
		}
	public void setTools(String newTools) {
		tools=newTools;
		}		
			
	public void askForSalary() {}
	public void askForHolidays() {}
	public void invent() {}	 
}