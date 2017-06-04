package lab;

import javax.swing.JOptionPane;

/**
 * MathOperations.java
 * @author jtveals
 * 9-15-16
 * This program prompts a user for two numbers and allows the 
 * User to perform the 4 basic math operations on the numbers 
 */
public class MathOperations {

	public static void main(String[] args) {
		
        double num1 = getUserNumber("Input First Number");		
        double num2 = getUserNumber("Input Second Number");
	    String operation = getOperation("Which operation would you like to perform");
	    double result = performOperation(operation,num1,num2); 
	    JOptionPane.showMessageDialog(null, String.format("Your answer is %.2f",result));
	    
	    System.exit(0); 
	}

	/**
	 * getUserNumber - Gets user number
	 * @param userInfoDialog
	 * @return userNum
	 */
	public static double getUserNumber(String userInfoDialog) {
		double userNum = 0;
		String input = JOptionPane.showInputDialog(userInfoDialog);
		if (validateInput(input)) {
			userNum = Double.parseDouble(input);
		}
		else {
			userNum = getUserNumber("You did not enter a value. Please enter a Value");
		}
		
		return userNum;
	}
	
	/**
	 * getOperation - Prompts user for desired math operation to perform
	 * @param userInfoDialog
	 * @return operation
	 */
	public static String getOperation(String userInfoDialog) {
		String operation = JOptionPane.showInputDialog(userInfoDialog);
		if (!validateInput(operation)) {
			operation = JOptionPane.showInputDialog("You entered invalid input. Please enter an operation");
		}
		return operation;
	}
	
	/**
	 * validateInput - Checks user input. Ends the program if user chooses the Cancel option
	 * @param userInput - String entered by user
	 * @return valid - True if input is good. False if input is invalid.
	 */
	public static boolean validateInput(String userInput) {
		boolean valid = true;
		if (userInput == null) {
			System.exit(0);
		}
		else if (userInput.isEmpty()) {
			valid = false;
		}
		return valid;
	}
	
	/**
	 * performOperation - Decides which action to take to perform desired user operation
	 * @param operation
	 * @param num1
	 * @param num2
	 * @return result
	 */
	public static double performOperation(String operation, double num1, double num2) {
		
		double result = 0;
		operation = operation.toLowerCase();

		switch (operation) {
		
		case "add":
			result = addNumbers(num1,num2);
			break;
			
		case "subtract":
			result = subtractNumbers(num1,num2);
			break;
		
		case "multiply":
			result = multiplyNumbers(num1,num2);
			break;
			
		case "divide":
			result = divideNumbers(num1,num2);
			break;
			
		default:
			result = performOperation(getOperation("You entered invalid information. Input a valid operation"),num1,num2);
			break;
		}
		
		return result;
	}
	
	/**
	 * addNumbers - Adds user numbers
	 * @param num1
	 * @param num2
	 * @return num1 + num2
	 */	
	public static double addNumbers(double num1, double num2) {
		return num1 + num2;
	}
	
	/**
	 * subtractNumbers - Subtracts user numbers
	 * @param num1
	 * @param num2
	 * @return num1 - num2
	 */
	public static double subtractNumbers(double num1, double num2) {
		return num1 - num2;
	}	
	
	
	/**
	 * multiplyNumbers - Multiply user numbers
	 * @param num1
	 * @param num2
	 * @return num1 * num2
	 */
	public static double multiplyNumbers(double num1, double num2) {
		return num1 * num2;
	}
	
	/**
	 * divideNumbers - Divide user numbers
	 * @param num1
	 * @param num2
	 * @return num1 / num2
	 */
	public static double divideNumbers(double num1, double num2) {
		return num1 / num2;
	}
}