package org.example.answerBook.complexJavaTasks.task3;

public class Tasks {

	private PrioritiesCodes priority;
	private String description;
	private StatusesCodes status;


	public Tasks(PrioritiesCodes priority, String description, StatusesCodes status) {
		this.priority = priority;
		this.description = description;
		this.status = status;
	}

	public PrioritiesCodes getPriority() {
		return priority;
	}

	public void setPriority(PrioritiesCodes priority) {
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public StatusesCodes getStatus() {
		return status;
	}

	public void setStatus(StatusesCodes status) {
		this.status = status;
	}

	@Override
	public String toString(){
		return "Задача с Приоритетом: " + priority + ", Описанием: " + description + ", Статусом: " + status;
	}
}
