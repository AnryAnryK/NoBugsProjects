package org.example.answerBook.collectionsInJava.task3;

/*
3. Список последних задач
 Храни только последние 5 задач, над которыми работал пользователь. При добавлении новой старейшая удаляется.
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class RecentTasks {
	private Deque<String> recentFiveTasks = new ArrayDeque<>();

	public void storageTasks(String task) {
		if(task.isEmpty()){
			System.out.println("Задача не может быть null");
		}
		recentFiveTasks.offer(task);
		if (recentFiveTasks.size() > 5) {
			recentFiveTasks.pollFirst();
		}
	}

	public void printRecentFiveTasks() {
		recentFiveTasks.forEach(System.out::println);
	}
}
