package org.example.dz_16_designPatterns.factoryMethod.task2;

public class MakeWeaponGun extends MakeWeapon{
	@Override
	DealingDamage makeWeapon() {
		return new Gun();
	}
}
