package lab;

import javax.swing.JOptionPane;

public class PassWord {

	public static void main(String[] args) {
		String password = JOptionPane.showInputDialog("Input your password change");
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean correctLength = false;
		boolean hasNumber = false;
		boolean hasAlphaNumeric = false;
		
		for ( int i = 0; i < password.length(); i++) {
			if (Character.isUpperCase(password.charAt(i))) {
				hasUpper = true;
			}
			else if (Character.isLowerCase(password.charAt(i))) {
				hasLower = true;
			}
			else if (Character.isDigit(password.charAt(i))) {
				hasNumber = true;
			}
			else if (!Character.isLetterOrDigit(password.charAt(i)) && !Character.isSpaceChar(password.charAt(i))) {
				hasAlphaNumeric = true;
			}
			
		}
		
		if ( password.length() == 8 ) {
			correctLength = true;
		}
		
	if (correctLength && hasNumber && hasLower && hasUpper && hasAlphaNumeric) {
		JOptionPane.showMessageDialog(null, "Your password is good");
	}
	else {
		JOptionPane.showMessageDialog(null, "Your password is invalid");
	}
	System.exit(0);
	}
}
	
	
