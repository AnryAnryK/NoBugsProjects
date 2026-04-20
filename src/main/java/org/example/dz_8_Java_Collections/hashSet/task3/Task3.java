package org.example.dz_8_Java_Collections.hashSet.task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {

	public Set<String> removeDuplicates(List<String> list1) {
		HashSet<String> set1 = new HashSet<>();
		set1.addAll(list1);
		return set1;
	}

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("Апельсин");
		list1.add("Яблоко");
		list1.add("Груша");
		list1.add("Апельсин");

		Task3 task3 = new Task3();
		System.out.println(task3.removeDuplicates(list1));
	}
}
