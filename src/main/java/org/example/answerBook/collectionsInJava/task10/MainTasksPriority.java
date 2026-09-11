package org.example.answerBook.collectionsInJava.task10;

public class MainTasksPriority {
	public static void main(String[] args) {
		TasksPriority tasksPriority = new TasksPriority();
		tasksPriority.addTask("Поставить будильник", 4);
		tasksPriority.addTask("Принять душ",3);
		tasksPriority.addTask("Позавтракать", 2);
		tasksPriority.addTask("Успеть на работу", 4);

		tasksPriority.showTasks();
	}
}
