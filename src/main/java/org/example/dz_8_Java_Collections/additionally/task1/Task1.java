package org.example.dz_8_Java_Collections.additionally.task1;

import java.util.HashMap;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap1 = new HashMap<>();
		hashMap1.put(1, "Иванов");
		hashMap1.put(2, "Петров");
		hashMap1.put(3, "Сидоров");

		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Введите ID : ");
		int int1 = scanner1.nextInt();
		String str1 = hashMap1.get(int1);

		do {
			System.out.println("Пользователь с заданным ID : " + int1 + "; Фамилия : " + str1 + " - есть в базе");
		}
			while (!hashMap1.containsKey(1)) ;
	}
}
