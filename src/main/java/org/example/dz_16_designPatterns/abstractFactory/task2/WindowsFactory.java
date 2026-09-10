package org.example.dz_16_designPatterns.abstractFactory.task2;


public class WindowsFactory implements Factory {
	@Override
	public Buttons createButton() {
		return new WindowsButton();
	}

	@Override
	public Windows createWindow() {
		return new WindowsWindow();
	}

	@Override
	public Menus createMenu() {
		return new WindowsMenu();
	}
}
