package org.example.dz_16_designPatterns.builder.task1;

/*
Реализовать строитель для создания заказов в интернет-магазине
Описание
В интернет-магазине клиент может оформить заказ, добавляя товары, указывая скидку и выбирая способ оплаты.
Паттерн Builder поможет организовать процесс формирования заказа, не перегружая конструктор класса Order множеством параметров.
Это позволяет строить объекты заказов поэтапно, добавляя товары, скидки и способы оплаты по мере необходимости.
 */

import java.util.ArrayList;
import java.util.List;

public class Order {
	private final List<String> items;
	private final double discount;
	private final String payment;


	private Order(Builder builder) {
		this.items = List.copyOf(builder.items);
		this.discount = builder.discount;
		this.payment = builder.payment;
	}


	public static class Builder {
		private List<String> items = new ArrayList<>();
		private double discount;
		private String payment;


		public Builder addItem(String item) {
			this.items.add(item);
			return this;
		}


		public Builder setDiscount(double discount) {
			this.discount = discount;
			return this;
		}


		public Builder setPayment(String payment) {
			this.payment = payment;
			return this;
		}


		public Order build() {
			return new Order(this);
		}
	}

	@Override
	public String toString() {
		return "Заказ {Товар: '" + items + "', Скидка: '" + discount + "', Способ оплаты: '" + payment + "'}";
	}
}