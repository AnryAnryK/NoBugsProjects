package org.example.dz_16_designPatterns.abstractFactory.task1;

public class ModernFactory implements Factory{
	@Override
	public Chair makeChair() {
		return new ModernChair();
	}

	@Override
	public Table makeTable() {
		return new ModernTable();
	}
}
