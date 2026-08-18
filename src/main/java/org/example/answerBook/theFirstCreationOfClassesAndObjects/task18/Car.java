package org.example.answerBook.theFirstCreationOfClassesAndObjects.task18;

/*
18. Класс Car
 Создай класс Car с полями brand (String) и mileage (int).
Метод drive(int km) увеличивает пробег и печатает новый пробег.
Метод printMileage() — печатает текущий пробег.
 */

public class Car {
	private String brand;
	private int mileage;

	public Car(String brand, int mileage) {
		this.brand = brand;
		this.mileage = mileage;
	}

	public String getBrand() {
		return brand;
	}

	public int getMileage() {
		return mileage;
	}

	public int drive(int km) {
		return mileage += km;
	}

	public void printMileage(){
		System.out.println("Текущий пробег: " + mileage);
	}
}
