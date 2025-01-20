import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class ElementOccurenceTest {

	@Test
	public void testSingleElementOccurence() {
		ElementOccurence  myElement = new ElementOccurence();
		int[] element = myElement.get(numbers);
		assertEquals(1, myElement.get(numbers));
}



}