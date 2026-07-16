package org.example.mockInterview.timur.task1;

import java.util.List;
import java.util.Objects;

public class User {

	final String name;
	final String surname;
	final List<String> placesOfJob;

	User(String name, String surname, List<String> placesOfJob) {
		this.name = name;
		this.surname = surname;
		this.placesOfJob = placesOfJob;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public List getPlacesOfJob() {
		return placesOfJob;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(placesOfJob, user.placesOfJob);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, surname, placesOfJob);
	}
}
