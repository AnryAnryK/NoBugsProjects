package org.example.answerBook.exceptionsAndGenerics.task1;

/*
1. Универсальная коробка
 Класс Box<T> с методами put() и get().
 */

public class Box<T> {
	public static void main(String[] args) {
		Box<String> box1 = new Box<>("Красные яблоки");
		System.out.println(box1);
		box1.put("Зелёные яблоки");
		System.out.println(box1.get());
		System.out.println(box1);

		Box<Integer> box2 = new Box<>(15);
		System.out.println(box2);
		box2.put(5);
		System.out.println(box2.get());
		System.out.println(box2);
	}

	private T value;

	public Box(T value) {
		this.value = value;
	}

	public void put(T value) {
		this.value = value;
	}

	public T get() {
		return value;
	}

	@Override
	public String toString() {
		return "В корзине лежит: " + value;
	}
}
