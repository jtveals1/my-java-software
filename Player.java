package lab;

/**
 * 
 * @author jtveals
 *
 */

public class Player {
	
	private String name;
	private String guess;
	
	/**
	 * Player constructor
	 * @param name
	 */
	public Player(String name) {
		this.name = name;
	}

	/**
	 * getGuess
	 * @return the guess
	 */
	public String getGuess() {
		return guess;
	}

	/**
	 * setGuess
	 * @param guess the guess to set
	 */
	public void setGuess(String guess) {
		this.guess = guess;
	}

	/**
	 * getName
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * setName
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
