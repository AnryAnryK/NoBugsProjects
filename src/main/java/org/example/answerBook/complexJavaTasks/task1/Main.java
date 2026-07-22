package org.example.answerBook.complexJavaTasks.task1;

/*
1.Система бронирования билетов
 Создай класс BookingSystem, в котором можно зарегистрировать бронирование с полями: имя клиента, количество билетов, дата.
 Добавь возможность проверять бронирования по имени клиента и дате, а также отменять их.

 */


public class Main {

	public static void main(String[] args) {

		BookingSystem bs1 = new BookingSystem();

		Bookings booking1 = new Bookings("Иван Петров", 1, "2026.07.22");
		Bookings booking2 = new Bookings("Иван Комаров", 1, "2026.07.21");

		System.out.println("Бронирование билетов ===========================================");
		bs1.addBooking(booking1);
		bs1.addBooking(booking2);

		System.out.println("Проверка Бронирования билетов ===========================================");
		System.out.println(bs1.checkBooking("Иван Петров", "2026.07.22"));
		System.out.println(bs1.checkBooking("Иван Комаров", "2026.07.21"));

		System.out.println("Отмена Бронирования билетов ===========================================");
		System.out.println(bs1.cancelBooking(booking1));

		System.out.println("Проверка Бронирования билетов ===========================================");
		System.out.println(bs1.checkBooking("Иван Петров", "2026.07.22"));
		System.out.println(bs1.checkBooking("Иван Комаров", "2026.07.21"));

		System.out.println("Проверка Бронирования всех Активных билетов ===========================================");
		bs1.showAllBookings();
	}
}
