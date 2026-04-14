package org.example.dz_8_Java_Collections.arrayDeque.task1;

import java.util.ArrayDeque;

public class Task1 {
	public static void main(String[] args) {

		ArrayDeque<Integer> arrayDeque1 = new ArrayDeque<>();
		arrayDeque1.add(1);
		arrayDeque1.add(5);
		arrayDeque1.add(3);
		arrayDeque1.add(2);
		arrayDeque1.add(4);

		while (!arrayDeque1.isEmpty()) {
			System.out.println(arrayDeque1.removeFirst());
		}
	}
}
