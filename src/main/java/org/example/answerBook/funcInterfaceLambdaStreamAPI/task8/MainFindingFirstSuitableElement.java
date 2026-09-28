package org.example.answerBook.funcInterfaceLambdaStreamAPI.task8;

public class MainFindingFirstSuitableElement {
	public static void main(String[] args) {
		FindingFirstSuitableElement findingFirstSuitableElement = new FindingFirstSuitableElement();

		findingFirstSuitableElement.add("Январь");
		findingFirstSuitableElement.add("Август");
		findingFirstSuitableElement.add("Антверпен");

		System.out.println(findingFirstSuitableElement.findFirstStartingWithA().orElse("ничего не найдено"));
	}
}
