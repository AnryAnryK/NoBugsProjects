package dz_12_TestsCode.MainTasksTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
4. Поиск максимального числа в массиве
Напишите тесты для метода, который находит максимальное число в массиве:

public int findMax(int[] numbers) {
    return Arrays.stream(numbers).max().orElseThrow();
}

Тесты должны проверять:
Обычный массив ([3, 5, 7, 2])
Один элемент в массиве
Отрицательные числа
Пустой массив (должно выбрасываться исключение)
 */


class MainTask4Test {

	public int findMax(int[] numbers) {
		return Arrays.stream(numbers).max().orElseThrow();
	}
}

public class Task4Test {

	public static Stream<Arguments> findMaxNumberInArray() {
		return Stream.of(
				Arguments.of(new int[]{3, 5, 7, 2}, 7),
				Arguments.of(new int[]{3}, 3),
				Arguments.of(new int[]{-3, -5, 0, -0, 1}, 1));
	}

	@ParameterizedTest
	@MethodSource("findMaxNumberInArray")
	@DisplayName("Позитивные тесты: поиск максимального числа в Обычном массиве, в Массиве с одним элементом, в Массиве с отрицательными значениями")
	public void findMaxNumberInArrayPositiveTests(int[] numbers, int maxNumber) {
		MainTask4Test mainTask4Test = new MainTask4Test();
		int actualMaxNumber = mainTask4Test.findMax(numbers);
		assertEquals(maxNumber, actualMaxNumber);
	}


	@Test
	@DisplayName("Негативные тесты: поиск максимального числа в Пустом массиве (должно выбрасываться исключение)")
	public void findMaxNumberInEmptyArrayNegativeTest() {
		int[] emptyArray = {};
		MainTask4Test mainTask4Test = new MainTask4Test();
		assertThrows(NoSuchElementException.class, () -> mainTask4Test.findMax(emptyArray));
	}
}
