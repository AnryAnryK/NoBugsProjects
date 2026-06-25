package org.example.expressJavaTasks;

/*
Использовать Queue для вывода элементов в порядке добавления.

Добавлять через offer, извлекать через poll.
 */

import java.util.LinkedList;
import java.util.Queue;

public class TwentySevenOutputOfQueueItems {

	public static void sevenOutputOfQueueItems(Queue<String> que) {

		if (que == null) {
			System.out.println("Очередь не может быть со значением - null !");
			return;
		}

		while (!que.isEmpty()) {
			System.out.println(que.poll());
		}
	}

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.offer("Первый");
		queue.offer("Второй");
		queue.offer("Третий");

		sevenOutputOfQueueItems(queue);
		sevenOutputOfQueueItems(null);
	}
}
