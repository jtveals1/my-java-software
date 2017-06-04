package lab;

import javax.swing.JOptionPane;
/**
 * 
 * @author jtveals
 *
 */
public class BirthdayCake extends Cake {
	
	private int candles;
	/**
	 * BirthdayCake
	 */
	public BirthdayCake() {
		super("Vanilla");
		candles = 0;
	}

	/**
	 * getCandles
	 * @return the candles
	 */
	public int getCandles() {
		return candles;
	}

	/**
	 * setCandles
	 * @param candles the candles to set
	 */
	public void setCandles(int candles) {
		this.candles = candles;
	}
	
	/**
	 * showMessage
	 */
	public void showMessage(){
        String message = String.format("This is a BirthDay Cake. It is %s flavor and it has %d candles",getFlavor(),candles);
        JOptionPane.showMessageDialog(null, message);
    }

}
