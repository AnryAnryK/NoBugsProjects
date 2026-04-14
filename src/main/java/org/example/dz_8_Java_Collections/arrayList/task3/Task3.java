package org.example.dz_8_Java_Collections.arrayList.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {

		String longestString = "";

		List<String> list1 = new ArrayList<>();

		list1.add("Есенин");
		list1.add("Пушкин");
		list1.add("Лермонтов");
		list1.add("Фет");

		for (String list : list1) {
			if (list.length() > longestString.length()) {
				longestString = list;
			}
		}
		System.out.println(longestString);
	}
}
