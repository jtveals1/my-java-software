/*
 * Jason Veals
 * 8-30-2016
 * DollarGame.java
 */
package lab;

import javax.swing.JOptionPane;

public class DollarGame {

	public static void main(String[] args) {
		final double CENT    = .01;
		final double NICKEL  = .05;
		final double DIME    = .10;
		final double QUARTER = .25;
		final double DOLLAR  = 1.0;
		final int NUMBER_OF_COINS = 6;

		boolean playGame = true;
		int playAgain    = 0;
		double total     = 0;
		double coinValue = 0;

		JOptionPane.showMessageDialog(null, "This is a Dollar Game. The object of the game is to obtain a dollar with six coins\n" +
											"You will be prompted to enter the value for six coins of your choice.             \n" +
											"Valid Entries are as follows:                                                     \n" +
											"Cent         ENTER     .01                                                        \n" +
											"Nickel      ENTER     .05                                                         \n" +
											"Dime        ENTER     .10                                                         \n" +
											"Quarter   ENTER     .25                                                           \n");
		//Allows user to play another game
		while (playGame) {
			
			for (int i = 0; i < NUMBER_OF_COINS; i++) {
				
				coinValue = Double.parseDouble(JOptionPane.showInputDialog(String.format("Input coin value number %d.",i + 1)));
				
				while (coinValue != CENT && coinValue != NICKEL && coinValue != DIME && coinValue != QUARTER) {
					coinValue = Double.parseDouble(JOptionPane.showInputDialog(String.format("You entered invalid information.  Please enter a value of\n" +
								         									   ".01, .05., .10, or .25 for coin value number %d.\n",i + 1)));
				}
				
				total += coinValue;
			}
		    if (total == DOLLAR) {
		    	JOptionPane.showMessageDialog(null,"YOU WIN. The total of your six coins equals a dollar.");
		    }
		    else if (total < DOLLAR) {
		    	JOptionPane.showMessageDialog(null,String.format("YOU LOST.  Your total is $%.2f. You are $%.2f short of a dollar.",total,DOLLAR - total));
		    	
		    }
		    else {
		    	JOptionPane.showMessageDialog(null,String.format("YOU LOST.  Your total is $%.2f. You are $%.2f over a dollar.",total,total - DOLLAR));
		    }
		    
		    
		    playAgain = JOptionPane.showConfirmDialog(null,"Would you like to play again","PLAY AGAIN",JOptionPane.YES_NO_OPTION);
		    
		    // if yes is chosen reset total to play another game
		    if (playAgain == JOptionPane.YES_OPTION) {
		    	total = 0;
		    }
		    // set playGame to false to end game 
		    else {
		    	playGame = false;
		    }
		}
		System.exit(0);
	}

}
