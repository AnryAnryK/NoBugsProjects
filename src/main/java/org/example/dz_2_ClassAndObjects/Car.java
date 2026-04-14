package org.example.dz_2_ClassAndObjects;

public class Car {

	public static void main(String[] args) {

		Car car1 = new Car("BMW", 2025);
		car1.printAll();
		car1.setYear(2026);
		System.out.println("===========================================");
		System.out.println("Данные первого авто после уточнения : ");
		car1.printAll();


	}

	/*
	Класс Car
Создайте класс Car с полями brand (строка) и year (целое число).

Реализуйте конструктор с двумя параметрами, геттеры и сеттеры для обоих полей,

метод print(), выводящий информацию о марке и годе выпуска.

В main создайте объект, установите значения через конструктор, измените год через сеттер, выведите информацию.
	 */


	private String brand;
	private int year;


	Car(String brand, int year) {
		this.brand = brand;
		this.year = year;
	}

	public void setBrand(String newBrand) {
		this.brand = newBrand;
	}

	public void setYear(int newYear) {
		this.year = newYear;
	}

	String getBrand() {
		return this.brand;
	}

	public int getYear() {
		return this.year;
	}

	public void printAll() {
		System.out.println("Бренд первого авто : " + getBrand());
		System.out.println("Год выпуска первого авто : " + getYear());
	}

}
