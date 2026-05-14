package org.example.dz_9_GenericsAndExceptions.dz_9_dopTasks;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

	/*
	3. Работа с числами:
Объявите класс NumberBox<T extends Number>
Внутри храните список чисел List<T>
В методе getSum() пройдитесь по списку и суммируйте значения, используя doubleValue()
Метод возвращает сумму в виде double
	 */

	public static void main(String[] args) {
		NumberBox<Double> numberBox1Double = new NumberBox<>();
		numberBox1Double.addNumber(1.1);
		numberBox1Double.addNumber(2.2);
		System.out.println(numberBox1Double.getSum());
	}
}

class NumberBox<T extends Number> {
	private List<T> numbers = new ArrayList<>();

	public void addNumber(T number) {
		numbers.add(number);
	}


	public Double getSum() {
		double summ = 0.0;
		for (T number : numbers) {
			summ += number.doubleValue();
		}
		return summ;
	}
}