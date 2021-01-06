package io.bensalem;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	MathUtils mathUtils = null;
	
	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}

	@Test
	@DisplayName("Addition method")
	void testAddition() {
		assertEquals(6, mathUtils.addition(4, 2),"Should return 6 instead of "+mathUtils.addition(4, 2));
	}
	
	@Test
	@DisplayName("Substraction method")
	void testSubstraction() {
		assertEquals(2, mathUtils.substraction(4, 2),"Should return 2 instead of "+mathUtils.substraction(4, 2));
	}
	
	@Test
	@DisplayName("Division method")
	void testDivision() {
		assertAll(
				() -> assertEquals(2, mathUtils.addition(4, 2),"Should return 2 instead of "+mathUtils.division(4, 2)),
				() -> assertThrows(ArithmeticException.class, () -> mathUtils.division(1, 0),"The division by Zero is impossible")
				);
		
	}
	
	@Test
	@DisplayName("Multiplication method")
	void testMultiplication() {
		assertEquals(8, mathUtils.multiplication(4, 2),"Should return 8 instead of "+mathUtils.multiplication(4, 2));
	}

}
