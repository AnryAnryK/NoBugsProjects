package dz_12_TestsCode.MainTasksTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
7. Факториал числа
Напишите тесты для метода, который вычисляет факториал числа:

public int factorial(int n) {
    if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
    return (n == 0) ? 1 : n * factorial(n - 1);
}
Тесты должны проверять:
0! = 1
Маленькие числа (1!, 5!, 7!)
Отрицательные числа (должно выбрасываться исключение)
 */


class MainTask7Test {

	public int factorial(int n) {
		if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
		return (n == 0) ? 1 : n * factorial(n - 1);
	}
}


public class Task7Test {

	public static Stream<Arguments> checkFactorialPositiveTests() {
		return Stream.of(Arguments.of(0, 1),
				Arguments.of(1, 1),
				Arguments.of(5, 120),
				Arguments.of(7, 5040));
	}

	@ParameterizedTest
	@MethodSource("checkFactorialPositiveTests")
	@DisplayName("Позитивные тесты: проверка факториала небольших положительных чисел")
	public void checkFactorialWithSmallNumbersPositiveTests(int n, int actualN) {
		MainTask7Test mainTask7Test = new MainTask7Test();
		int actualFactorialNumber = mainTask7Test.factorial(n);
		assertEquals(actualN, actualFactorialNumber);
	}


	@ParameterizedTest
	@ValueSource(ints = {-1, -2, -10})
	@DisplayName("Позитивные тесты: проверка факториала небольших положительных чисел")
	public void checkFactorialNegativeNumberNegativeTests(int n) {
		MainTask7Test mainTask7Test = new MainTask7Test();
		assertThrows(IllegalArgumentException.class, () -> mainTask7Test.factorial(n));
	}
}
