import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class StringCheckTest {


		@Test
		public void testTheNumbersInString() {
			StringCheck numChecker = new StringCheck();
			boolean number = numChecker.get("1210");
			assertEquals(true, numChecker.get("1210"));



}



















}