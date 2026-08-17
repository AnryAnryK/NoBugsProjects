package org.example.answerBook.theFirstCreationOfClassesAndObjects.task7.laptop2;

/*
7. Класс Laptop
 Реализуй класс Laptop с полями brand (тип String) и ram (тип int — количество ОЗУ в ГБ).
Создай метод specs(), который возвращает строку: Ноутбук <brand> с <ram> ГБ памяти
 */

public class Laptop2 {
	private String brand;
	private int ram;


	public Laptop2(String brand, int ram) {
		this.brand = brand;
		this.ram = ram;
	}

	public boolean laptopIsValid() {
		return getBrand() != null && !getBrand().isBlank() && getRam() > 0;
	}

	public String getBrand() {
		return brand;
	}

	public int getRam() {
		return ram;
	}

	@Override
	public String toString() {
		return specs();
	}

	public String specs() {
		return "Ноутбук \"" + getBrand() + "\" с " + getRam() + " ГБ памяти";
	}
}
