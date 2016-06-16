abstract class CEOFounder extends WorkerOfCompany {
			private String haircutType;		
			private String suitType;
			private String watchType;
	
	public String getHaircutType() {
		return haircutType;
		}
	public void setHaircutType(String newHaircutType) {
		haircutType=newHaircutType;
		}		
					
	public String getSuitType() {
		return suitType;
		}
	public void setSuitType(String newSuitType) {
		suitType=newSuitType;
		}		
			
	public String getWatchType() {
		return watchType;
		}
	public void setWatchType(String newWatchType) {
		watchType=newWatchType;
		}		
			
	public void doHaircut() {}
	public void manage() {}
}