package org.example.answerBook.funcInterfaceLambdaStreamAPI.task12;

import java.util.Arrays;

public class MainConvertingObjectsIntoSingleField {
	public static void main(String[] args) {
		ConvertingObjectsIntoSingleField convertingObjectsIntoSingleField = new ConvertingObjectsIntoSingleField();
		User user1 = new User("ya@.a1.com");
		User user2 = new User("ya@.a2.com");
		User user3 = new User("ya@.a3.com");

		System.out.println("Список всех их email-адресов: " + convertingObjectsIntoSingleField.getAllUsersEmails(Arrays.asList(user1, user2, user3)));
	}
}
