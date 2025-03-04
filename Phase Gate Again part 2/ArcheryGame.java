import java.util.Random;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArcheryGame {

	public String getHeader() {
		return "Archery Game";
	}

	public static int getPlayers() {
		Scanner inputReader = new Scanner(System.in);
		int numOfPlayers= 0;
		boolean repeat = true;
		do {
		try {
			System.out.print("Enter number of players: ");
			numOfPlayers = inputReader.nextInt();
			if(numOfPlayers >0 && numOfPlayers <=10) {
				repeat = false;
			} else {
				System.out.print("Invalid input... Enter  number between 1 - 10 \n\n");

			}
		} 
		catch (InputMismatchException e) {
			System.err.println("Invalid input... Enter number between 1 - 10 \n");
			inputReader.next();
		}
		}while(repeat);
		return numOfPlayers;
	}

	public int[][] getGameScores(int input, int input2) {
		Random playGame = new Random(); 
		int [][] playerScores = new int[input][3];
		for (int count = 0; count< playerScores.length; count++) {
		for (int counter = 0; counter< playerScores[count].length; counter++) {
		playerScores[count][counter] = playGame.nextInt(11); 
		}
		}
		return Arrays.toString(playerScores);
	}
	
	public static void viewResults(int input, int input2) {
		int[][] player = new int[input][3];
		System.out.printf("%-9s |%-6s |%-6s |%-6s | %n", "Players", "Round 1", "Round 2", "Round 3");
		System.out.println("--------------------------------------");
		for (int count = 0; count < player.length; count++) {
		System.out.printf("Player %-2d |", count+1);
		for (int counter = 0; counter < player[count].length; counter++) {
		System.out.printf("%-6d |", player[count][counter]);
		}
		}
	}	

	public static void main(String... args) {
		ArcheryGame myMethod = new ArcheryGame();
		System.out.print("\n\t\t" + myMethod.getHeader() + "\n\n");
		System.out.print(myMethod.getGameScores(getPlayers(), 3));
		viewResults(getPlayers(), 3);
	}
}