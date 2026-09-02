package org.example.answerBook.oopPrinciplesInJava.task8;

public class VideoLesson extends Lesson {
	private  final double DURATION_OF_VIDEO_LESSON  = 30.5;

	@Override
	public String getTitle() {
		return ("Видео-урок: (" + getClass().getSimpleName() + ")");
	}

	@Override
	public double getDuration() {
		return DURATION_OF_VIDEO_LESSON;
	}
}
