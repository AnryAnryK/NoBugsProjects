package org.example.answerBook.theFirstCreationOfClassesAndObjects.task7;

/*
7. Класс Laptop
 Реализуй класс Laptop с полями brand (тип String) и ram (тип int — количество ОЗУ в ГБ).
Создай метод specs(), который возвращает строку: Ноутбук <brand> с <ram> ГБ памяти
 */

public class Laptop {
	private String brand;
	private int ram;

	public Laptop(String brand, int ram) {
		if (brand == null || brand.isBlank()) {
			throw new IllegalArgumentException("brand не может быть не заполнен !");
		}
		if (ram <= 0) {
			throw new IllegalArgumentException("ram не может быть меньше или равно 0 !");
		}
		this.brand = brand;
		this.ram = ram;
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
