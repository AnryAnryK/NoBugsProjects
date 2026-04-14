package org.example.dz_8_Java_Collections.additionally.task5;

import java.util.ArrayDeque;

public class Task5 {
	ArrayDeque<String> arrayDeque1 = new ArrayDeque<>();

	public void addAction(String action){
		arrayDeque1.push(action);
		System.out.println("Произведено Действие : " + action);
	}

	public void deleteAction(String action){
		arrayDeque1.pop();
		System.out.println("Произведено Действие : " + action);
	}

	public void showLastAction(String action){
		arrayDeque1.addLast(action);
		System.out.println("Произведено Последнее Действие : " + action);
	}

	public static void main(String[] args) {

		Task5 task5 = new Task5();
		task5.addAction("Создание");
		task5.addAction("Редактирование");
		task5.deleteAction("Удаление");

		task5.showLastAction("Удаление");
	}
}
