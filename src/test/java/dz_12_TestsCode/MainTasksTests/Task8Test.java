package dz_12_TestsCode.MainTasksTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
8. Поиск второго максимального числа в массиве
Напишите тесты для метода, который находит второе по величине число:

public int findSecondMax(int[] numbers) {
    return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
}

Тесты должны проверять:
Обычные массивы
Массив с одинаковыми числами
Один элемент в массиве (должно выбрасываться исключение)
 */

class MainTask8Test {

	public int findSecondMax(int[] numbers) {
		return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
	}
}


public class Task8Test {

	@Test
	@DisplayName("Позитивные тесты: обычный массив")
	public void findSecondMaxNumberInArrayPositiveTests() {
		int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		MainTask8Test mainTask8Test = new MainTask8Test();
		int actualResultarray1 = mainTask8Test.findSecondMax(array1);
		assertEquals(8, actualResultarray1);
	}

	@Test
	@DisplayName("Негативные тесты: массив с одинаковыми числами")
	public void findSecondMaxNumberInArrayWithSameNumbersNegativeTests() {
		int[] array1 = {1, 1, 1, 1};
		MainTask8Test mainTask8Test = new MainTask8Test();
		assertThrows(NoSuchElementException.class, () -> mainTask8Test.findSecondMax(array1));
	}

	@Test
	@DisplayName("Негативные тесты: один элемент в массиве")
	public void findSecondMaxNumberInArrayWithOneNumberInArrayNegativeTests() {
		int[] array1 = {0};
		MainTask8Test mainTask8Test = new MainTask8Test();
		assertThrows(IllegalArgumentException.class, () -> mainTask8Test.findSecondMax(array1));
	}
}
