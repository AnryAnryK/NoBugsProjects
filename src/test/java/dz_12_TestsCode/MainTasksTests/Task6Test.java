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
6. Проверка валидности email
Напишите тесты для метода, который проверяет, является ли строка валидным email:

public boolean isValidEmail(String email) {
    return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
}

Тесты должны проверять:
Корректные и некорректные email ("test@example.com", "bad@.com", "no-at-symbol")
null
 */


class MainTask6Test {
	public boolean isValidEmail(String email) {
		return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
	}

}

public class Task6Test {

	public static Stream<Arguments> correctEmailPositiveTest() {
		return Stream.of(Arguments.of("test@example.com", true),
				Arguments.of("test.tast@example.com", true));
	}


	@ParameterizedTest
	@MethodSource("correctEmailPositiveTest")
	@DisplayName("Позитивные тесты: проверка корректного email")
	public void testCorrectEmailPositiveTest(String email) {
		MainTask6Test mainTask6Test = new MainTask6Test();
		boolean actualValidEmail = mainTask6Test.isValidEmail(email);
		assertTrue(actualValidEmail);
	}

	public static Stream<Arguments> incorrectEmailNegaiveTest() {
		return Stream.of(Arguments.of("testexample.com", false),
				Arguments.of("test.tast@example", false));
	}


	@ParameterizedTest
	@MethodSource("incorrectEmailNegaiveTest")
	@DisplayName("Негативные тесты: проверка некорректного email")
	public void testIncorrectEmailNegaiveTest(String email) {
		MainTask6Test mainTask6Test = new MainTask6Test();
		boolean actualValidEmail = mainTask6Test.isValidEmail(email);
		assertFalse(actualValidEmail);
	}

	@Test
	@DisplayName("Негативные тесты: проверка на null")
	public void testIncorrectEmailByNullNegaiveTest() {
		MainTask6Test mainTask6Test = new MainTask6Test();
		String nullEmail = null;
		boolean actualnullEmail = mainTask6Test.isValidEmail(nullEmail);
		assertFalse(actualnullEmail);
	}
}
