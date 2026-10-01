package org.example.answerBook.exceptionsAndGenerics.task16;

public class MainStorage {
	public static void main(String[] args) {
		Storage<String> storage1 = new Storage<>();
		storage1.save("спички");
		Storage<Integer> storage2 = new Storage<>();
		storage2.save(1);
	}
}
