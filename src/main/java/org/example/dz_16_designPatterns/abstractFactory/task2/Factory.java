package org.example.dz_16_designPatterns.abstractFactory.task2;

public interface Factory {
	Buttons createButton();

	Windows createWindow();

	Menus createMenu();
}
