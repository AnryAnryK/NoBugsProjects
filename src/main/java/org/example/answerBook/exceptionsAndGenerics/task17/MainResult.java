package org.example.answerBook.exceptionsAndGenerics.task17;

public class MainResult {
	public static void main(String[] args) {
		Result<String> resultOk = Result.ok("Отлично");
		Result<String> resultNotOk = Result.err("Удивительно");

		if (resultOk.isSuccess()) {
			System.out.println("Корректный Результат: " + resultOk.getValue());
		} else {
			System.out.println("Некорректный Результат: " + resultOk.getError());
		}

		if (resultNotOk.isSuccess()) {
			System.out.println("Корректный Результат: " + resultNotOk.getValue());
		} else {
			System.out.println("Некорректный Результат: " + resultNotOk.getError());
		}
	}
}
