package org.example.dz_8_Java_Collections.hashSet.task4;

import java.util.HashSet;

public class Task4 {

	public static void main(String[] args) {

		HashSet<String> hashSet1 = new HashSet<>();
		hashSet1.add("Аня");
		hashSet1.add("Яна");
		hashSet1.add("Оля");
		hashSet1.add("Коля");

		if (hashSet1.contains("Яна")){
			System.out.println("Имя содержится в множестве ");
		} else {
		System.out.println("Имя НЕ содержится в множестве ");
		}
	}
}
