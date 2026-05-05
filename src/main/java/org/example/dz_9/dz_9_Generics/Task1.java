package org.example.dz_9.dz_9_Generics;

public class Task1 {

	/*
	1. Задача на дженерик класс
Условие задачи: Разработайте дженерик класс Box, который может хранить объекты любого типа.
Класс должен иметь методы для установки и получения значения объекта, хранящегося внутри.
	 */


	public static void main(String[] args) {
		Box box1Int = new Box();
		box1Int.setBox(1);
		System.out.println(box1Int.getBox());

		Box box2String = new Box();
		box2String.setBox("Один");
		System.out.println(box2String.getBox());

		Box box3Float = new Box();
		box3Float.setBox(2.3);
		System.out.println(box3Float.getBox());

	}
}

class Box<T> {
	private T item;

	public void setBox(T item) {
		this.item = item;
	}

	public T getBox() {
		return item;
	}
}
