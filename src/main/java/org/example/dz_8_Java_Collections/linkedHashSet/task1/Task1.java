package org.example.dz_8_Java_Collections.linkedHashSet.task1;

import java.util.LinkedHashSet;

public class Task1 {

	public static void main(String[] args) {

		LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>();
		linkedHashSet1.add("Математика");
		linkedHashSet1.add("Математика2");
		linkedHashSet1.add("Литература");
		linkedHashSet1.add("Физкультура");
		linkedHashSet1.add("Химия");

		System.out.println(linkedHashSet1);
	}
}
