package org.example.answerBook.complexJavaTasks.task1;

public class Bookings {

	private String name;
	private int ticketCount;
	private String date;


	public Bookings(String name, int ticketCount, String date) {
		this.name = name;
		this.ticketCount = ticketCount;
		this.date = date;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public int getTicketCount() {
		return ticketCount;
	}

	public String getDate() {
		return date;
	}
}
