package lab;

/**
 * 
 * @author jtveals
 *
 */
public interface Game {
	
	/**
	 * setNumOfPlayers
	 * @param numberOfPlayers
	 */
	public void setNumOfPlayers(int numberOfPlayers);
	
	/**
	 * getNumOfPlayers
	 * @return an integer
	 */
	public int getNumOfPlayers();
	
	/**
	 * printInstructions
	 */
	public void printInstructions();

}
