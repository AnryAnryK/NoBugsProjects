package org.example.answerBook.collectionsInJava.task18;


public class MainDaysOfWeekAndTasksForThem {
	public static void main(String[] args) {

		DaysOfWeekAndTasksForThem.put("Понедельник", "Купить продукты");
		DaysOfWeekAndTasksForThem.put("Понедельник", "Сходить в кино");
		DaysOfWeekAndTasksForThem.put("Вторник", "Постирать бельё");
		DaysOfWeekAndTasksForThem.put("Вторник", "Поиграть в мяч");

		DaysOfWeekAndTasksForThem.printTasksByDay("Понедельник");
	}
}
