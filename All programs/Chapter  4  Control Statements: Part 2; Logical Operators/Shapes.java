// Fig. 4.25: Shapes.java
// Drawing a cascade of shapes based on the user's choice.
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Shapes extends JPanel{
	// draws a cascade of shapes starting from the top-left corner
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (int i = 0; i < 10; i++) {
			g.drawRect(10 + i * 10, 10 + i * 10,
					50 + i * 10, 50 + i * 10);
			g.drawOval(240 + i * 10, 10 + i * 10,
					50 + i * 10, 50 + i * 10);
		}
	}
	
	public static void main(String[] args) {
		Shapes panel = new Shapes(); // create the panel
		JFrame application = new JFrame(); // creates a new JFrame
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(500, 290);
		application.setVisible(true);
	}
} // end class Shapes
