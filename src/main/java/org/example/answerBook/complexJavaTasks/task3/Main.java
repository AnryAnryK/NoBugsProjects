package org.example.answerBook.complexJavaTasks.task3;

/*
Менеджер задач
Сделай класс TaskManager, где можно добавлять задачи с приоритетом, описанием и статусом.
Добавь возможность фильтрации по статусу и приоритету, а также сортировку задач.
 */

public class Main {

	public static void main(String[] args) {

		Tasks task1 = new Tasks(PrioritiesCodes.Критичный, "Исправить кнопку запуска", StatusesCodes.В_работе);
		Tasks task2 = new Tasks(PrioritiesCodes.Высокий, "Сменить UI", StatusesCodes.В_архиве);
		Tasks task3 = new Tasks(PrioritiesCodes.Средний, "Перекрасить цвет Поисковой строки", StatusesCodes.На_рассмотрении);

		TaskManager tm1 = new TaskManager();
		tm1.addTask(task1);
		tm1.addTask(task2);
		tm1.addTask(task3);

		System.out.println("=== Фильтр по Статусу 'В работе' ===");
		tm1.filterTaskByStatus(StatusesCodes.В_работе).forEach(System.out::println);

		System.out.println("=== Фильтр по Приоритету 'Высокий' ===");
		tm1.filterTaskByPriority(PrioritiesCodes.Высокий).forEach(System.out::println);

		System.out.println("=== Сортировка по Статусу ===");
		tm1.sortedTasksByStatus().forEach(System.out::println);

		System.out.println("=== Сортировка по Приоритету ===");
		tm1.sortedTasksByPriority().forEach(System.out::println);

		System.out.println("=== Сортировка по Описанию ===");
		tm1.sortedTasksByDescription().forEach(System.out::println);

	}
}
