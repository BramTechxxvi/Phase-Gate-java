import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PowerOfTwoTest {

	@Test
	public void testThatFunctionCanGivePowerOfTwo() {
		PowerOfTwo myFunction = new PowerOfTwo();
		boolean power = myFunction.get(2, 4);
		assertEquals(true, myFunction.get(2, 4));
		}
}