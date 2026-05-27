package dz_12_TestsCode.MainTasksTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
2. Подсчёт количества гласных в строке
Напишите тесты для метода, который считает количество гласных букв в строке:

public int countVowels(String input) {
    if (input == null) {
        throw new IllegalArgumentException("Input cannot be null");
    }
    return (int) input.toLowerCase().chars()
            .filter(c -> "aeiou".indexOf(c) != -1)
            .count();
}

Тесты должны проверять:
Разные строки ("hello", "java", "AEIOU", "")
null (должно выбрасываться исключение)
Строки без гласных
 */


class MainTask2Test {

	public int countVowels(String input) {
		if (input == null) {
			throw new IllegalArgumentException("Input cannot be null");
		}
		return (int) input.toLowerCase().chars()
				.filter(c -> "aeiou".indexOf(c) != -1)
				.count();
	}
}


public class Task2Test {

	public static Stream<Arguments> dataForCountVowelsPositiveTests() {
		return Stream.of(
				Arguments.of("hello", 2),
				Arguments.of("java", 2),
				Arguments.of("AEIOU", 5),
				Arguments.of("", 0));
	}


	@ParameterizedTest
	@MethodSource("dataForCountVowelsPositiveTests")
	@DisplayName("Позитивные тесты: Подсчёт количества гласных букв в строке")
	public void countVowelsPositiveTests(String input, int expectedCount) {
		MainTask2Test mainTask2Test = new MainTask2Test();
		int actualCount = mainTask2Test.countVowels(input);
		assertEquals(expectedCount, actualCount);
	}


	public static Stream<Arguments> dataForCountVowelsNegativeTests() {
		return Stream.of(
				Arguments.of("12345", 0),
				Arguments.of("0_|%/.?", 0));
	}


	@ParameterizedTest
	@MethodSource("dataForCountVowelsNegativeTests")
	@DisplayName("Негативные тесты: Подсчёт троки без гласных")
	public void countVowelsNegativeTests(String input, int expectedCount) {
		MainTask2Test mainTask2Test = new MainTask2Test();
		int actualCount = mainTask2Test.countVowels(input);
		assertEquals(expectedCount, actualCount);
	}


	@Test
	@DisplayName("Негативный тест/корнер тест: Проверка на null (должно выбрасываться исключение)")
	public void checkCountWithNullValueNegativeTest() {
		MainTask2Test mainTask2Test = new MainTask2Test();
		Exception exception = assertThrows(IllegalArgumentException.class, () -> mainTask2Test.countVowels(null));
		String expectedMessage = "Input cannot be null";
		String actualMessage = exception.getMessage();
		assertEquals(expectedMessage, actualMessage);
	}
}
