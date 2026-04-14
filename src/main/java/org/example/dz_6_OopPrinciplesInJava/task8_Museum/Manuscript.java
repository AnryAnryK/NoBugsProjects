package org.example.dz_6_OopPrinciplesInJava.task8_Museum;

public class Manuscript extends Exhibit {

	private String story = "III век, династия Цзинь";


	@Override
	public void storageConditions() {
		System.out.println("Требует контролируемой влажности");
	}

	@Override
	public void showInformationAboutExhibit() {
		System.out.println("Манускрипт " + story);
	}
}
