package lab;

import javax.swing.JOptionPane;
/**
 * Cake.java
 * @author jtveals
 *11-1-16
 */
public class Cake {

	private String flavor = "";
	/**
	 * Cake
	 * @param flavor
	 */
	public Cake(String flavor) {
		this.flavor = flavor;
	}

	/**
	 * @return the flavor
	 */
	public String getFlavor() {
		return flavor;
	}

	/**
	 * @param flavor the flavor to set
	 */
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	/**
	 * showMessage
	 */
	public void showMessage(){
        String message = String.format("Thank you for your purchase of the %s cake", flavor);
        JOptionPane.showMessageDialog(null, message);
    }

}
