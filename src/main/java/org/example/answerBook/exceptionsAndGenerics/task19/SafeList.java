package org.example.answerBook.exceptionsAndGenerics.task19;

/*
19. Безопасный список
 Класс SafeList<T> с обработкой исключений.
 */

import java.util.ArrayList;
import java.util.List;

public class SafeList<T> {
	private List<T> value;

	public SafeList(List<T> value) {
		this.value = new ArrayList<>(value);
	}

	public void add(T item) {
		value.add(item);
	}

	public void exceptionHandling() {
		try {
			for (int i = 0; i <= value.size(); i++)
				System.out.println("Выполняем код: " + "индекс -> "+ i + ", значение -> " + value.get(i));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Ловим исключение: " + e.getMessage());
		}
	}
}
