package org.example.dz_14_ComplexTasks.task3;

import java.util.ArrayList;
import java.util.List;

public class GradeService<T extends Number> {
	StudentGrade<T> studentGrade;

	private final List<StudentGrade<T>> studentsGradeList = new ArrayList<>();

	public synchronized void addGrade(StudentGrade<T> studentGrade) throws InvalidGradeException {
		double doubleValueGetMarkResult = studentGrade.getMark().doubleValue();
		if (doubleValueGetMarkResult <= 0) {
			throw new InvalidGradeException("Оценка не может быть 0 или отрицательной, введите положительное число !");
		}
		studentsGradeList.add(studentGrade);
	}

	public synchronized double avgMarkBySubject(String subject) {

		Integer count = 0;
		Double sum = 0.0;

		for (StudentGrade<T> avgGrade : studentsGradeList) {
			if (subject.equals(avgGrade.getSubject())) {
				sum = sum + avgGrade.getMark().doubleValue();
				count++;
			}
		}

		if (count > 0) {
			return sum / count;
		} else return 0.0;
	}
}


