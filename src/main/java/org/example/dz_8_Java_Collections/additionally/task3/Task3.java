package org.example.dz_8_Java_Collections.additionally.task3;

import java.util.TreeMap;

public class Task3 {

	public String addParamert(String description, String name) {
		return description + name;
	}

	public static void main(String[] args) {

		TreeMap<String, String> treeMap1 = new TreeMap<>();
		treeMap1.put("Имя1", "Вова");
		treeMap1.put("Имя2", "Владимир");
		treeMap1.put("Имя3", "Вован");

		Task3 task3 = new Task3();
		task3.addParamert("Имя1", "Вова");
		task3.addParamert("Имя2", "Владимир");
		task3.addParamert("Имя3", "Вован");
		System.out.println(treeMap1.containsKey("Имя1"));
		System.out.println(treeMap1.get("Имя1"));
		System.out.println(treeMap1.containsKey("Имя2"));
		System.out.println(treeMap1.get("Имя2"));
		System.out.println(treeMap1.containsKey("Имя3"));
		System.out.println(treeMap1.get("Имя3"));
	}
}
