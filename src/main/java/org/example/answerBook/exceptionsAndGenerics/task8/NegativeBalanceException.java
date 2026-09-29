package org.example.answerBook.exceptionsAndGenerics.task8;

public class NegativeBalanceException extends RuntimeException {
	public NegativeBalanceException(String message) {
		super(message);
	}
}
