package org.example.answerBook.exceptionsAndGenerics.task17;

/*
17. Результат с ошибкой
 Обёртка Result<T> с результатом или ошибкой.
 */

public class Result<T> {
	private T value;
	private final String error;
	private final boolean success;

	public Result(T value, String error, boolean success) {
		this.value = value;
		this.error = error;
		this.success = success;
	}

	static <T> Result<T> ok(T value) {
		return new Result<>(value, null, true);
	}

	static <T> Result<T> err(String err) {
		return new Result<>(null, err, false);
	}

	public boolean isSuccess() {
		return success;
	}

	public T getValue() {
		return value;
	}

	public String getError() {
		return error;
	}
}
