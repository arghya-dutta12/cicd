import static org.junit.jupiter.api.Assertions.assertEquals;

import org.cicd.sample.ClassA;
import org.junit.jupiter.api.Test;

class SampleTest {

	@Test
	void test() {
		assertEquals("hello", ClassA.sayHello());
	}

}
