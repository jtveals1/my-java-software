package lab;

import javax.swing.JOptionPane;

public class RomanNumeral {

	public static void main(String[] args) {
		
		int num = 0;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Input a number from 1 to 10"));
		
		if (num < 1 || num > 10) { 
			JOptionPane.showMessageDialog(null, "Error. Invalid input");
		}
		else if (num == 1) {
			JOptionPane.showMessageDialog(null,"I");
		}
		else if (num == 2) {
			JOptionPane.showMessageDialog(null, "II");
		}
		else if (num == 3) {
			JOptionPane.showMessageDialog(null, "III");	
		}
		else if (num == 4) {
			JOptionPane.showMessageDialog(null, "IV");
		}
		else if (num == 5) {
			JOptionPane.showMessageDialog(null, "V");
		}
		else if (num == 6) {
			JOptionPane.showMessageDialog(null, "VI");
		}
		else if (num == 7) {
			JOptionPane.showMessageDialog(null, "VII");
		}
		else if (num == 8) {
			JOptionPane.showMessageDialog(null, "VIII");
		}
		else if (num == 9) {
			JOptionPane.showMessageDialog(null, "IX");
		}
		else if (num == 10) {
			JOptionPane.showMessageDialog(null, "X");
		}
	System.exit(0);
	}

}
