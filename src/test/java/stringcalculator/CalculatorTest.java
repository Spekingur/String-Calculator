package stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testAnotherOneNumber() {
		assertEquals(2, Calculator.add("2"));
	}

	@Test
	public void	testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testThreeNumbers() {
		assertEquals(6, Calculator.add("1,2,3"));
	}

	@Test
	public void testFourNumbers() {
		assertEquals(10, Calculator.add("2,2,1,5"));
	}

	@Test
	public void testTenNumbers() {
		assertEquals(30, Calculator.add("10,2,1,4,1,2,3,2,1,4"));
	}

	@Test
	public void testNewLine() {
		assertEquals(3, Calculator.add("1\n2"));
	}
}