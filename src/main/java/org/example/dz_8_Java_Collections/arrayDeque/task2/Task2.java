package org.example.dz_8_Java_Collections.arrayDeque.task2;

import java.util.ArrayDeque;

public class Task2 {

	public static void main(String[] args) {

		ArrayDeque<Integer> arrayDeque1 = new ArrayDeque<>();
		arrayDeque1.push(1);
		arrayDeque1.push(5);
		arrayDeque1.push(3);
		arrayDeque1.push(2);
		arrayDeque1.push(4);

		while (!arrayDeque1.isEmpty()) {
			System.out.println(arrayDeque1.pop());
		}
	}
}
