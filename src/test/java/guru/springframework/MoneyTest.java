//: guru.springframework.MoneyTest.java


package guru.springframework;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class MoneyTest {

	@Test
	void testMultiplication() {
		
		// Given
		Dollar five = new Dollar(5);
		
		// When
		five.times(2);
		
		// Then
		assertEquals(10, five.amount);
	}

}
///:~