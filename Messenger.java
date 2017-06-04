package lab;

import javax.swing.JOptionPane;
/**
 * 
 * @author jtveals
 *
 */
public class Messenger {

	public static void main(String[] args) {
		String name = "";
		
		name = JOptionPane.showInputDialog("Input your name");
		
		double income = Double.parseDouble(JOptionPane.showInputDialog("Input your income"));
		
		while (validateIncome(income) == false) {
			income = Double.parseDouble(JOptionPane.showInputDialog("You entered invalid input.Input your income"));
		}
		
		int yearsEmployed = Integer.parseInt(JOptionPane.showInputDialog("Input years worked"));
		
		while (validateYearsWorked(yearsEmployed) == false) {
			yearsEmployed = Integer.parseInt(JOptionPane.showInputDialog("You entered invalid input. Input years worked"));
		}
		
		Applicant applicant = new Applicant();
		applicant.setName(name);
		applicant.setIncome(income);
		applicant.setYearsEmployed(yearsEmployed);
		
		LoanApplication application = new LoanApplication(applicant);
		if (application.isApproved()) {
			JOptionPane.showMessageDialog(null, name + " you are appoved");
		}
		else {
			JOptionPane.showMessageDialog(null, name + " you are not approved");
		}
		
		System.exit(0);
	}

	public static boolean validateIncome(double income) {
		boolean validIncome = false;
		
		if (income >= 0) {
			validIncome = true;
		}
		return validIncome;
	}
	
	public static boolean validateYearsWorked(int yearsWorked) {
		boolean validYearsWorked = false;
		
		if (yearsWorked >= 0 && yearsWorked <= 100) {
			validYearsWorked = true;
		}
		return validYearsWorked;
	}
}
