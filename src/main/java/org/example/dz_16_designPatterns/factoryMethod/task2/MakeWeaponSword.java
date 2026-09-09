package org.example.dz_16_designPatterns.factoryMethod.task2;

public class MakeWeaponSword extends MakeWeapon{
	@Override
	DealingDamage makeWeapon() {
		return new Sword();
	}
}
