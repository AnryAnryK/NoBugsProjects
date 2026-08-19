package org.example.answerBook.oopPrinciplesInJava.task3;

/*
3. Уведомления в системе (Полиморфизм через интерфейс)
 Создай интерфейс NotificationSender с методом send(String message).
Реализуй три класса: EmailSender, SmsSender, PushSender, каждый из которых реализует метод отправки по-своему.
Создай метод notifyUsers(List<NotificationSender> senders, String msg), который вызывает send() у каждого отправителя.
Пояснение: полиморфизм на основе интерфейса, возможность вызывать одинаковые действия у разных объектов.
 */

public interface NotificationSender {
	public void send(String message);
}
