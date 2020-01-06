// Fig. 13.25: DrawArcs.java
// Drawing arcs.
import javax.swing.JFrame;

public class DrawArcs {
	// execute application
	public static void main(String[] args) {
		// create frame for ArcsJPanel
		JFrame frame = new JFrame("Drawing Arcs");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ArcsJPanel arcsJPanel = new ArcsJPanel();
		frame.add(arcsJPanel);
		frame.setSize(300, 210);
		frame.setVisible(true);
	}
} // end class DrawArcs
