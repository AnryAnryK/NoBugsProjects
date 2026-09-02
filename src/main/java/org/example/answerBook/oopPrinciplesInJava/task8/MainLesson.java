package org.example.answerBook.oopPrinciplesInJava.task8;

import java.util.ArrayList;
import java.util.List;

public class MainLesson {


	public static void main(String[] args) {
		List<Lesson> lessonList = new ArrayList<>();

		Lesson videoLesson1 = new VideoLesson();
		Lesson videoLesson2 = new VideoLesson();
		Lesson liveSession = new LiveSession();
		Lesson homeworkLesson = new HomeworkLesson();

		lessonList.add(videoLesson1);
		lessonList.add(videoLesson2);
		lessonList.add(liveSession);
		lessonList.add(homeworkLesson);

		lessonList.forEach(lesson -> System.out.println("Название урока: " + lesson.getTitle() + "; Продолжительность урока: " + lesson.getDuration()));

		Lesson.printDurationAllLessons(lessonList);
	}
}
