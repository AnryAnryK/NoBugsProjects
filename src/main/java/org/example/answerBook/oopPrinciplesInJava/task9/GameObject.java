package org.example.answerBook.oopPrinciplesInJava.task9;

/*
9. Игровой объект и абстрактное поведение (Интерфейс + Полиморфизм)
 Создай интерфейс GameObject с методами update() и render().
Реализуй Enemy, Player, CollectibleItem. Каждый объект должен по-разному реагировать на update().
Создай игровой цикл, где каждый объект вызывается в цикле.
Пояснение: полиморфизм через поведение — клиентский код не должен зависеть от конкретных типов.
 */

public interface GameObject {
	String update();

	String render();
}
