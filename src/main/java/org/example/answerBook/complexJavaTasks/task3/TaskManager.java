package org.example.answerBook.complexJavaTasks.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {

	List<Tasks> tasksList = new ArrayList<>();


	public void addTask(Tasks task) {
		tasksList.add(task);
	}

	public List<Tasks> filterTaskByStatus(StatusesCodes status) {
		return tasksList.stream().filter(x ->
						x.getStatus() == status)
				.collect(Collectors.toList());
	}

	public List<Tasks> filterTaskByPriority(PrioritiesCodes priority) {
		return tasksList.stream().filter(x ->
						x.getPriority() == priority)
				.collect(Collectors.toList());
	}

	public List<Tasks> sortedTasksByStatus() {
		return tasksList.stream().sorted(Comparator.comparing(Tasks::getStatus)).collect(Collectors.toList());
	}

	public List<Tasks> sortedTasksByPriority() {
		return tasksList.stream().sorted(Comparator.comparing(Tasks::getPriority)).collect(Collectors.toList());
	}

	public List<Tasks> sortedTasksByDescription() {
		return tasksList.stream().sorted(Comparator.comparing(Tasks::getDescription)).collect(Collectors.toList());
	}
}
