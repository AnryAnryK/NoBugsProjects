package org.example.dz_16_designPatterns.facade.task1;

public class MainDoor {
	public static void main(String[] args) {
		Door door = new Door();
		door.open();
		door.close();
		door.block();
	}
}
