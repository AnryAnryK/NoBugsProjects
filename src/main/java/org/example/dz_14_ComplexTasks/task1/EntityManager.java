package org.example.dz_14_ComplexTasks.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EntityManager <T> {
	private  final List<T> list1 = new ArrayList<>();

	public synchronized T addUser(T user){
		list1.add(user);
		return user;
	}

	public synchronized List<T> getAllUsers(){
		return new ArrayList<>(list1);
	}
}
