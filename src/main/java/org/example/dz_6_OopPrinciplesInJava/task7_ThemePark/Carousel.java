package org.example.dz_6_OopPrinciplesInJava.task7_ThemePark;

public class Carousel extends Attraction {

	@Override
	public void showInformationAboutAttraction(){
		System.out.println("'Карусель'");
	}

	@Override
	public void service(){
		System.out.println(" - Техническое обслуживание аттракциона");
	}
}
