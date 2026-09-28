package org.example.answerBook.collectionsInJava.task18;

/*
18. Дни недели и задачи на них
 Храни задачи, распределённые по дням недели. Выведи все задачи понедельника.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DaysOfWeekAndTasksForThem {

	private static final Map<String, List<String>> tasks = new HashMap<>();

	public static void put(String day, String task) {
		tasks.putIfAbsent(day, new ArrayList<>());
		tasks.get(day).add(task);
	}

	public static void printTasksByDay(String day) {
		if (tasks.containsKey(day)) {
			for (String task : tasks.get(day)) {
				System.out.println("Задачи на " + day + " : " + task);
			}
		}
	}
}
