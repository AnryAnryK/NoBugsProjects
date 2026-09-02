package org.example.answerBook.oopPrinciplesInJava.task8;

public class HomeworkLesson extends Lesson {

	private final double DURATION_OF_HOMEWORK_LESSON = 60.0;

	@Override
	public String getTitle() {
		return ("Домашний урок: ('" + getClass().getSimpleName() + ")");
	}

	@Override
	public double getDuration() {
		return DURATION_OF_HOMEWORK_LESSON;
	}
}
