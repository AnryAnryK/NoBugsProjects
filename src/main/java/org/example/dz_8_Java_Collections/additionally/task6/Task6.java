package org.example.dz_8_Java_Collections.additionally.task6;

import java.util.HashMap;

public class Task6 {

	HashMap<String, Integer> hashMap1 = new HashMap<>();

	public void finderNumber(String surname) {
		System.out.println("Нашли Значение по Ключу : " + hashMap1.get(surname));
	}

	public static void main(String[] args) {
		Task6 task6 = new Task6();
		task6.hashMap1.put("Антонов", 123123);
		task6.hashMap1.put("Бубликов", 124124);
		task6.hashMap1.put("Воронин", 125125);
		task6.hashMap1.put("Годовалов", 126126);

		task6.finderNumber("Антонов");
		task6.finderNumber("Бубликов");
		task6.finderNumber("Воронин");
	}
}
