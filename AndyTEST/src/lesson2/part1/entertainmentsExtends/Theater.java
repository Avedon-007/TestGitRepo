package lesson2.part1.entertainmentsExtends;

import lesson1.part2.Entertainments;


public class Theater extends Entertainments 
{					
	private String playName;		
	private int actorsNumber;
	private String beginingTime;
	private double ticketPrice;

	public Theater(){}
	
	public Theater(String playName, String beginingTime, String safety, double ticketPrice)
	{
		this.playName = playName;
		this.beginingTime = beginingTime;
		this.safety = safety;
		this.ticketPrice = ticketPrice;
	}		
		
	public String getPlayName() {
		return playName;
	}

	public void setPlayName(String playName) {
		this.playName = playName;
	}

	public int getActorsNumber() {
		return actorsNumber;
	}

	public void setActorsNumber(int actorsNumber) {
		this.actorsNumber = actorsNumber;
	}

	public String getBeginingTime() {
		return beginingTime;
	}

	public void setBeginingTime(String beginingTime) {
		this.beginingTime = beginingTime;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public static void main(String[] args)
	{		
		Theater kyivTheater = new Theater("Otello", "12.12.2017", "Safe", 5.60);		
		System.out.println("   Kyiv theater presents:");
		System.out.println("Name of the play is: " + kyivTheater.getPlayName());
		System.out.println("Date of the play is: " + kyivTheater.getBeginingTime());
		System.out.println("Is play safe or not: " + kyivTheater.getSafety());
		System.out.println("Ticket price: " + kyivTheater.getTicketPrice() +"$");
	}	
}

/*
public void wathc() {}
public void sit() {}
public void applaud() {}

public Theater() {

audience = "Yes";
actors = 12;
performance = "\"Caesar\"";
ticketPrice = 12.0;
}

*/