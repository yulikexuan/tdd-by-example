//: guru.springframework.MoneyTest.java


package guru.springframework;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class MoneyTest {

	@Test
	void testMultiplication() {
		
		// Given
		Dollar five = new Dollar(5);
		
		// When & then
		Dollar product = five.times(2);
		assertEquals(new Dollar(10), product);

		product = five.times(3);
		assertEquals(new Dollar(15), product);
	}

	@Test
	void testEquality() {
		assertEquals(new Dollar(5), new Dollar(5));
		assertNotEquals(new Dollar(5), new Dollar(8));
	}
	
}///:~