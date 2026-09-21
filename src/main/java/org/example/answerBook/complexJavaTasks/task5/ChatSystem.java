package org.example.answerBook.complexJavaTasks.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ChatSystem {
	private final List<Message> history = new ArrayList<>();

	public void send(Message message) {
		history.add(message);
	}

	public List<Message> getHistoryByUser(User user) {
		return history.stream().filter(x -> x.getSender().equals(user)
						|| x.getReceiver().equals(user))
				.collect(Collectors.toList());
	}
}
