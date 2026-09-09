package org.example.dz_16_designPatterns.factoryMethod.task2;

public class MakeWeaponBow extends MakeWeapon{
	@Override
	DealingDamage makeWeapon() {
		return new Bow();
	}
}
