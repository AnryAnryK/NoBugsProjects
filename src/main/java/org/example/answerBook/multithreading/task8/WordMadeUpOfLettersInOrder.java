package org.example.answerBook.multithreading.task8;

/*
8. Слово из букв по очереди
 Создай 3 потока: один печатает C, второй — A, третий — T. Добейся, чтобы на выходе было CATCATCAT... (10 повторов).
 */

public class WordMadeUpOfLettersInOrder {
	private char currentLetter = 'C';

	public synchronized void printC() throws InterruptedException {
		while (currentLetter != 'C') {
			wait();
		}
		System.out.print("C");
		currentLetter = 'A';
		notifyAll();
	}

	public synchronized void printA() throws InterruptedException {
		while (currentLetter != 'A') {
			wait();
		}
		System.out.print("A");
		currentLetter = 'T';
		notifyAll();
	}

	public synchronized void printT() throws InterruptedException {
		while (currentLetter != 'T') {
			wait();
		}
		System.out.print("T");
		currentLetter = 'C';
		notifyAll();
	}
}
