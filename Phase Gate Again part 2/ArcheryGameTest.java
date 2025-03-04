import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArcheryGameTest {

	@Test
	public void testThatArcheryGameReturnsHeader() {
		ArcheryGame myGame = new ArcheryGame();
		String result = "Archery Game";
		assertEquals(result, myGame.getHeader());
	}
	
	@Test
	public void testThatFunctionCanGetNumberOfPlayers() {
		int see = 6;
		assertEquals(see, ArcheryGame.getPlayers());
	}

	/* 
	@Test
	public void testThatFunctionCanReturnArrayOfPlayersAndScores {
		ArcheryGame myGame = new ArcheryGame();
		int[][] have = 
	}
		*/
}