package org.example.answerBook.theFirstCreationOfClassesAndObjects.task14;

/*
14. Класс Table
 Создай класс Table с полями: width, height (int), material (String).
Метод describe() должен печатать: Стол из <material>, размер <width>x<height>.
 */

public class Table {

	private int width;
	private int height;
	private String material;

	public Table(int width, int height, String material) {
		this.width = width;
		this.height = height;
		this.material = material;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public String getMaterial() {
		return material;
	}
public void describe(){
	System.out.println("Стол из \"" + material + "\", размер " + width + "x" + height);
}
}
