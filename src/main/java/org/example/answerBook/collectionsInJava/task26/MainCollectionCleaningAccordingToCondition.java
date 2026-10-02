package org.example.answerBook.collectionsInJava.task26;

public class MainCollectionCleaningAccordingToCondition {
	public static void main(String[] args) {
		CollectionCleaningAccordingToCondition collectionCleaningAccordingToCondition = new CollectionCleaningAccordingToCondition();
		collectionCleaningAccordingToCondition.printList();
		collectionCleaningAccordingToCondition.addElementToList(1);
		collectionCleaningAccordingToCondition.addElementToList(2);
		collectionCleaningAccordingToCondition.addElementToList(3);
		collectionCleaningAccordingToCondition.printList();
		collectionCleaningAccordingToCondition.removeEvenNumbers();
		collectionCleaningAccordingToCondition.printList();
	}
}
