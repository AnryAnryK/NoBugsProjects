package org.example.answerBook.theFirstCreationOfClassesAndObjects.task30;

/*
30. Класс Camera
 Поле: model (String).
Метод takePhoto() выводит: Фото сделано на <model>.
 */

public class Camera {
	private String model;

	public Camera(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void takePhoto(){
		System.out.println("Фото сделано на " + getModel());
	}
}
