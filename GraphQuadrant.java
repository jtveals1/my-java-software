/*Jason Veals
 * 8-23-16
 * GraphQuadrant.java
 */

package lab;

import javax.swing.JOptionPane;

public class GraphQuadrant {

	public static void main(String[] args) {
		//Get user input
		String userInput = JOptionPane.showInputDialog("Input your X Coordinate");
		int xCoordinate = Integer.parseInt(userInput);
		
		userInput = JOptionPane.showInputDialog("Input your Y Coordinate");
		int yCoordinate = Integer.parseInt(userInput);
		
		//Decision structure to determine output
		if (xCoordinate > 0 && yCoordinate > 0) {
			JOptionPane.showMessageDialog(null, String.format("The point (%d, %d) is located in Quadrant 1",xCoordinate,yCoordinate));
		}
		else if (xCoordinate < 0 && yCoordinate > 0) {
			JOptionPane.showMessageDialog(null, String.format("The point (%d, %d) is located in Quadrant 2",xCoordinate,yCoordinate));
		}
		else if (xCoordinate < 0 && yCoordinate < 0) {
			JOptionPane.showMessageDialog(null, String.format("The point (%d, %d) is located in Quadrant 3",xCoordinate,yCoordinate));
		}
		else if (xCoordinate > 0 && yCoordinate < 0) {
			JOptionPane.showMessageDialog(null, String.format("The point (%d, %d) is located in Quadrant 4",xCoordinate,yCoordinate));
		}
		else if (xCoordinate != 0 && yCoordinate == 0) {
			JOptionPane.showMessageDialog(null, String.format("The point (%d, %d) is located on the X-Axis",xCoordinate,yCoordinate));
		}
		else if (xCoordinate == 0 && yCoordinate != 0) {
			JOptionPane.showMessageDialog(null, String.format("The point (%d, %d) is located in the Y-Axis",xCoordinate,yCoordinate));
		}
		else {
			JOptionPane.showMessageDialog(null, String.format("The point (%d, %d) is located at the center of the graph on the X and Y-Axis",xCoordinate,yCoordinate));
		}
		
		System.exit(0);
	}

}
