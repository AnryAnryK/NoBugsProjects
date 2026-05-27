package dz_12_TestsCode.MainTasksTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
1. Проверка чётности числа
Напишите тесты для метода, который определяет, является ли число чётным:

public boolean isEven(int number) {
    return number % 2 == 0;
}

Тесты должны проверять:
Чётные и нечётные числа
Нулевое значение
Отрицательные числа
 */

class MainTask1Test {
	public boolean isEven(int number) {
		return number % 2 == 0;
	}
}

public class Task1Test extends MainTask1Test {

	MainTask1Test mainTask1Test1 = new MainTask1Test();


	@ParameterizedTest
	@ValueSource(ints = {4, 0, -2})
	@DisplayName("Положительные сценарии: Тест на проверку Чётных чисел: положительное чётное число, нулевое значение, отрицательное чётное число")
	public void checkNumberIsEvenPositiveScenario(int number) {
		boolean actualResult = mainTask1Test1.isEven(number);
		assertTrue(actualResult);
	}


	@ParameterizedTest
	@ValueSource(ints = {3, -1})
	@DisplayName("Отрицательные сценарии: Тест на проверку Чётных чисел: положительное нечётное число, отрицательное нечётное число")
	public void checkNumberIsNotEvenNegativeScenario(int number) {
		boolean actualResult = mainTask1Test1.isEven(number);
		assertFalse(actualResult);
	}
}
