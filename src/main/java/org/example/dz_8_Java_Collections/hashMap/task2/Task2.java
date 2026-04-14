package org.example.dz_8_Java_Collections.hashMap.task2;

import java.util.HashMap;

public class Task2 {

	public static void main(String[] args) {

		HashMap<String, Integer> hashMap1 = new HashMap<>();
		hashMap1.put("Иван", 20);
		hashMap1.put("Петр", 25);
		hashMap1.put("Марья", 26);
		hashMap1.put("Ольга", 30);
		hashMap1.put("Вова", 5);


		if (hashMap1.containsKey("Иван")) {
			System.out.println("имя/ключ 'Иван' - содержится в map");
		}
	}
}
