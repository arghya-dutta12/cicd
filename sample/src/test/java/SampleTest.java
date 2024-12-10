
import static org.junit.Assert.assertEquals;

import org.cicd.sample.ClassA;
import org.junit.Test;

class SampleTest {

	@Test
	void test() {
		assertEquals("hello", ClassA.sayHello());
	}

}
