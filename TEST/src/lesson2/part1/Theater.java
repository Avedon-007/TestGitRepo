
public class Theater extends Entertainments {
			private String audience;		
			private int actors;
			private String performance;
			private double ticketPrice;

		public String getAudience() {
			return audience;
		}
		public void setAudience(String newAudience) {
			audience = newAudience;
		}		
	
		public int getActors() {
			return actors;
		}
		public void setActors(int newActors) {
			actors = newActors;
		}		
	
		public String getPerformance() {
			return performance;
		}
		public void setPerformance(String newPerformance) {
			performance = newPerformance;
		}		

		public double getTicketPrice() {
			return ticketPrice;
		}
		public void setTicketPrice(double newTicketPrice) {
			ticketPrice = newTicketPrice;
		}	
		
		public void wathc() {}
		public void sit() {}
		public void applaud() {}
	
	public Theater() {
		
		audience = "Yes";
		actors = 12;
		performance = "\"Caesar\"";
		ticketPrice = 12.0;
	}
		
	public static void main(String[] args){
		
		Theater KyivTheater = new Theater();
		
		System.out.println("   Kyiv theater presents:");
		System.out.println("Audience: "+ KyivTheater.audience);
		System.out.println("Actors: "+ KyivTheater.actors);
		System.out.println("Performance: "+ KyivTheater.performance);
		System.out.println("Ticket price: "+ KyivTheater.ticketPrice +"$");
	}
	
}
