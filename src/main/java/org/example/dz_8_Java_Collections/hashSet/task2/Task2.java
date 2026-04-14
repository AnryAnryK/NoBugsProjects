package org.example.dz_8_Java_Collections.hashSet.task2;

import java.util.HashSet;

public class Task2 {

	public static void main(String[] args) {

		HashSet<Integer> hashSet1 = new HashSet<>();

		hashSet1.add(1);
		hashSet1.add(2);
		hashSet1.add(3);
		hashSet1.add(4);
		hashSet1.add(5);
		hashSet1.add(6);
		hashSet1.add(7);
		hashSet1.add(8);
		hashSet1.add(9);
		hashSet1.add(10);

		if (hashSet1.contains(5)) {
			System.out.println("Множество содержит заданное число");
		} else {
			System.out.println("Множество НЕ содержит заданное число");
		}
	}
}
