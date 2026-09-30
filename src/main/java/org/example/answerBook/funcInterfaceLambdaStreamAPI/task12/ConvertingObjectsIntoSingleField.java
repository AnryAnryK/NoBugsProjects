package org.example.answerBook.funcInterfaceLambdaStreamAPI.task12;

/*
12. Преобразование объектов в одно поле
 Из списка User получи список всех их email-адресов через map().
 */

import java.util.List;
import java.util.stream.Collectors;

public class ConvertingObjectsIntoSingleField {

	public List<String> getAllUsersEmails(List<User> users) {
		return users.stream().map(user -> user.getEmail()).collect(Collectors.toList());
	}
}
