package org.example.dz_8_Java_Collections.treeSet.task3;

import java.util.TreeSet;

public class Task3 {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet1 = new TreeSet<>();
		treeSet1.add(1);
		treeSet1.add(3);
		treeSet1.add(2);

		System.out.println("Меньшее число из множества : " + treeSet1.first());
		System.out.println("Большее число из множества : " + treeSet1.last());
	}
}
