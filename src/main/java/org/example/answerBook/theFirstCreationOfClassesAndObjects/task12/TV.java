package org.example.answerBook.theFirstCreationOfClassesAndObjects.task12;

/*
12. Класс TV
 Создай класс TV с полями brand (String) и isOn (boolean).
Метод togglePower() переключает состояние: если было on, станет off и наоборот.
Метод printState() выводит: Телевизор <brand> сейчас включен или выключен.
 */

public class TV {
	private String brand;
	private boolean isOn;

	public String getBrand() {
		return brand;
	}

	public boolean isOn() {
		return isOn;
	}

	public TV(String brand, boolean isOn) {
		this.brand = brand;
		this.isOn = isOn;
	}

	public void togglePower() {
		this.isOn = !this.isOn;
		System.out.print("ТВ вкл/выкл: ");
	}

	public void printState() {
//		String status;
//		if (isOn) {
//			status = "включен";
//		} else {
//			status = "выключен";
//		}
		String status = isOn ? "включен": "выключен"; // то же, но с тернарным оператором

		System.out.println("Телевизор \"" + brand + "\" сейчас " + status);
	}
}
