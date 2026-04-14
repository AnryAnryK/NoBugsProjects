package org.example.dz_8_Java_Collections.linkedHashSet.task2;

import java.util.LinkedHashSet;

public class Task2 {

	void addUnique(LinkedHashSet<String> linkedHashSet1, String element) {
		if (!linkedHashSet1.contains(element)) {
			System.out.println("Дубликатов нет : " + linkedHashSet1.add(element));
		} else {
			System.out.println("Имеется Дубликат : ");
		}
	}

	public static void main(String[] args) {

		LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>();

		Task2 task2 = new Task2();
		task2.addUnique(linkedHashSet1, "Математика");
		task2.addUnique(linkedHashSet1, "Математика");
		task2.addUnique(linkedHashSet1, "Физкультура");
		task2.addUnique(linkedHashSet1, "Химия");

		System.out.println(linkedHashSet1);
	}
}
