// Fig. 13.30: Shapes.java
// Testing ShapesJPanel.
import javax.swing.JFrame;

public class Shapes {
	// execute application
	public static void main(String[] args) {
		// create frame for ShapesJPanel
		JFrame frame = new JFrame("Drawing 2D shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create ShapesJPanel
		ShapesJPanel shapesJPanel = new ShapesJPanel();
		
		frame.add(shapesJPanel);
		frame.setSize(425, 200);
		frame.setVisible(true);
	}
} // end class Shapes
