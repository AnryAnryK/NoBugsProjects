package org.example.answerBook.collectionsInJava.task10;

/*
10. Список задач с приоритетами
 Храни задачи с приоритетами. Выводи сначала наиболее важные.
 */

import java.util.PriorityQueue;
import java.util.Queue;

public class TasksPriority {
	private Queue<Task> tasks = new PriorityQueue<>();

	public boolean addTask(String task, int priority) {
		return tasks.offer(new Task(task, priority));
	}

	public void showTasks() {
		while (!tasks.isEmpty()) {
			System.out.println(tasks.poll());
		}
	}
}
