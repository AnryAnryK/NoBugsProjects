package org.example.dz_17_designPatternsComplexTasks.task2;

import java.util.Random;

public class Video {
	private String classpath;
	private int id;

	public Video(String classpath) {
		this.classpath = classpath;
		this.id = new Random().nextInt(1000000);
	}

	public String getClasspath() {
		return classpath;
	}

	public int getId() {
		return id;
	}
}
