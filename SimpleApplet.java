package lab;

import javax.swing.*;
import java.awt.*;

public class SimpleApplet extends JApplet {
	
	public void init() {
		JLabel label = new JLabel("This is my first applet");
		
		setLayout(new FlowLayout());
		
		add(label);
	}
}
