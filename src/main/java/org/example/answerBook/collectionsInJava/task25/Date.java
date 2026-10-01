package org.example.answerBook.collectionsInJava.task25;

import java.util.Objects;

public class Date {
	private String date;

	public Date(String date) {
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Date date1 = (Date) o;
		return Objects.equals(date, date1.date);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(date);
	}
	@Override
	public String toString(){
		return "Дата: " + date;
	}
}
