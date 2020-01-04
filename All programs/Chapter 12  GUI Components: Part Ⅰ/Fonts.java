// Fig. 13.12: Fonts.java
// Using fonts.
import javax.swing.JFrame;

public class Fonts {
	// execute application
	public static void main(String[] args) {
		// create frame for FontJPanel
		JFrame frame = new JFrame("Using fonts");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FontJPanel fontJPanel = new FontJPanel();
		frame.add(fontJPanel);
		frame.setSize(420, 150);
		frame.setVisible(true);
	}
} // end class Fonts
