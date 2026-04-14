package org.example.dz_8_Java_Collections.linkedHashMap.task2;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

		LinkedHashMap<Integer, String> linkedHashMap1 = new LinkedHashMap<>();
		linkedHashMap1.put(123123, "Иванов");
		linkedHashMap1.put(124124, "Петров");
		linkedHashMap1.put(125125, "Сидоров");
		linkedHashMap1.put(126126, "Якубович");

		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Введите Значение : ");
		Integer key1 = scanner1.nextInt();

		if (linkedHashMap1.containsKey(key1)) {
			System.out.println("Фамилия (значение) : " + linkedHashMap1.get(key1));
		} else {
			System.out.println("Значение отсутствует !");
		}
		scanner1.close();
	}
}

