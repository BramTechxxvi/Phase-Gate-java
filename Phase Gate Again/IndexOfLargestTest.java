import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IndexOfLargestTest {

	@Test
	public void testThatFunctionReturnsLargest() {
		IndexOfLargest myMethod = new IndexOfLargest();
		double[][] find = {
				{-63.0, -12.0, -34.0}, 
				{-900.0, -3.0, -14.0}, 
				{-2.0, -60.0,- 48.0}
				};
		int[] temp = myMethod.indexOfLargest(find);
		int[] result = {2, 0};
		assertArrayEquals(result, temp);
	}
}