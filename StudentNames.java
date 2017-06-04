package lab;

import javax.swing.JOptionPane;
import java.util.Arrays;
/**
 * StudentNames.java
 * @author jtveals
 * 10-7-16
 */
public class StudentNames {
	
	private static String[]names;
	
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
	
		getInput();
		sortNames();
		printNames();
		 
		System.exit(0);
	}
	
	/**
	 * getInput
	 * gets user input
	 */
	private static void getInput() {
		
		int size = 0;
		String input = "";
		
		
		input = JOptionPane.showInputDialog("How many names do you want to input");
		while (!UtilityOperations.validateInput(input)) {
			input = JOptionPane.showInputDialog("You entered invalid input. Please enter how many names you want to input");
		}
		
		size = Integer.parseInt(input);
		names = new String[size];
		
		JOptionPane.showMessageDialog(null, "You must use the same format for all the names\n" +
				"Valid formats for names are LastName,FirstName or FirstName LastName");
		
		
		for (int i = 0; i<size; i++){
			input = JOptionPane.showInputDialog("Input name #" + (i + 1));
			if (i > 0 ) {
				while (names[i - 1].contains(",") == true && input.contains(",") == false) {
					input = JOptionPane.showInputDialog("You entered invalid input. Enter name in LastName,FirstName format");
				}	
			}
			if (i > 0) {
				while (names[i - 1].contains(" ") == true && input.contains(" ") == false) {
					input = JOptionPane.showInputDialog("You entered invalid input. Enter name in First Name Last Name format");
				}
			}
			while (!UtilityOperations.validateInput(input)) {
				input = JOptionPane.showInputDialog("You entered invalid input. Please enter a name");
			}
			names[i] = input.trim();
		}	
	}
	
	/**
	 * sortNames
	 * sorts names array
	 */
	private static void sortNames() {
		
		int size = names.length;
		String[] tempNames = new String[size];
		String firstName = "";
		String lastName =  "";

		if (names[0].indexOf(",") == -1) {
			
			//sort names array in ascending order by swapping positions in the array
			// by using a temporary storage string and searching for the last name		
			
				
			for (int i = 0; i<size;i++) {
				firstName = names[i].substring(0, names[i].lastIndexOf(" "));
				lastName = names[i].substring(names[i].lastIndexOf(" ") + 1);
				tempNames[i] = lastName + " " + firstName;
			}
			
			Arrays.sort(tempNames);
			
			for (int i = 0; i<size; i++) {
				lastName = tempNames[i].substring(0, tempNames[i].lastIndexOf(" "));
				firstName = tempNames[i].substring(tempNames[i].lastIndexOf(" ") + 1);
				names[i] = firstName + " " + lastName;
 			}
			
		}
		else {
			Arrays.sort(names);
		}
	}
	
	/**
	 * printNames
	 * prints the names array
	 */
	private static void printNames() {
		String output = "";
		
		for (String sortedNames:names) {
			output = output + sortedNames + "\n";
		}
		
		JOptionPane.showMessageDialog(null, output);
	}

}
