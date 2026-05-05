package org.example.dz_9.dz_9_dopTasks;

public class Task1 {

	/*
Задача: Создайте класс Storage<T>, который хранит элемент и возвращает его.
	 */

	public static void main(String[] args) {
		Storage<Integer> storage1Int = new Storage<>();
		storage1Int.set(1);
		System.out.println(storage1Int.get());

		Storage<String> storage2String = new Storage<>();
		storage2String.set("Один");
		System.out.println(storage2String.get());
	}
}

class Storage<T> {
	private T item;

	public void set(T item) {
		this.item = item;
	}

	public T get() {
		return item;
	}
}