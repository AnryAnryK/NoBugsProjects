package org.example.answerBook.oopPrinciplesInJava.task8;

/*
8. Онлайн-курс и абстракция типов уроков (Абстракция + Полиморфизм)
 Создай абстрактный класс Lesson с методами getTitle() и getDuration().
Реализуй VideoLesson, LiveSession, HomeworkLesson.
Создай метод, который печатает общее время прохождения списка разных уроков.
Пояснение: задача на использование абстракции, не зная конкретного типа урока.
 */

import java.util.List;

public abstract class Lesson {

	public abstract String getTitle();

	public abstract double getDuration();

	public static void printDurationAllLessons(List<Lesson> list) {
		double totalDurationOfAllLessons = list.stream().mapToDouble(Lesson::getDuration).sum();
		System.out.println("Общее время прохождения всех уроков: " + totalDurationOfAllLessons + " мин.");
	}
}
