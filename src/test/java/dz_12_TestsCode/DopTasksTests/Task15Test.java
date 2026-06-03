package dz_12_TestsCode.DopTasksTests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
15. Преобразование списка строк в список их длин

Метод:
public List<Integer> mapToLengths(List<String> words) {
    return words.stream().map(String::length).collect(Collectors.toList());
}

Тесты:
[ "Java", "C++", "Go" ] → [ 4, 3, 2 ]
Пустой список
 */

class MainTask15Test {

	public List<Integer> mapToLengths(List<String> words) {
		return words.stream().map(String::length).collect(Collectors.toList());
	}
}


public class Task15Test {

	@Test
	@DisplayName("Позитивные тесты: Преобразование списка строк в список их длин строк")
	public void checkMapToLengthsInSimpleListOfStringsPositiveTests() {
		List<String> list1 = Arrays.asList("Томаты", "Дыня", "Картофель");
		MainTask15Test mainTask15Test = new MainTask15Test();
		List<Integer> expectedIntResult = Arrays.asList(6, 4, 9);
		List<Integer> actualIntResult = mainTask15Test.mapToLengths(list1);
		System.out.println("Ожидаемый результат: " + mainTask15Test.mapToLengths(list1));
		assertEquals(expectedIntResult, actualIntResult);
	}

	@Test
	@DisplayName("Позитивные тесты: Преобразование пустого списка строк в список их длин строк")
	public void checkMapToLengthsInSimpleEmptyListOfStringsPositiveTests() {
		List<String> list1 = Collections.emptyList();
		MainTask15Test mainTask15Test = new MainTask15Test();
		List<Integer> expectedIntResult = Collections.emptyList();
		List<Integer> actualIntResult = mainTask15Test.mapToLengths(list1);
		System.out.println("Ожидаемый результат: " + mainTask15Test.mapToLengths(list1));
		assertEquals(expectedIntResult, actualIntResult);
	}
}
