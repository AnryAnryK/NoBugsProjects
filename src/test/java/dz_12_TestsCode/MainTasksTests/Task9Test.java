package dz_12_TestsCode.MainTasksTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
9. Подсчёт количества слов в строке
Напишите тесты для метода, который считает количество слов в строке:

public int countWords(String sentence) {
    return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
}

Тесты должны проверять:
Пустую строку
null
Строку с несколькими пробелами
 */



class MainTask9Test {

	public int countWords(String sentence) {
		return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
	}
}

public class Task9Test {

	@Test
	@DisplayName("Позитивные тесты: подсчёт слов в обычной строке")
	public void countWordsInSimpleString(){
		MainTask9Test mainTask9Test = new MainTask9Test();
		int actualResultForCountWordsInString = mainTask9Test.countWords("Привет, мир !");
		assertEquals(3, actualResultForCountWordsInString);
	}

	@Test
	@DisplayName("Позитивные тесты: подсчёт слов в обычной строке с несколькими пробелами (5 пробелов)")
	public void countWordsInSimpleStringWithSomeSpace(){
		MainTask9Test mainTask9Test = new MainTask9Test();
		int actualResultForCountWordsInString = mainTask9Test.countWords("     ");
		assertEquals(0, actualResultForCountWordsInString);
	}

	@Test
	@DisplayName("Позитивные тесты: подсчёт слов в пустой строке")
	public void countWordsInEmptyString(){
		MainTask9Test mainTask9Test = new MainTask9Test();
		int actualResultForCountWordsInString = mainTask9Test.countWords("");
		assertEquals(0, actualResultForCountWordsInString);
	}

	@Test
	@DisplayName("Негативные тесты: подсчёт слов при указании null")
	public void countWordsInNullString(){
		MainTask9Test mainTask9Test = new MainTask9Test();
		assertThrows(NullPointerException.class, () -> mainTask9Test.countWords(null));
	}
}
