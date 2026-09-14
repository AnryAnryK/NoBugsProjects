package org.example.dz_16_designPatterns.builder.task1;

import java.util.ArrayList;
import java.util.List;

public class MainOrder {
	public static void main(String[] args) {
		Order order1 = new Order.Builder()
				.addItem("Ноут")
				.addItem("ТВ")
				.setDiscount(10.5)
				.setPayment("СБП")
				.build();
		System.out.println(order1);
	}
}
