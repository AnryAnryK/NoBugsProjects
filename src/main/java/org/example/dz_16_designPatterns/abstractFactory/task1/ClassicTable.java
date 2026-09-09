package org.example.dz_16_designPatterns.abstractFactory.task1;

public class ClassicTable implements Table{
	@Override
	public String makeTable() {
		return "Стол в классическом стиле";
	}
}
