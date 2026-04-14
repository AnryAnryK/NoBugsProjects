package org.example.dz_8_Java_Collections.linkedHashMap.task3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {

	public static void main(String[] args) {

		//задача НЕ сделана

		LinkedHashMap<Integer, String> linkedHashMap1 = new LinkedHashMap<>(10);
		linkedHashMap1.put(1, "Глава 1");
		linkedHashMap1.put(2, "Глава 2");
		linkedHashMap1.put(3, "Глава 3");
		linkedHashMap1.put(4, "Глава 4");
		linkedHashMap1.put(5, "Глава 5");
		linkedHashMap1.put(6, "Глава 6");
		linkedHashMap1.put(7, "Глава 7");
		linkedHashMap1.put(8, "Глава 8");
		linkedHashMap1.put(9, "Глава 9");
		linkedHashMap1.put(10, "Глава 10");
		linkedHashMap1.put(11, "Глава 11");


		for (Map.Entry<Integer, String> entry1 : linkedHashMap1.entrySet()) {
			System.out.println(entry1);

//			через if пытался вызвать метод .replace у linkedHashMap1. В него нужно внести два аргумента:
//			- первый, как я думаю, это размер Map, т.е. linkedHashMap1.size()
//					- второй - это последний элемент Map, который нужно заменить, т.е. что-то типа .remove или .replace, или даже .merge)

//			if (linkedHashMap1.replace(linkedHashMap1.size(), linkedHashMap1.){
//
//			}
		}
	}
}
