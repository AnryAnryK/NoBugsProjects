package dz_14_ComplexTasks.task3;

import org.example.dz_14_ComplexTasks.task3.GradeService;
import org.example.dz_14_ComplexTasks.task3.InvalidGradeException;
import org.example.dz_14_ComplexTasks.task3.StudentGrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GradeServiceTest {

	@Test
	@DisplayName("Позитивные тесты: допустимые значения (оценка/mark не '0' и не отрицательное число")
	public void positiveTests() throws InvalidGradeException {
		GradeService gradeService1 = new GradeService();

		StudentGrade studentGrade1 = new StudentGrade("Петя", "Химия", 3);
		gradeService1.addGrade(studentGrade1);
		StudentGrade studentGrade2 = new StudentGrade("Петя", "Химия", 5);
		gradeService1.addGrade(studentGrade2);

		Double actualAvgMarkBySubjectResult = gradeService1.avgMarkBySubject("Химия");
		assertEquals(4.0, actualAvgMarkBySubjectResult);
	}

	public static Stream<Arguments> notValidDataForNegativeTests() {
		return Stream.of(Arguments.of(0.0),
				Arguments.of(-3.0));
	}

	@ParameterizedTest
	@MethodSource("notValidDataForNegativeTests")
	@DisplayName("Негативные тесты: недопустимые значения (оценка/mark '0' и/или отрицательное число")
	public void negativeTests(Double mark) {
		GradeService gradeService1 = new GradeService();
		StudentGrade studentGrade1 = new StudentGrade("Петя", "Химия", mark);
		assertThrows(InvalidGradeException.class, () -> gradeService1.addGrade(studentGrade1));
	}
}
