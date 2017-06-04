/*Jason Veals
 *August 17, 2016
 *MadLib.java
 */

package lab;
 
import javax.swing.JOptionPane;

public class MadLib {
	public static void main(String[] args) {
		
		String infoMessage = 
				String.format("This is a MadLib program.\n"                      +
						"You will be prompted to enter a series of words\n"      +
						"That will complete the MadLib.");
				
		JOptionPane.showMessageDialog(null, infoMessage);
				
// Prompt user for information to finish MadLib
		
		String adjective  = JOptionPane.showInputDialog("Enter an adjective.");
		String adjective2 = JOptionPane.showInputDialog("Enter a second adjective.");
		String adjective3 = JOptionPane.showInputDialog("Enter a third adjective.");
		String adjective4 = JOptionPane.showInputDialog("Enter a fourth adjective.");
		
		String subject = JOptionPane.showInputDialog("Enter your course of study.");
		
		String teacher = JOptionPane.showInputDialog("Enter your teacher's name.");
		
		String verb  = JOptionPane.showInputDialog("Enter a verb");
		String verb2 = JOptionPane.showInputDialog("Enter a second verb");
		
		String adverb  = JOptionPane.showInputDialog("Enter an adverb");
		
// Completes MadLib by using %s place holders to insert information from user
	
		String outputMessage = 
			String.format("Today was the first day of school. I was a little nervous because I’d heard some %s\n",adjective)              +
			String.format("rumors about our new %s teacher. Don’t get me wrong, some students thought that %s\n",subject,teacher)         +
			String.format("was %s, but there were many who thought she was the %s teacher they’d ever met.\n",adjective2,adjective3)      +
			String.format("Other students from last year told us how %s would %s to the front of the classroom \n",teacher,verb)          +
			String.format("then %s %s to get the class’s attention. Most of the time, %s was very unpredictable.\n",verb2,adverb,teacher) +
			String.format("So you see, many of us were a little %s when we first entered the classroom.",adjective4);
		
		JOptionPane.showMessageDialog(null, outputMessage);
		
		System.exit(0);
	}

}

