package org.example.answerBook.oopPrinciplesInJava.task8;

public class LiveSession extends Lesson {
	private final double DURATION_OF_LIVE_LESSON = 45.5;

	@Override
	public String getTitle() {
		return ("Живая сессия: ('" + getClass().getSimpleName()+ ")");
	}

	@Override
	public double getDuration() {
		return DURATION_OF_LIVE_LESSON;
	}
}
