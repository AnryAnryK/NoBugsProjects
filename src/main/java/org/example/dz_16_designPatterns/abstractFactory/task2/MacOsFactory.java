package org.example.dz_16_designPatterns.abstractFactory.task2;

public class MacOsFactory implements Factory {
	@Override
	public Buttons createButton() {
		return new MacOsButton();
	}

	@Override
	public Windows createWindow() {
		return new MacOsWindow();
	}

	@Override
	public Menus createMenu() {
		return new MacOsMenu();
	}
}
