package org.example.dz_8_Java_Collections.treeMap.task1;

import java.util.Map;
import java.util.TreeMap;

public class Task1 {
	public static void main(String[] args) {

		TreeMap<String, Integer> treeMap1 = new TreeMap<>();
		treeMap1.put("Математика", 1);
		treeMap1.put("Литература", 2);
		treeMap1.put("История", 3);
		treeMap1.put("География", 4);
		treeMap1.put("Химия", 5);

		for (Map.Entry<String, Integer> entry1 : treeMap1.entrySet()) {
			System.out.println("Предмет (ключ) : " + entry1.getKey() + "; Балл (значение) " + entry1.getValue());
		}
	}
}
