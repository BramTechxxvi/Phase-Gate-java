import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HighestAndLowestTest {

	@Test
	public void testThatFunctionReturnsHighestAndLowest() {
		HighestAndLowest myMethod = new HighestAndLowest();
		int[] array = {23, 78, 12, 8, 900};
		int[] find = myMethod.findHighestAndLowest(array);
		int[] result = {900, 8};
		assertArrayEquals(result, find);
	}

	@Test
	public void testThatFunctionReturnsHighestAndLowestt() {
		HighestAndLowest myMethod = new HighestAndLowest();
		int[] array = {35, 20, 12, 28, 10};
		int[] find = myMethod.findHighestAndLowest(array);
		int[] result = {35, 10};
		assertArrayEquals(result, find);
	}

	@Test
	public void testThatFunctionReturnsHighesttAndLowest() {
		HighestAndLowest myMethod = new HighestAndLowest();
		int[] array = {52, 230, 148, 128, 120};
		int[] find = myMethod.findHighestAndLowest(array);
		int[] result = {230, 52};
		assertArrayEquals(result, find);
	}

}