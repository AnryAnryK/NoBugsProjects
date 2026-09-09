package org.example.dz_16_designPatterns.abstractFactory.task1;

public class ClassicFactory implements  Factory{
	@Override
	public Chair makeChair() {
		return new ClassicChair();
	}

	@Override
	public Table makeTable() {
		return new ClassicTable();
	}
}
