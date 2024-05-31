
import java.util.Scanner;

public class PlayLadderAndSnake {

	public static void main(String[] args) {
		/**
		 * ask user to enter the number of players using while loop to make sure the
		 * user enter a number within the range 2-4
		 */

		System.out.println("Entere the number of player");

		Scanner input = new Scanner(System.in);

		int numberOfPlayrs = input.nextInt();

		while (numberOfPlayrs != 2 && numberOfPlayrs != 3 && numberOfPlayrs != 4) {
			System.out.println("The number of players must be between 2 and 4 inclusively, please enter again");
			numberOfPlayrs = input.nextInt();
		}

		/**
		 * create a game and call the methods
		 */
		LadderAndSnake s = new LadderAndSnake(numberOfPlayrs);
		s.map();
		s.decidOrder(numberOfPlayrs);
		s.checkOder();
		s.play();
		input.close();
	}

}
