package com.Learner.My.Learner;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

	Calculator calc = new Calculator();

	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"1, 2, 3",
			"5, 3, 8",
			"-1, -2, -3",
			"0, 0, 0"
	})
	void testAdd(int a, int b, int expected) {
		assertEquals(expected, calc.add(a, b));
	}

	@ParameterizedTest(name = "{0} - {1} = {2}")
	@CsvSource({
			"9, 5, 4",
			"10, 4, 6",
			"0, 0, 0",
			"-2, -3, 1"
	})
	void testSubtract(int a, int b, int expected) {
		assertEquals(expected, calc.subtract(a, b));
	}
}
