package org.example.answerBook.collectionsInJava.task3;

public class MainRecentTasks {
	public static void main(String[] args) {
		RecentTasks recentTasks = new RecentTasks();
		recentTasks.storageTasks("1");
		recentTasks.storageTasks("2");
		recentTasks.storageTasks("3");
		recentTasks.storageTasks("4");
		recentTasks.storageTasks("5");
		recentTasks.storageTasks("6");
		recentTasks.storageTasks("7");
		recentTasks.storageTasks("");

		recentTasks.printRecentFiveTasks();
	}
}
