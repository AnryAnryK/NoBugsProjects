package org.example.answerBook.collectionsInJava.task10;

import java.util.Objects;

public class Task implements Comparable<Task> {
	private String task;
	private int priority;

	public Task(String task, int priority) {
		this.task = task;
		this.priority = priority;
	}

	public String getTask() {
		return task;
	}

	public int getPriority() {
		return priority;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Task task1 = (Task) o;
		return priority == task1.priority && Objects.equals(task, task1.task);
	}

	@Override
	public int hashCode() {
		return Objects.hash(task, priority);
	}

	@Override
	public String toString() {
		return task + " (приоритет " + priority + ")";
	}

	@Override
	public int compareTo(Task o) {
		return Integer.compare(o.priority, this.priority);
	}
}
