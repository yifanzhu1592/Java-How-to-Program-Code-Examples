// Fig. 13.19: LinesRectsOvals.java
// Testing LinesRectsOvalsJPanel.
import java.awt.Color;
import javax.swing.JFrame;

public class LinesRectsOvals {
	// execute application
	public static void main(String[] args) {
		// create frame for LinesRectsOvalsJPanel
		JFrame frame = new JFrame("Drawing lines, rectangles and ovals");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LinesRectsOvalsJPanel linesRectsOvalsJPanel = new LinesRectsOvalsJPanel();
		linesRectsOvalsJPanel.setBackground(Color.WHITE);
		frame.add(linesRectsOvalsJPanel);
		frame.setSize(400, 210);
		frame.setVisible(true);
	}
} // end class LinesRectsOvals
