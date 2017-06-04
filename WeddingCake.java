package lab;

import javax.swing.JOptionPane;
/**
 * 
 * @author jtveals
 *
 */
public class WeddingCake extends Cake {
	
	private int tiers;
	/**
	 * WeddingCake
	 * @param tiers
	 * @param flavor
	 */
	public WeddingCake(int tiers,String flavor) {
		super(flavor);
		this.tiers = tiers;
	}

	/**
	 * getTiers
	 * @return the tiers
	 */
	public int getTiers() {
		return tiers;
	}

	/**
	 * setTiers
	 * @param tiers the tiers to set
	 */
	public void setTiers(int tiers) {
		this.tiers = tiers;
	}
	/**
	 * showMessage
	 */
	public void showMessage(){
        String message = String.format("This is a Wedding Cake. It is %s flavor and has %d tiers.",getFlavor(),tiers);
        JOptionPane.showMessageDialog(null, message);
    }

}
