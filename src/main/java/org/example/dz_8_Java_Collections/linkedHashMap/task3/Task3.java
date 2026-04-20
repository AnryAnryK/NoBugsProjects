package org.example.dz_8_Java_Collections.linkedHashMap.task3;

import java.util.LinkedHashMap;

public class Task3 {
	LinkedHashMap<Integer, String> linkedHashMap1 = new LinkedHashMap<>(10);

	public void addView(Integer number, String name) {

		if (linkedHashMap1.size() >= 10) {
			Integer firstNumber = linkedHashMap1.keySet().iterator().next();
			linkedHashMap1.remove(firstNumber);
		}
		linkedHashMap1.put(number, name);
		System.out.println("История просмотров: " + linkedHashMap1);
	}


	public static void main(String[] args) {

		Task3 task3 = new Task3();
		task3.addView(1, "Глава 1");
		task3.addView(2, "Глава 2");
		task3.addView(3, "Глава 3");
		task3.addView(4, "Глава 4");
		task3.addView(5, "Глава 5");
		task3.addView(6, "Глава 6");
		task3.addView(7, "Глава 7");
		task3.addView(8, "Глава 8");
		task3.addView(9, "Глава 9");
		task3.addView(10, "Глава 10");
		task3.addView(11, "Глава 11");
		task3.addView(12, "Глава 12");
		task3.addView(13, "Глава 13");
		task3.addView(14, "Глава 14");

		System.out.println("Финальная история просмотров: ");
		System.out.println(task3.linkedHashMap1);
	}
}

