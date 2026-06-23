package dz_16_TasksForPreparationToMock;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class Task2Test<A> {

	@Test
	public void prepareCollection() {
		Set<A> set = new HashSet<>();
//		set.add(new A());
		set.add((A) new B());
		set.add((A) new B());
//		return set.size();
	}
}

class A {

}

class B extends A {

}
