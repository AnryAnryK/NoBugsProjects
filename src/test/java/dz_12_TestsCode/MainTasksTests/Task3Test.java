package dz_12_TestsCode.MainTasksTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/*
	3. Разворот строки
Напишите тесты для метода, который переворачивает строку:

public String reverse(String input) {
    if (input == null) return null;
    return new StringBuilder(input).reverse().toString();
}

Тесты должны проверять:
Обычные строки
Пустую строку
null (должно возвращаться null)
	 */


class MainTask3Test {

	public String reverse(String input) {
		if (input == null) return null;
		return new StringBuilder(input).reverse().toString();
	}
}

public class Task3Test {

	public static Stream<Arguments> reverseStringsPositive() {
		return Stream.of(
				Arguments.of("Привет, мир ! "),
				Arguments.of("м"),
				Arguments.of("123456"),
				Arguments.of("/"),
				Arguments.of(""));
	}

	@ParameterizedTest
	@MethodSource("reverseStringsPositive")
	@DisplayName("Позитивные тесты: проверка - Обычные строки, Символ, Пустая строка")
	public void reverseStringsPositiveTests(String input){
		MainTask3Test mainTask3Test = new MainTask3Test();
		String actualResult = mainTask3Test.reverse(input);
		String actualResultFinal = mainTask3Test.reverse(actualResult);
		assertEquals(input, actualResultFinal);
	}

	@Test
	@DisplayName("Позитивный тест: проверка на: null (должно возвращаться null)")
	public void reverseStringsWihtNullPositiveTest(){
		MainTask3Test mainTask3Test = new MainTask3Test();
		String actualResult = mainTask3Test.reverse(null);
		assertNull(null, actualResult);
	}
}



