package org.example.answerBook.collectionsInJava.task24;

public class MainSupportBrowsingHistoryWithForwardBackwardFunctionality {
	public static void main(String[] args) {

		SupportBrowsingHistoryWithForwardBackwardFunctionality supportBrowsingHistoryWithForwardBackwardFunctionality = new SupportBrowsingHistoryWithForwardBackwardFunctionality();

		System.out.println(supportBrowsingHistoryWithForwardBackwardFunctionality.openPage("https://ya.ru/"));
		System.out.println(supportBrowsingHistoryWithForwardBackwardFunctionality.openPage("https://ya.ru/1"));
		System.out.println(supportBrowsingHistoryWithForwardBackwardFunctionality.openPage("https://ya.ru/2"));
		System.out.println(supportBrowsingHistoryWithForwardBackwardFunctionality.moveBack());
		System.out.println(supportBrowsingHistoryWithForwardBackwardFunctionality.moveForward());
		System.out.println(supportBrowsingHistoryWithForwardBackwardFunctionality.moveForward());
		System.out.println(supportBrowsingHistoryWithForwardBackwardFunctionality.moveBack());
		System.out.println(supportBrowsingHistoryWithForwardBackwardFunctionality.moveBack());
		System.out.println(supportBrowsingHistoryWithForwardBackwardFunctionality.moveBack());
	}
}
