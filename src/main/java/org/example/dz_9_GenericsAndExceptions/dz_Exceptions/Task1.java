package org.example.dz_9_GenericsAndExceptions.dz_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {

	/*
	1. Обработка проверяемого исключения
Условие задачи:
Напишите программу, которая пытается открыть файл с именем "data.txt".
Если файл не найден, программа должна обработать исключение и вывести сообщение: "Файл не найден".
	 */

	public static void main(String[] args) {

		try {
			FileReader fileReader = new FileReader("data.txt");
			fileReader.read();
		} catch (IOException e) {
			System.out.println("Файл не найден");
		}
	}
}
