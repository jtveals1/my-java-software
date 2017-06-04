package lab;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author jtveals
 *
 */
public class CoinCanvas extends JFrame {
		
	private static final long serialVersionUID = 1L;
	private String coinValue;
	private String output;

	/**
	 * CoinCanvas constructor
	 * @param coinValue
	 * @param output
	 */
	public CoinCanvas(String coinValue,String output) {
		setTitle("Coin Flip Results");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.coinValue = coinValue;
		this.output = output;
	}
		
	/**
	 * buildPanel - builds graphical user interface to display output
	 */
	public void buildPanel() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
			
		JLabel label = new JLabel();
		label.setForeground(getBackground());
		
		JLabel image;
		
		if (coinValue.equals(Coin.HEADS)) {
			setSize(500,450);
			image = new JLabel(new ImageIcon("Resources/heads.jpg"));
		}
		else {
			setSize(600,600);
			image = new JLabel(new ImageIcon("Resources/tails.jpg"));
		}
		
		label.setText(output);
		label.setFont(new Font(Font.SERIF,Font.BOLD,18));
		panel.add(label);
		panel.add(image);
		add(panel);
	}
	
	/**
	 * displayOutput - sets JFrame visible property to true
	 */
	public void displayOutput() {
		setVisible(true);
	}
}
