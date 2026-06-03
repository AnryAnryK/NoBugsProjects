package dz_12_TestsCode.DopTasksTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/*
11. Фильтрация списка чисел (оставить только чётные)

Метод:
public List<Integer> filterEvenNumbers(List<Integer> numbers) {
    return numbers.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());
}
Тесты:
Обычный список ([1, 2, 3, 4, 5, 6] → [2, 4, 6])
Список без чётных чисел
Пустой список
 */

class MainTask11Test{

	public List<Integer> filterEvenNumbers(List<Integer> numbers) {
		return numbers.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
	}
}

public class Task11Test {

	@Test
	@DisplayName("Позитивные тесты: Обычный список ([1, 2, 3, 4, 5, 6] → [2, 4, 6])")
	public void filterEvenNumbersPositiveTests(){
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> expectedList1 = Arrays.asList(2, 4, 6);
		MainTask11Test mainTask11Test = new MainTask11Test();
		List<Integer> actualResultList1 = mainTask11Test.filterEvenNumbers(list1);
		assertEquals(expectedList1, actualResultList1);
	}

	@Test
	@DisplayName("Негативные тесты: Список без чётных чисел ([1, 3, 5])")
	public void filterWithoutEvenNumbersNegativeTests(){
		List<Integer> list1 = Arrays.asList(1, 3, 5);
//		List<Integer> expectedList1 = Arrays.asList();  // так можно ?
		List<Integer> expectedList1 = Collections.emptyList();
		MainTask11Test mainTask11Test = new MainTask11Test();
		List<Integer> actualResultList1 = mainTask11Test.filterEvenNumbers(list1);
		assertEquals(expectedList1, actualResultList1);
	}

	@Test
	@DisplayName("Негативные тесты: Пустой Список")
	public void filterEmptyNumbersNegativeTests(){
//		List<Integer> list1 = Arrays.asList(); // так можно ?
		List<Integer> list1 = Collections.emptyList();
		List<Integer> expectedList1 = Collections.emptyList();
		MainTask11Test mainTask11Test = new MainTask11Test();
		List<Integer> actualResultList1 = mainTask11Test.filterEvenNumbers(list1);
		assertEquals(expectedList1, actualResultList1);
	}
}
