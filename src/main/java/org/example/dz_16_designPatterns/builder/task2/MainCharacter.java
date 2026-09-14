package org.example.dz_16_designPatterns.builder.task2;

public class MainCharacter {
	public static void main(String[] args) {
		Character character1 = new Character.Builder()
				.setHealth(100)
				.setDamage(25)
				.setArmor(30)
				.setMagic(50)
				.build();
		System.out.println(character1.getClass().getSimpleName() + ": " + character1);
	}
}
