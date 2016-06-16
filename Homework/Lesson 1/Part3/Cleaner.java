abstract class Cleaner extends WorkerOfCompany {
			private String uniformType;		
			private String glovesType;
			private String tools;
	
	public String getUniformType() {
		return uniformType;
		}
	public void setUniformType(String newUniformType) {
		uniformType=newUniformType;
		}		
			
	public String getGlovesType() {
		return glovesType;
		}
	public void setGlovesType(String newGlovesType) {
		glovesType=newGlovesType;
		}		
			
	public String getTools() {
		return tools;
		}
	public void setTools(String newTools) {
		tools=newTools;
		}		
			
	public void askForSalary() {}
	public void askForHolidays() {}
	public void clean() {}	 
}