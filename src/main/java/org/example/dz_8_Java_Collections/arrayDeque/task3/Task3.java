package org.example.dz_8_Java_Collections.arrayDeque.task3;

import java.util.ArrayDeque;

public class Task3 {
	public static void main(String[] args) {

		ArrayDeque<Integer> arrayDeque1 = new ArrayDeque<>();
		arrayDeque1.add(1);
		arrayDeque1.add(5);
		arrayDeque1.add(3);
		arrayDeque1.add(2);
		arrayDeque1.add(4);
		arrayDeque1.add(6);

		System.out.println("Элемент с начала очереди : " + arrayDeque1.removeFirst());
		System.out.println("Элемент с конца очереди : " + arrayDeque1.removeLast());
	}
}
