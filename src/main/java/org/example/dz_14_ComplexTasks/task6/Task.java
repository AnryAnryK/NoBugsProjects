package org.example.dz_14_ComplexTasks.task6;

/*
Задача 6: Сервис задач (Task Manager)

Общее описание:
Разработайте сервис для управления задачами, который позволяет добавлять, удалять и искать задачи по различным критериям.
Каждая задача будет иметь уникальный идентификатор обобщённого типа, статус, приоритет и дату.

Функциональные требования:
Классы и интерфейсы:
Task<T>:
+ Класс, представляющий задачу. Должен содержать поля для ID, статуса, приоритета и даты.

TaskService<T>:
Сервис для управления задачами, включающий методы для добавления, удаления и поиска задач.

Управление задачами:
+ Добавление задачи: Метод для добавления новой задачи в список.
+ Удаление задачи: Метод для удаления задачи по ID. Метод должен быть синхронизирован для предотвращения конкурентного доступа.
+ Поиск задач: Методы для фильтрации задач по статусу и приоритету, а также сортировка задач по дате.

Обработка данных:
Использование Stream API для фильтрации и сортировки задач.
Лямбда-выражения для сортировки задач по дате.
 */

public class Task<T> {
	private final int id;
	private final String status;
	private final String priority;
	private final String date;


	public Task(int id, String status, String priority, String date) {
		this.id = id;
		this.status = status;
		this.priority = priority;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public String getStatus() {
		return status;
	}

	public String getPriority() {
		return priority;
	}

	public String getDate() {
		return date;
	}
}
