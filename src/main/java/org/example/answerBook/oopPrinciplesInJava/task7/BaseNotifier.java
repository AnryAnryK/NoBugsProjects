package org.example.answerBook.oopPrinciplesInJava.task7;

public abstract class BaseNotifier implements Notifier {
	@Override
	public void notify(User user, String text) {
		System.out.println("Пользователь '" + user.getUserName() + "' через Ресурс рассылки '" + getClass().getSimpleName() + "' направил сообщение : '" + getChannelName() + "'");
	}

	abstract String getChannelName();
}
