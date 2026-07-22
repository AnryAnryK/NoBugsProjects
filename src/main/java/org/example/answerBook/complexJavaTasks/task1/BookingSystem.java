package org.example.answerBook.complexJavaTasks.task1;

import java.util.ArrayList;
import java.util.List;

public class BookingSystem {

	List<Bookings> bookingsList = new ArrayList<>();


	public boolean addBooking(Bookings bookings) {
		if (bookings == null || bookings.getName() == null || bookings.getDate() == null || bookings.getTicketCount() <= 0) {
			System.out.println("Некорректные данные для бронирования");
			return false;
		}
		for (Bookings existingBooking : bookingsList) {
			if (existingBooking.getName().equals(bookings.getName()) && existingBooking.getDate().equals(bookings.getDate())) {
				System.out.println("Бронирование уже существует для клиента: " +
						bookings.getName() + " на дату: " + bookings.getDate());
				return false;
			}
		}
		bookingsList.add(new Bookings(bookings.getName(), bookings.getTicketCount(), bookings.getDate()));
		System.out.println("Бронирование у клиента: " + bookings.getName() + " на дату: " + bookings.getDate() + " кол-во билетов: " + bookings.getTicketCount() + " - произведено");
		return true;
	}


	public String cancelBooking(Bookings bookings) {
		if (bookings == null || bookings.getName() == null || bookings.getDate() == null) {
			return "Некорректные данные для отмены бронирования у клиента: " + bookings.getName() + " на дату: " + bookings.getDate();
		}
		for (Bookings existingBooking : bookingsList) {
			if (existingBooking.getName().equals(bookings.getName()) && existingBooking.getDate().equals(bookings.getDate())) {
				bookingsList.remove(existingBooking);
				return "Отмена Бронирования у клиента: " + bookings.getName() + " на дату: " + bookings.getDate() + " - подтверждена";
			}
		}
		return "Бронирование у клиента: " + bookings.getName() + " на дату: " + bookings.getDate() + " - отсутствует, Отмена невозможна";
	}

	public String checkBooking(String name, String date) {
		if (name == null || date == null) {
			return "Бронирование у клиента: " + name + " на дату: " + date + " - отсутствует !";
		}

		for (Bookings booking : bookingsList) {
			if (booking.getName().equals(name) && booking.getDate().equals(date))
				return "Бронирование у клиента: " + name + " на дату: " + date + " - подтверждено";
		}
		return "Бронирование у клиента: " + name + " на дату: " + date + " - отсутствует !";
	}

	public void showAllBookings() {
		if (bookingsList.isEmpty()) {
			System.out.println("Нет активных бронирований");
			return;
		}

		for (Bookings booking : bookingsList) {
			System.out.println("Клиент: " + booking.getName() + ", Кол-во билетов: " + booking.getTicketCount() + ", Дата: " + booking.getDate());
		}
	}
}
