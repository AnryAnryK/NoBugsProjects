package org.example.answerBook.theFirstCreationOfClassesAndObjects.task25;

/*
25. Класс LightBulb
 Поле: isOn (boolean).
Метод switchState() меняет isOn на противоположное.
Метод printState() сообщает, горит ли лампочка.
 */

public class LightBulb {
	private boolean isOn = false;

	public boolean getIsOn() {
		return isOn;
	}

	public void switchState() {
		this.isOn = !this.isOn;
	}

	public void printState() {
		if (isOn == true) {
			System.out.println("Лампочка - горит");
		} else {
			System.out.println("Лампочка - не горит");
		}
	}
}
