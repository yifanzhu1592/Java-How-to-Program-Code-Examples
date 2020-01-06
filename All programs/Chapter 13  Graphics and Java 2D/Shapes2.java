// Fig. 13.32: Shapes2.java
// Demonstrating a general path.
import java.awt.Color;
import javax.swing.JFrame;

public class Shapes2 {
	// execute application
	public static void main(String[] args) {
		// create frame for Shapes2JPanel
		JFrame frame = new JFrame("Drawing 2D Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Shapes2JPanel shapes2JPanel = new Shapes2JPanel();
		frame.add(shapes2JPanel);
		frame.setBackground(Color.WHITE);
		frame.setSize(315, 330);
		frame.setVisible(true);
	}
} // end class Shapes2
