package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Calculator;

class CalculatorTest {

	@Test

	void testAddattribute() {
		Calculator calculator = new Calculator();

		assertEquals(10, calculator.addAbsolute(3, 7));
	}

}
