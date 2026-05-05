package org.example.dz_9.dz_Exceptions;

import java.io.FileReader;

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
		} catch (Exception e) {
			System.out.println("Файл не найден");
		}
	}
}
