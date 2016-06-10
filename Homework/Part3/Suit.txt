abstract class Suit extends Clothes {
			private String tie;		
			private String shirt;
			private String pants;
	
	public String getTie() {
		return tie;
		}
	public void setTie(String newTie) {
		tie=newTie;
		}	
			
	public String getShirt() {
		return shirt;
		}
	public void setShirt(String newShirt) {
		shirt=newShirt;
		}		
			
	public String getPants() {
		return pants;
		}
	public void setPants(String newPants) {
		pants=newPants;
		}		
			
	public void toTieATie() {}
	public void clean() {}
	
}
