package org.example.dz_8_Java_Collections.additionally.task2;

import java.util.ArrayDeque;

public class Task2 {

	public static void main(String[] args) {

		ArrayDeque<String> arrayDeque1 = new ArrayDeque<>();
		arrayDeque1.add("Задача 1");
		arrayDeque1.add("Задача 3");
		arrayDeque1.add("Задача 2");
		arrayDeque1.add("Задача 4");
		arrayDeque1.add("Задача 1.1");

		while (!arrayDeque1.isEmpty()) {
			System.out.println(arrayDeque1.pop());
		}
	}
}
