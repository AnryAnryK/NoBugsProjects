package org.example.dz_14_ComplexTasks.task6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService<T> {
	Task task;
	private final List<Task> listOfTasks = new ArrayList<>();

	public Task addTask(Task task) {
		listOfTasks.add(task);
		return task;
	}

	public synchronized boolean removeTask(int id) {
		return listOfTasks.removeIf(task -> task.getId() == id);
	}

	public List<Task> findTaskByStatus(String status) {
		return listOfTasks.stream()
				.filter(x -> x.getStatus()
						.equals(status))
				.collect(Collectors.toList());
	}

	public List<Task> findTaskByPriority(String priority) {
		return listOfTasks.stream()
				.filter(x -> x.getPriority()
						.equals(priority))
				.collect(Collectors.toList());
	}

	public List<Task> sortedTaskByDate(String date) {
		return listOfTasks.stream()
				.sorted(Comparator.comparing(Task::getDate))
				.collect(Collectors.toList());
	}
}
