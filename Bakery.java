package lab;

import javax.swing.JOptionPane;
/**
 * 
 * @author jtveals
 *
 */
public class Bakery {

	public static void main(String[] args) {

		String flavor = JOptionPane.showInputDialog("Let's order a birthday cake! What flavor would you like?");
		int candles = Integer.parseInt(JOptionPane.showInputDialog("And how many candles?"));
		makeBirthdayCake(candles, flavor);

		flavor = JOptionPane.showInputDialog("Let's order a wedding cake! What flavor would you like?");
		int tiers = Integer.parseInt(JOptionPane.showInputDialog("And how many tiers?"));
		makeWeddingCake(tiers, flavor);

		flavor = JOptionPane.showInputDialog("Let's order a cake! What flavor would you like?");
		makeCake(flavor);

		System.exit(0);

	}
	/**
	 * makeBirthdayCake
	 * @param candles
	 * @param flavor
	 */
	public static void makeBirthdayCake(int candles, String flavor){
		BirthdayCake birthdayCake = new BirthdayCake();
		birthdayCake.setCandles(candles);
		birthdayCake.setFlavor(flavor);
		birthdayCake.showMessage();
	}
	/**
	 * makeWeddingCake
	 * @param tiers
	 * @param flavor
	 */
	public static void makeWeddingCake(int tiers, String flavor){
		WeddingCake weddingCake = new WeddingCake(tiers,flavor);
		weddingCake.showMessage();
	}
	/**
	 * makeCake
	 * @param flavor
	 */
	public static void makeCake(String flavor){
		Cake cake = new Cake(flavor);
		cake.showMessage();
	}
}