package dz_12_TestsCode.DopTasksTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
14. Нахождение среднего значения массива чисел

Метод:
public double findAverage(int[] numbers) {
    return Arrays.stream(numbers).average().orElseThrow();
}

Тесты:
[1, 2, 3, 4, 5] → 3.0
[10] → 10.0
Пустой массив (должно выбрасываться исключение)
 */


class MainTask14Test {

	public double findAverage(int[] numbers) {
		return Arrays.stream(numbers).average().orElseThrow();
	}
}

public class Task14Test {

	@Test
	@DisplayName("Позитивные тесты: Тест поиска среднего значения массива из нескольких чисел")
	public void findAverageInSimpleArrayWithSomeNumbersPositiveTests() {
		MainTask14Test mainTask14Test = new MainTask14Test();
		double actualResult = mainTask14Test.findAverage(new int[]{1, 2, 3, 4, 5});
		assertEquals(3, actualResult);
	}

	@Test
	@DisplayName("Позитивные тесты: Тест поиска среднего значения массива из одного числа")
	public void findAverageInSimpleArrayWithOneNumberPositiveTests() {
		MainTask14Test mainTask14Test = new MainTask14Test();
		double actualResult = mainTask14Test.findAverage(new int[]{1});
		assertEquals(1, actualResult);
	}

	@Test
	@DisplayName("Негативные тесты: Тест поиска среднего значения пустого массива")
	public void findAverageInEmptyArrayWithNegativeTests() {
		MainTask14Test mainTask14Test = new MainTask14Test();
		int[] emptyArray = {};
		assertThrows(NoSuchElementException.class, () -> mainTask14Test.findAverage(emptyArray));
	}
}
