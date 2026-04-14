package org.example.dz_6_OopPrinciplesInJava.task7_ThemePark;

public class ThemePark {

	private Attraction attraction;

	public void setAttraction(Attraction attraction){
		this.attraction = attraction;
	}

	public void manageAttraction(Attraction attraction){
		this.attraction = attraction;
		System.out.println("Управление аттракционом : ");
		attraction.showInformationAboutAttraction();
		attraction.startAttraction();
		attraction.stopAttraction();
		attraction.service();
	}

	public static void main(String[] args) {

		ThemePark themePark1 = new ThemePark();
		Attraction rollerCoaster1 = new RollerCoaster();
		themePark1.setAttraction(rollerCoaster1);
		themePark1.manageAttraction(rollerCoaster1);

		Attraction carousel1 = new Carousel();
		themePark1.setAttraction(carousel1);
		themePark1.manageAttraction(carousel1);
	}
}
