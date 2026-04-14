package org.example.dz_6_OopPrinciplesInJava.task7_ThemePark;

public class RollerCoaster extends Attraction {

	@Override
	public void showInformationAboutAttraction(){
		System.out.println("'Американские горки'");
	}

	@Override
	public void service(){
		System.out.println(" - Проверка безопасности аттракциона");
	}
}
