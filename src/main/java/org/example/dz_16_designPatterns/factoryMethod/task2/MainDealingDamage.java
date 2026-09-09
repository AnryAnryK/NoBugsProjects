package org.example.dz_16_designPatterns.factoryMethod.task2;

public class MainDealingDamage {
	public static void main(String[] args) {
		MakeWeaponSword sword1 = new MakeWeaponSword();
		System.out.println("Создано оружие: " + sword1.makeWeapon().toString());
		sword1.makeDamage();

		MakeWeaponBow bow1 = new MakeWeaponBow();
		System.out.println("Создано оружие: " + bow1.makeWeapon().toString());
		bow1.makeDamage();

		MakeWeaponGun gun1 = new MakeWeaponGun();
		System.out.println("Создано оружие: " + gun1.makeWeapon().toString());
		gun1.makeDamage();
	}
}
