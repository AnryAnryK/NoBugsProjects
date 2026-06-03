package dz_12_TestsCode.DopTasksTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
20. Проверка, содержит ли массив дубликаты

Метод:
public boolean hasDuplicates(int[] numbers) {
    return Arrays.stream(numbers).distinct().count() != numbers.length;
}

Тесты:
[1, 2, 3, 4, 5] → false
[1, 2, 2, 3] → true
Пустой массив → false
 */



class MainTask20Test {

	public boolean hasDuplicates(int[] numbers) {
		return Arrays.stream(numbers).distinct().count() != numbers.length;
	}
}

public class Task20Test {
	@Test
	@DisplayName("Позитивные тесты: проверка содержит ли массив дубликаты (при наличии дубликатов)")
	public void checkArrayHasDuplicatesIfThereAreDuplicatesPositiveTests() {
		MainTask20Test mainTask20Test = new MainTask20Test();
		int[] arrayHasDuplicates = {1, 2, 2, 5};
		boolean actualResultArrayHasDuplicates = mainTask20Test.hasDuplicates(arrayHasDuplicates);
		assertTrue(actualResultArrayHasDuplicates);
	}

	@Test
	@DisplayName("Негативные тесты: проверка содержит ли массив дубликаты (при отсутствии дубликатов)")
	public void checkArrayHasDuplicatesIfThereAreNotDuplicatesNegativeTests() {
		MainTask20Test mainTask20Test = new MainTask20Test();
		int[] arrayHasNoDuplicates = {1, 2, 3, 4, 5};
		boolean actualResultArrayHasNoDuplicates = mainTask20Test.hasDuplicates(arrayHasNoDuplicates);
		assertFalse(actualResultArrayHasNoDuplicates);
	}

	@Test
	@DisplayName("Негативные тесты: проверка содержит ли массив дубликаты (пустой массив)")
	public void checkArrayHasNoDuplicatesInEmptyArrayNegativeTests() {
		MainTask20Test mainTask20Test = new MainTask20Test();
		int[] arrayHasNoDuplicatesInEmptyArray = {};
		boolean actualResultArrayHasNoDuplicatesInEmptyArray = mainTask20Test.hasDuplicates(arrayHasNoDuplicatesInEmptyArray);
		assertFalse(actualResultArrayHasNoDuplicatesInEmptyArray);
	}

	@Test
	@DisplayName("Негативные тесты: проверка содержит ли массив дубликаты (null в массиве)")
	public void checkArrayHasNoDuplicatesInNullValueArrayNegativeTests() {
		MainTask20Test mainTask20Test = new MainTask20Test();
		int[] arrayHasNoDuplicatesInNullValueArray = null;
		assertThrows(NullPointerException.class, () -> mainTask20Test.hasDuplicates(arrayHasNoDuplicatesInNullValueArray));
	}
}
