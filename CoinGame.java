package lab;

import javax.swing.JOptionPane;

/**
 * 
 * @author jtveals
 *
 */
public class CoinGame implements Game {
	
	private int numberOfPlayers;
	private Player player1;
	private Player player2;
	private Coin coin;
	
	/**
	 * CoinGame constructor
	 * @param player1
	 * @param player2
	 * @param numberOfPlayers
	 */
	public CoinGame(Player player1,Player player2, int numberOfPlayers) {
		this.player1 = player1;
		this.player2 = player2;
		this.numberOfPlayers = numberOfPlayers;
		coin = new Coin();
	}
	
	/**
	 * setNumOfPlayers
	 * @param numberOfPlayers
	 */
	public void setNumOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	/**
	 * getNumOfPlayers
	 * @return numberOfPlayers
	 */
	public int getNumOfPlayers() {
		return numberOfPlayers;
	}
	
	/**
	 * printInstructions -prints game instructions
	 */
	public void printInstructions() {
		String message;
		
		message = "This is a Coin Flip game. If Player one chooses heads then by default player two gets tails\n" +
		          "and vice versa if Player one chooses tails then by default player two gets heads.";
		
		JOptionPane.showMessageDialog(null, message);
		
	}
	
	/**
	 * getCoinValue
	 * @return coin value
	 */
	public String getCoinValue() {
		return coin.getValue();
		
	}
	
	/**
	 * getPlayers
	 * @return players
	 */
	public Player[] getPlayers() {
		Player[] players = new Player[] {player1,player2};
		return players;
	} 
	
	/**
	 * flipCoin - flips the coin and decides the winner 
	 * @return winner
	 */
	public String flipCoin() {
		
		String winner;
		
		if (player1.getGuess().equals(coin.flip())) {
			winner = player1.getName(); 
		}
		else {
			winner = player2.getName();
		}
		
		return winner;
	}
}