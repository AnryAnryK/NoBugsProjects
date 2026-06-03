package dz_12_TestsCode.DopTasksTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
12. Сортировка списка строк по длине

Метод:
public List<String> sortByLength(List<String> words) {
    return words.stream()
        .sorted(Comparator.comparingInt(String::length))
        .collect(Collectors.toList());
}

Тесты:
[ "Java", "C", "Python" ] → [ "C", "Java", "Python" ]
Одинаковые длины ([ "aa", "bb", "cc" ])
Пустой список
 */

class MainTask12Test {

	public List<String> sortByLength(List<String> words) {
		return words.stream()
				.sorted(Comparator.comparingInt(String::length))
				.collect(Collectors.toList());
	}
}

public class Task12Test {
	@Test
	@DisplayName("Позитивные тесты: Сортировка обычного списка строк по длине")
	public void sortSimpleListByLengthPositiveTests() {
		List<String> list1 = Arrays.asList("Петрова_7", "Иванов_6", "Сидорович_9");

		MainTask12Test mainTask12Test = new MainTask12Test();
		List<String> expectedResultlist1 = Arrays.asList("Иванов_6", "Петрова_7", "Сидорович_9");;
		List<String> actualResultlist1 = mainTask12Test.sortByLength(list1);
		assertEquals(expectedResultlist1, actualResultlist1);
	}

	@Test
	@DisplayName("Позитивные тесты: Сортировка списка со строками одинаковой длины")
	public void sortListWithSameStringsByLengthPositiveTests() {
		List<String> list1 = Arrays.asList("aa", "bb", "cc");

		MainTask12Test mainTask12Test = new MainTask12Test();
		List<String> expectedResultlist1 = Arrays.asList("aa", "bb", "cc");;
		List<String> actualResultlist1 = mainTask12Test.sortByLength(list1);
		assertEquals(expectedResultlist1, actualResultlist1);
	}

	@Test
	@DisplayName("Негативные тесты: Сортировка пустого списка")
	public void sortEmptyListByLengthPositiveTests() {
		List<String> list1 = Collections.emptyList();

		MainTask12Test mainTask12Test = new MainTask12Test();
		List<String> expectedResultlist1 = Collections.emptyList();
		List<String> actualResultlist1 = mainTask12Test.sortByLength(list1);
		assertEquals(expectedResultlist1, actualResultlist1);
	}
}
