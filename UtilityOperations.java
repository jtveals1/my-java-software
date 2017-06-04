package lab;
/**
 * 
 * @author jtveals
 *
 */
public class UtilityOperations {
	
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

}
