package org.example.answerBook.exceptionsAndGenerics.task3;

/*
3. Стек с дженериками
 Реализация обобщённого стека.
 */

import java.util.EmptyStackException;
import java.util.Stack;

public class StackWithGenerics<E> {
	public static void main(String[] args) {
		StackWithGenerics<String> stackWithGenerics = new StackWithGenerics<>();
		stackWithGenerics.push("Первый");
		stackWithGenerics.push("Второй");
		stackWithGenerics.push("Третий");

		System.out.println("Стек -> пустой ? :" + stackWithGenerics.isEmpty());
		System.out.println("Размер стека: " + stackWithGenerics.size());
		System.out.println("Извлечена верхушка стека : " + stackWithGenerics.pop());
		System.out.println("Стек -> пустой ? :" + stackWithGenerics.isEmpty());
		System.out.println("Размер стека: " + stackWithGenerics.size());
		System.out.println("Отображение верхушки стека : " + stackWithGenerics.peek());
		System.out.println("Стек -> пустой ? :" + stackWithGenerics.isEmpty());
		System.out.println("Размер стека: " + stackWithGenerics.size());
		System.out.println("Извлечена верхушка стека : " + stackWithGenerics.pop());
		System.out.println("Извлечена верхушка стека : " + stackWithGenerics.pop());
		System.out.println("Стек -> пустой ? :" + stackWithGenerics.isEmpty());
		System.out.println("Размер стека: " + stackWithGenerics.size());
		System.out.println("Извлечена верхушка стека : " + stackWithGenerics.pop());
	}

	private Stack<E> values = new Stack<>();

	public void push(E value) {
		values.push(value);
	}

	public E pop() {
		if (values.isEmpty()) {
			throw new EmptyStackException();
		}
		return values.pop();
	}

	public E peek() {
		if (values.isEmpty()) {
			throw new EmptyStackException();
		}
		return values.peek();
	}

	public int size() {
		return values.size();
	}

	public boolean isEmpty() {
		return values.isEmpty();
	}
}
