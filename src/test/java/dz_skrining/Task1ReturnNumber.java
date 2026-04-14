package dz_skrining;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Task1ReturnNumber {

	//	"Задача: Напишите функцию, которая принимает массив чисел и возвращает сумму его элементов.
	int[] a = {1, 3, 4, 5};


	@Test
	public void returnNumber() {
		System.out.println("Сумма элементов массива = " + Arrays.stream(a).sum());
	}
}
