package org.example.answerBook.oopPrinciplesInJava.task13;

/*
13. Простой графический редактор (Интерфейс + Поведение)
 Создай интерфейс Drawable с методом draw().
Реализуй Line, Rectangle, Text, каждый рисуется по-разному.
Создай Canvas, в котором можно хранить и вызывать draw() у всех объектов.
Пояснение: работа через общий интерфейс без знания конкретных типов.
 */

public interface Drawable {
	String draw();
}
