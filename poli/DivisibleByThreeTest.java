import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DivisibleByThreeTest {

	@Test
	public void testThatFunctionCanReturnTotal() {
		DivisibleByThree mySumMethod = new DivisibleByThree();
		int expected = mySumMethod.getTotal(40);
		assertEquals(273, expected);
	}

}