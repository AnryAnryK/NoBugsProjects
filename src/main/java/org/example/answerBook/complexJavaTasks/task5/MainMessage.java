package org.example.answerBook.complexJavaTasks.task5;

public class MainMessage {
	public static void main(String[] args) {
		User user1 = new User("Петя");
		User user2 = new User("Вася");

		Message message1 = new Message(user1, user2, "Hi");
		Message message2 = new Message(user1, user2, "Вася");

		ChatSystem chatSystem = new ChatSystem();
		chatSystem.send(message1);
		chatSystem.send(message2);

		System.out.println(chatSystem.getHistoryByUser(user1));

	}
}
