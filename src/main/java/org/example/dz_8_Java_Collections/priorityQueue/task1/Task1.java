package org.example.dz_8_Java_Collections.priorityQueue.task1;

import java.util.PriorityQueue;

public class Task1 {

	public static void main(String[] args) {

		PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>();
		priorityQueue1.add(10);
		priorityQueue1.add(2);
		priorityQueue1.add(3);
		priorityQueue1.add(40);
		priorityQueue1.add(5);

		while (!priorityQueue1.isEmpty()) {
			System.out.println(priorityQueue1.poll());
		}
	}
}
