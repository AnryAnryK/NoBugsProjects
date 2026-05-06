package org.example.dz_9.dz_9_dopTasks;

import java.util.HashMap;
import java.util.Map;

public class Task7 {
	/*
	Коллекция с обобщёнными типами
Задача: Создайте Map<K, V> и реализуйте метод, который принимает обобщённые ключи и значения, а затем выводит их.
	 */

	public static <K, V> void keysAndValues(Map<K, V> kvMap) {
		for (Map.Entry<K, V> entry : kvMap.entrySet()) ;
	}

	public static void main(String[] args) {
		Map<Integer, String> mapIntString1 = new HashMap<>();
		mapIntString1.put(1, "Петров");
		Map<String, Integer> mapStringInt2 = new HashMap<>();
		mapStringInt2.put("Петров", 1);

		keysAndValues(mapIntString1);
		System.out.println(mapIntString1);
		keysAndValues(mapStringInt2);
		System.out.println(mapStringInt2);
	}
}
