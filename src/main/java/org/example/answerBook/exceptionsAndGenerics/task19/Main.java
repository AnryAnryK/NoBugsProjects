package org.example.answerBook.exceptionsAndGenerics.task19;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		SafeList<String> stringSafeList = new SafeList<>(List.of("Ноль","Один"));
		stringSafeList.exceptionHandling();
		stringSafeList.add("Два");
		stringSafeList.exceptionHandling();
	}
}
