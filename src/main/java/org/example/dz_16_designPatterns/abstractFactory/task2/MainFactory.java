package org.example.dz_16_designPatterns.abstractFactory.task2;

public class MainFactory {
	public static void main(String[] args) {
		Factory factory1 = new WindowsFactory();
		Factory factory2 = new MacOsFactory();

		factory1.createButton().design();
		factory1.createWindow().design();
		factory1.createMenu().design();
		System.out.println("=========================");
		factory2.createButton().design();
		factory2.createWindow().design();
		factory2.createMenu().design();
	}
}
