package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.cicd.sample.ClassA;
import org.junit.jupiter.api.Test;

class ClassATest {

	@Test
	void test() {
		assertSame("hello", ClassA.sayHello());
	}

}
