package org.example.dz_8_Java_Collections.treeSet.task2;

import java.util.TreeSet;

public class Task2 {

	public void addNumberWithoutDuplicate(TreeSet treeSet1, int number) {
		treeSet1.add(number);
	}

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		Task2 task2 = new Task2();

		task2.addNumberWithoutDuplicate(treeSet, 1);
		task2.addNumberWithoutDuplicate(treeSet, 3);
		task2.addNumberWithoutDuplicate(treeSet, 2);
		task2.addNumberWithoutDuplicate(treeSet, 3);

		System.out.println(treeSet);
	}
}

