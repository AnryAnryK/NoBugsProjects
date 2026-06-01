package dz_12_TestsCode.MainTasksTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
10. Проверка валидности номера телефона

Напишите тесты для метода, который проверяет валидность телефонного номера:

public boolean isValidPhoneNumber(String phone) {
    return phone.matches("\\+\\d{1,3} \\d{10}");
}

Тесты должны проверять:
Корректные номера ("+1 1234567890")
Некорректные номера ("12345", "invalid")
 */



class MainTask10Test{

	public boolean isValidPhoneNumber(String phone) {
		return phone.matches("\\+\\d{1,3} \\d{10}");
	}
}

public class Task10Test {

	@Test
	@DisplayName("Позитивные тесты: проверка корректного номера телефона")
	public void checkCorrectNumberTests(){
		MainTask10Test mainTask10Test = new MainTask10Test();
		String validPhoneNumber = "+1 1234567890";
		boolean actualResultvalidPhoneNumber = mainTask10Test.isValidPhoneNumber(validPhoneNumber);
		assertTrue(actualResultvalidPhoneNumber);
	}



	@ParameterizedTest
	@ValueSource(strings = {"1 1234567890", "+1 12345678"})
	@DisplayName("Негативные тесты: проверка некорректного номера телефона")
	public void checkIncorrectNumberTests(String input){
		MainTask10Test mainTask10Test = new MainTask10Test();
		assertFalse(mainTask10Test.isValidPhoneNumber(input));
	}
}
