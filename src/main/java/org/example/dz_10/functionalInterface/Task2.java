package org.example.dz_10.functionalInterface;

public class Task2 {
	/*
	2. Использование анонимного класса
Задача: Создайте анонимный класс, реализующий интерфейс Runnable, который выводит сообщение "Hello from anonymous class!".
	 */

	public static void main(String[] args) {

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello from anonymous class!");
			}
		};
		r1.run();
	}
}

