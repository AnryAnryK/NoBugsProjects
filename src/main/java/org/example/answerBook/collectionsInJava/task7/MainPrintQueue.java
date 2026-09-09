package org.example.answerBook.collectionsInJava.task7;

public class MainPrintQueue {
	public static void main(String[] args) {
		PrintQueue printQueue = new PrintQueue();
		printQueue.addDocument("График");
		printQueue.addDocument("Ведомость");
		printQueue.addDocument("Платёжка");

		while (!printQueue.isEmpty()) {
			printQueue.printAllDocuments();
			printQueue.processNextDocument();
		}
	}
}
