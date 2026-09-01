package org.example.answerBook.oopPrinciplesInJava.task7;

/*
7. Система уведомлений (Полиморфизм + Расширяемость)
 Создай интерфейс Notifier с методом notify(User user, String text).
Реализуй EmailNotifier, TelegramNotifier, AppNotifier.
Добавь механизм переключения канала: пользователь может выбрать свой тип оповещения.
Пояснение: нужно проектировать так, чтобы система могла легко расширяться без изменения клиентского кода.
 */

public interface Notifier {
	public void notify(User user, String text);
}
