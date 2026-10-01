package org.example.answerBook.funcInterfaceLambdaStreamAPI.task13;

/*
13. Создание списка через Supplier
 Создай список из 5 случайных чисел от 1 до 10, используя Supplier<Integer>.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CreatingListViaSupplier {

	public List<Integer> generateListWithRandomNumbers() {
		Supplier<Integer> numberGenerator1 = () -> (int) (Math.random() * 10) + 1;

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			list.add(numberGenerator1.get());
		}
		return list;
	}
}
