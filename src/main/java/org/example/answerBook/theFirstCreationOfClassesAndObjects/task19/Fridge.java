package org.example.answerBook.theFirstCreationOfClassesAndObjects.task19;

/*
19. Класс Fridge
 Класс Fridge с полем temperature (int).
Метод setTemperature(int t) устанавливает температуру,
а getStatus() возвращает строку: «Холодильник охлаждает при градусах».
 */

public class Fridge {
	private int temperature;

	public Fridge() {
		this.temperature = 0;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int t) {
		this.temperature = t;
	}

	public String getStatus() {
		return "Холодильник охлаждает при " + temperature + " градусах";
	}
}
