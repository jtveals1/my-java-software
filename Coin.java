package lab;

import java.util.Random;

/**
 * 
 * @author jtveals
 *
 */
public class Coin {
	
	private String value;
	public static final String HEADS = "heads";
	public static final String TAILS = "tails";
	
	/** 
	 * getValue
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * flip - Uses Random class to generate a random number either 0 or 1.
	 * 		- If 0 is generated the coin value is Heads. If 1 is generated coin value is Tails.
	 * @return value of coin
	 */
	public String flip() {
		Random coinFlip = new Random();
	    int randNum;
	    
	    randNum = coinFlip.nextInt(2);
	    
	    switch (randNum) {
		
		case 0:
			value = HEADS;
			break;
			
		case 1:
			value = TAILS;
			break;
			
		default:
			value = HEADS;
			break;
	    }
	    return value;
	}

}
