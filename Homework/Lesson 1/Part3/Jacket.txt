abstract class Jacket extends Clothes {
			private String sleaves;		
			private String pocket;
			private String collar;
	
	public String getSleaves() {
		return sleaves;
		}
	public void setSleaves(String newSleaves) {
		sleaves=newSleaves;
		}		
			
	public String getPocket() {
		return pocket;
		}
	public void setPocket(String newPocket) {
		pocket=newPocket;
		}		
			
	public String getCollar() {
		return collar;
		}
	public void setCollar(String newCollar) {
		collar=newCollar;
		}
	
	public void zipUp() {}
	public void openPocket() {}
	
}
