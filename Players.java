
public class Players {

	private String name;
	private int diceNum;

	private int position = 0;//set players original location as 0;
	private boolean repeatDice;
	private boolean winner;
	
	
/**
 * a player constructor to assign the player's information including name, dice number (determine the order of playing), position, if he/she tied with another player, and if he/she is a winner
 * @param name
 * @param diceNum this is the dice number to determine the order of playing
 * @param position = position number
 * @param repeatDice = the boolean value to assigned if he/she tied with another player when determining the playing order
 * @param winner = a boolean value to assign if he/she is the winner
 */
	public Players(String name, int diceNum, int position, boolean repeatDice, boolean winner) {
		this.diceNum = diceNum;
		this.name = name;
		this.position = position;
		this.repeatDice = repeatDice;
		this.winner = winner;
	}

	public void setWinner(boolean winner) {
		this.winner = winner;
	}

	public boolean isRepeatDice() {
		return repeatDice;
	}

	public boolean isWinner() {
		return winner;
	}

	public void setRepeatDice(boolean repeatDice) {
		this.repeatDice = repeatDice;
	}

	public int getDiceNm() {
		return diceNum;
	}

	public void setDiceNm(int diceNum) {
		this.diceNum = diceNum;
	}

	public int getPosition() {
		return position;
	}

	public String getName() {
		return name;
	}
/**
 * a method to move the location 
 * @param a integer a is a number from dice. thus the player will move according to the dice number he/she got. 
 */
	public void playerMove(int a) {

		if (position + a == 100) {
			position = position + a;

			winner = true;
			System.out.println("**** You got " + a + ", you are now at " + position+" ****");
			//System.out.println("Congradulations! You WIN!!");

		} else if (position + a >= 100) {
			position = 100 - (position + a - 100);
			System.out.println("**** You got " + a+ ", You exceeded the board range. You are now at " + position+" ****");
		} else {
			position = position + a;
			System.out.println("**** You got " + a + ", you are now at " + position+" ****");
		}
	}
/**
 * set position method to change the location when the player hit a snake or a ladder s
 * @param position
 */

	public void setPosition(int position) {
		this.position = position;
		if (position == 100) {

			winner = true;
			System.out.println("Congratulations! You WIN!!");

		}

	}

}
