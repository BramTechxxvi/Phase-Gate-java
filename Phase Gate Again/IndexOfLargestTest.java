import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IndexOfLargestTest {

	@Test
	public void testThatFunctionReturnsLargest() {
		IndexOfLargest myMethod = new IndexOfLargest();
		int[][] find = {{-63, -12, -34}, {-900, -3, -14}, {-2, -60,- 48}};
		int[][] temp = myMethod.indexOfLargest(find);
		int[] result = {1, 0};
		assertArrayEquals(result, temp);
	}
}