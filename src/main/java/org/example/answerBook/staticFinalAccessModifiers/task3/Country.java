package org.example.answerBook.staticFinalAccessModifiers.task3;

/*
3. Страна с фиксированным кодом
 Создай класс Country, в котором указывается код страны (например, "RU" или "US").
Этот код задаётся один раз при создании и не может быть изменён после.
Он должен быть доступен извне только для чтения.
Пояснение: реши, как ограничить доступ на изменение, но при этом позволить читать значение.
 */

public class Country {
	private final String code;

	public Country(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
