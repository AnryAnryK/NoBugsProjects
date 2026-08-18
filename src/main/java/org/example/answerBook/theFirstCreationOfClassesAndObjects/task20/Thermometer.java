package org.example.answerBook.theFirstCreationOfClassesAndObjects.task20;

/*
20. Класс Thermometer
 Создай класс Thermometer с полем currentTemp (double).
Метод display() печатает: Температура: <currentTemp>°C.
Метод isFever() — возвращает true, если температура > 37.5.
 */

public class Thermometer {
	private double currentTemp;
	private final double TEMP = 37.5;

	public Thermometer(double currentTemp) {
		this.currentTemp = currentTemp;
	}

	public double getCurrentTemp() {
		return this.currentTemp;
	}

	public void setCurrentTemp(double currentTemp) {
		this.currentTemp = currentTemp;
	}

	public void display() {
		System.out.println("Температура: " + this.currentTemp + " °C");
	}

	public boolean isFever() {
		return (currentTemp > TEMP);
	}
}
