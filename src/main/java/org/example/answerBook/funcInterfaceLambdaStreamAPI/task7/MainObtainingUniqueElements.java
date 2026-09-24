package org.example.answerBook.funcInterfaceLambdaStreamAPI.task7;

public class MainObtainingUniqueElements {
	public static void main(String[] args) {
		ObtainingUniqueElements.addNumber(1);
		ObtainingUniqueElements.addNumber(1);
		ObtainingUniqueElements.addNumber(3);
		ObtainingUniqueElements.addNumber(3);
		ObtainingUniqueElements.addNumber(2);
		System.out.println(ObtainingUniqueElements.distinctSorted());
	}
}
