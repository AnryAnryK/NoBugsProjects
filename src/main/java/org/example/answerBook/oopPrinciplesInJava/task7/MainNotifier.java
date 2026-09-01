package org.example.answerBook.oopPrinciplesInJava.task7;

public class MainNotifier {
	public static void main(String[] args) {
		EmailNotifier emailNotifier = new EmailNotifier();
		emailNotifier.getChannelName();
		TelegramNotifier telegramNotifier = new TelegramNotifier();
		telegramNotifier.getChannelName();
		AppNotifier appNotifier = new AppNotifier();
		appNotifier.getChannelName();

		User petya = new User("Петя", new EmailNotifier());
		User vasya = new User("Вася", new TelegramNotifier());
		User dusya = new User("Дуся", new AppNotifier());

		petya.sendMessage("Привет всем по e-mail");
		vasya.sendMessage("Привет всем по Телеграмм");
		dusya.sendMessage("Привет всем по app");

		petya.setNotifier(new TelegramNotifier());
		petya.sendMessage("а я теперь и в Телеграмм");
	}
}
