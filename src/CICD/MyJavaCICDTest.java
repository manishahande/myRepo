package CICD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyJavaCICDTest {

	@Test
	void testAdd() {
		var add1 = new MyJavaCICD();
		assertEquals(10, add1.add(5, 5));
	}

	@Test
	void testAdd1() {
		var add1 = new MyJavaCICD();
		assertEquals(1, add1.add(1, 5));
	}
}
