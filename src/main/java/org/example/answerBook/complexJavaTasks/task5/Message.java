package org.example.answerBook.complexJavaTasks.task5;

/*
Симулятор сообщений в чате
 Напиши систему, в которой можно отправлять сообщения между пользователями (класс Message, User, ChatSystem).
 Поддержи просмотр истории сообщений по пользователю.
 */

public class Message {
	private final User sender;
	private final User receiver;
	private final String text;

	public Message(User sender, User receiver, String text) {
		this.sender = sender;
		this.receiver = receiver;
		this.text = text;
	}

	public User getSender() {
		return sender;
	}

	public User getReceiver() {
		return receiver;
	}

	public String getText() {
		return text;
	}

	@Override
	public String toString() {
		return "Сообщение по-списку ->  {" + "Отправитель: " + sender + ", Получатель: " + receiver + ", Сообщение: " + text + " }";
	}
}
