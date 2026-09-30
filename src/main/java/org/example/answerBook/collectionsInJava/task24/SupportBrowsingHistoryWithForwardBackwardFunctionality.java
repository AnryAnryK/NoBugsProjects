package org.example.answerBook.collectionsInJava.task24;

/*
24. Поддержка истории посещений с возможностью "вперёд/назад"
 Создай структуру, где можно переходить вперёд и назад между страницами.
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class SupportBrowsingHistoryWithForwardBackwardFunctionality {

	private String currentPage = null;
	private Deque<String> backPage = new ArrayDeque<>();
	private Deque<String> forwardPage = new ArrayDeque<>();


	public String openPage(String url) {
		if (currentPage != null) {
			backPage.push(currentPage);
			forwardPage.clear();
		}
		currentPage = url;
		return currentPage;
	}

	public String moveForward() {
		if (!forwardPage.isEmpty()) {
			backPage.push(currentPage);
			currentPage = forwardPage.pop();
		} else {
			throw new IllegalStateException("Страница 'вперёд' отсутствует");
		}
		return currentPage;
	}

	public String moveBack() {
		if (backPage.isEmpty()) {
			throw new IllegalStateException("Страница 'назад' отсутствует");
		}
		forwardPage.push(currentPage);
		currentPage = backPage.pop();
		return currentPage;
	}
}
