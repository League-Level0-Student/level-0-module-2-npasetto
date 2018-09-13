package methods;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("What is your height in inches?");
	int heightInt = Integer.parseInt(height);
	if (heightInt>48) {
		JOptionPane.showMessageDialog(null, "You are aloud to go on the rollercoaster.");
	}else {
		JOptionPane.showMessageDialog(null, "You need to grow more.");
	}
}
}
