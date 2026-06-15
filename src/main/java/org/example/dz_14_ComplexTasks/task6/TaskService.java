package org.example.dz_14_ComplexTasks.task6;

import org.example.dz_14_ComplexTasks.task5.OutOfStockException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TaskService<T> {

	private final List<Task<T>> listOfTasks = new ArrayList<>();

	public Task addTask(Task<T> task) {
		listOfTasks.add(task);
		return task;
	}

	public synchronized boolean removeTask(T id) {
		return listOfTasks.removeIf(task -> Objects.equals(task.getId(),id));
	}

	public List<Task<T>> findTaskByStatus(String status) throws RuntimeException {
		if (status.isEmpty()){
			throw new RuntimeException("Статус не заполнен");
		}

		return listOfTasks.stream()
				.filter(x -> x.getStatus()
						.equals(status))
				.collect(Collectors.toList());
	}

	public List<Task<T>> findTaskByPriority(String priority) {
		return listOfTasks.stream()
				.filter(x -> x.getPriority()
						.equals(priority))
				.collect(Collectors.toList());
	}

	public List<Task<T>> sortedTaskByDate() {
		return listOfTasks.stream()
				.sorted(Comparator.comparing(Task::getDate))
				.collect(Collectors.toList());
	}
}
