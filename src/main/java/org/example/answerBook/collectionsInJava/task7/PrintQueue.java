package org.example.answerBook.collectionsInJava.task7;

/*
7. Очередь печати
 Документы попадают в очередь на печать. Обрабатывай их в порядке поступления.
 */

import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {
	private Queue<String> documents = new LinkedList<>();

	public void addDocument(String document) {
		documents.offer(document);
	}

	public void processNextDocument() {
		String doc = documents.poll();
		if (doc != null) {
			System.out.println("Печатается: " + doc);
		} else {
			System.out.println("Нет документов в очереди на обработку");
		}
	}

	public void printAllDocuments() {
		if (!documents.isEmpty()) {
			System.out.println("Документы в очереди: " + documents);
		} else {
			System.out.println("Очередь пуста");
		}
	}

	public boolean isEmpty() {
		return documents.isEmpty();
	}
}
