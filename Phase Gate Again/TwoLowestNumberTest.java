import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TwoLowestNumberTest {
	
	@Test
	public void testThatFunctionCanReturnTwoLowestNumber() {
		TwoLowestNumber myLowest = new TwoLowestNumber();
		int[] testInput = {78, 2, 91, 300, 21};
		int[] result = {2, 21};
		assertArrayEquals(result, myLowest.findTwoLowest(testInput));

}
}