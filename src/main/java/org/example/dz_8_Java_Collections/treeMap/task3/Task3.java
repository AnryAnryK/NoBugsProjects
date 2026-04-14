package org.example.dz_8_Java_Collections.treeMap.task3;

import java.util.TreeMap;

public class Task3 {

	public static void main(String[] args) {

		TreeMap<Integer, String> treeMap1 = new TreeMap<>();
		treeMap1.put(1,"Иванов");
		treeMap1.put(2,"Петров");
		treeMap1.put(3,"Сидоров");
		treeMap1.put(4,"Хе");

		System.out.println("Ближайший больший ID : " + treeMap1.higherKey(2));
	}
}
