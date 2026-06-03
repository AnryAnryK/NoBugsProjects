package dz_12_TestsCode.DopTasksTests;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
19. Проверка, является ли строка JSON-объектом

Метод:
import com.fasterxml.jackson.databind.ObjectMapper;
public boolean isValidJson(String json) {
    try {
        new ObjectMapper().readTree(json);
        return true;
    } catch (Exception e) {
        return false;
    }
}

Тесты:
"{"key":"value"}" → true
"invalid json" → false
null → false
 */

class MainTask19Test{

	public boolean isValidJson(String json) {
		try {
			new ObjectMapper().readTree(json);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}

public class Task19Test {
	@Test
	@DisplayName("Позитивные тесты: проверка, является ли строка JSON-объектом при корректном написании {\"key\":\"value\"}")
	public void checkIsValidJsonPositiveTests(){
		MainTask19Test mainTask19Test = new MainTask19Test();
		String validJson = "{\"key\":\"value\"}";
		boolean actualResaltValidJson = mainTask19Test.isValidJson(validJson);
		assertTrue(actualResaltValidJson);
	}

	@Test
	@DisplayName("Негативные тесты: проверка, является ли строка JSON-объектом при некорректном написании {\"key\"\"value\"}")
	public void checkIsNotValidJsonNagativeTests(){
		MainTask19Test mainTask19Test = new MainTask19Test();
		String notValidJson = "{\"key\"\"value\"}";
		boolean actualResaltNotValidJson = mainTask19Test.isValidJson(notValidJson);
		assertFalse(actualResaltNotValidJson);
	}

	@Test
	@DisplayName("Негативные тесты: проверка на null")
	public void checkNullIsNotValidJsonNagativeTests(){
		MainTask19Test mainTask19Test = new MainTask19Test();
		String notValidJson = null;
		boolean actualResaltNotValidJson = mainTask19Test.isValidJson(notValidJson);
		assertFalse(actualResaltNotValidJson);
	}
}
