import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GreatestCommonDivisorTest {

	@Test
	public void testThatFunctionReturnsGrestestDivisor() {
		GreatestCommonDivisor myDivisor = new GreatestCommonDivisor();
		int divisor = myDivisor.findGreatestDivisor(2, 4);
		int result = 2;
		assertEquals(result, divisor);
	}

	@Test
	public void testThatFunctionReturnsDivisor() {
		GreatestCommonDivisor myDivisor = new GreatestCommonDivisor();
		int dividends = myDivisor.findGreatestDivisor(16, 24);
		int result = 8;
		assertEquals(result, dividends);
	}

	@Test
	public void testThatFunctionReturnsDivide() {
		GreatestCommonDivisor myDivisor = new GreatestCommonDivisor();
		int expected = myDivisor.findGreatestDivisor(22, 33);
		int result = 11;
		assertEquals(result, expected);
	}
		
}


