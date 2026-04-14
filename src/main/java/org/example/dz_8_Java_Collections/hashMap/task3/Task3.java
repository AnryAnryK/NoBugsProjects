package org.example.dz_8_Java_Collections.hashMap.task3;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
	public static void main(String[] args) {

		HashMap<String, Integer> hashMap1 = new HashMap<>();
		hashMap1.put("Иван", 20);
		hashMap1.put("Петр", 25);
		hashMap1.put("Марья", 26);
		hashMap1.put("Ольга", 30);
		hashMap1.put("Вова", 5);

		for (Map.Entry<String, Integer> entry : hashMap1.entrySet()) {
			if (entry.getValue() < 18) {
				System.out.println(entry.getKey());
			}
		}
	}
}
