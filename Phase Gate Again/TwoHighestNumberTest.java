import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TwoHighestNumberTest {

	@Test
	public void testThatFunctionReturnsTwoHighestInArray() {
		TwoHighestNumber myHighest = new TwoHighestNumber();
		int[] array = {63, 12, 34, 900, 3};
		int temp = myHighest.findTwoLargest(array);
	int result = {900, 53};
	assertArrayEquals(result, temp);
	}


}