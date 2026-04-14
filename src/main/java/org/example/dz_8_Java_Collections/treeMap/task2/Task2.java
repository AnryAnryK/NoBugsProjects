package org.example.dz_8_Java_Collections.treeMap.task2;

import java.util.TreeMap;

public class Task2 {

	public static void main(String[] args) {

		TreeMap<String, Integer> treeMap1 = new TreeMap<>();
		treeMap1.put("Математика", 1);
		treeMap1.put("Литература", 2);
		treeMap1.put("История", 3);
		treeMap1.put("География", 4);
		treeMap1.put("Химия", 5);

		System.out.println("Минимальный ключ : " + treeMap1.firstKey());
		System.out.println("Максимальный ключ : " + treeMap1.lastKey());
	}
}
