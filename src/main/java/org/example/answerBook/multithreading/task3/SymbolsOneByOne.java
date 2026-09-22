package org.example.answerBook.multithreading.task3;

/*
3. Символы по очереди
 Создай два потока: один печатает "A", другой — "B". Добейся чередующегося вывода символов: ABABAB... ровно 10 раз.
 */

public class SymbolsOneByOne {
	boolean isTurn = true;
	String result = "";

	public synchronized void printA() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			while (!isTurn) {
				wait();
			}
			result = result + "A";
			System.out.print("A");
			isTurn = false;
			notifyAll();
		}
	}

	public synchronized void printB() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			while (isTurn) {
				wait();
			}
			result = result + "B";
			System.out.print("B");
			isTurn = true;
			notifyAll();
		}
	}
}
