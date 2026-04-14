package org.example.dz_8_Java_Collections.linkedHashMap.task1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
	public static void main(String[] args) {

		LinkedHashMap<Integer, String> linkedHashMap1 = new LinkedHashMap<>();
		linkedHashMap1.put(1, "Яблоки");
		linkedHashMap1.put(2, "Апельсины");
		linkedHashMap1.put(3, "Бананы");
		linkedHashMap1.put(4, "Лимоны");

		for (Map.Entry<Integer, String> products : linkedHashMap1.entrySet()){
			System.out.println("Ключ : " + products.getKey() + "; Значение : " + products.getValue());
		}
	}
}
