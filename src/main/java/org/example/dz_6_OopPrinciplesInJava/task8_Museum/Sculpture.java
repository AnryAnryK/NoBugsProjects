package org.example.dz_6_OopPrinciplesInJava.task8_Museum;

public class Sculpture extends Exhibit {

	private String story = "V век, древняя Греция";


	@Override
	public void storageConditions() {
		System.out.println("Нуждается в реставрации");
	}

	@Override
	public void showInformationAboutExhibit() {
		System.out.println("Скульптура " + story);
	}
}
