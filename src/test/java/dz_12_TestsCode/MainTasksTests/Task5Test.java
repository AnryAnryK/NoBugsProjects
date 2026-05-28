package dz_12_TestsCode.MainTasksTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
5. Проверка, является ли год високосным
Напишите тесты для метода, который определяет, является ли год високосным:

public boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}

Тесты должны проверять:
Обычные годы
Високосные (2020, 2000, 1600)
Года, которые делятся на 100, но не на 400 (1900, 2100)
 */


class MainTask5Test {

	public boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
}

public class Task5Test {


	public static Stream<Arguments> checkIsNotLeapYear() {
		return Stream.of(
				Arguments.of(2026),
				Arguments.of(1026));
	}

	@ParameterizedTest
	@MethodSource("checkIsNotLeapYear")
	@DisplayName("Позитивные тесты: проверка является ли год високосным (Обычный год: 2026, 1026)")
	public void checkIsNotLeapYearPositiveTests(int year) {
		MainTask5Test mainTask5Test = new MainTask5Test();
		boolean actualResult = mainTask5Test.isLeapYear(year);
		assertFalse(actualResult);
		System.out.println("Год: " + year + " - НЕ високосный");
		System.out.println("======================================================");
	}


	public static Stream<Arguments> checkIsLeapYear() {
		return Stream.of(
				Arguments.of(0),
				Arguments.of(2020),
				Arguments.of(2000));
	}

	@ParameterizedTest
	@MethodSource("checkIsLeapYear")
	@DisplayName("Позитивные тесты: проверка является ли год високосным (Високосный год: 0; 2020; 2000")
	public void checkIsLeapYearPositiveTests(int year) {
		MainTask5Test mainTask5Test = new MainTask5Test();
		boolean actualResult = mainTask5Test.isLeapYear(year);
		assertTrue(actualResult);
		System.out.println("Год: " + year + " - високосный");
		System.out.println("======================================================");
	}

	public static Stream<Arguments> checkIsLeapYearNegative() {
		return Stream.of(
				Arguments.of(-3),
				Arguments.of('a'));
	}

	@ParameterizedTest
	@MethodSource("checkIsLeapYearNegative")
	@DisplayName("Негативные тесты: проверка является ли год високосным (Год: 0, -3, 'a')")
	/* год "-3" с моей точки зрения вполне допустимо, т.к. летоисчисление (сейчас 2026 год) началось не 2026 лет назад, а гораздо раньше,
	т.е. год "- 3" нам показывает какие годы до Рождества Христова (или до нашей эры, если угодны) были високосными */
	public void checkIsLeapYearNegativeTests(int year) {
		MainTask5Test mainTask5Test = new MainTask5Test();
		boolean actualResult = mainTask5Test.isLeapYear(year);
		assertFalse(actualResult);
		System.out.println("Год: " + year + " - НЕ високосный");
		System.out.println("======================================================");
	}

	@Test
	@DisplayName("Негативные тесты: проверка является ли год високосным (Год, который делится на 100, но не на 400 (2100)")
	public void checkIsLeapYearDivisionOn100ButNotDivisionOn400PositiveTests() {
		MainTask5Test mainTask5Test = new MainTask5Test();
		int yearDivisionOn100ButNotDivisionOn400 = 2100;
		boolean actualResult = mainTask5Test.isLeapYear(yearDivisionOn100ButNotDivisionOn400);
		assertFalse(actualResult);
		System.out.println("Год: " + yearDivisionOn100ButNotDivisionOn400 + " - делится на 100, но не на 400 - НЕ високосный");
		System.out.println("======================================================");
	}
}
