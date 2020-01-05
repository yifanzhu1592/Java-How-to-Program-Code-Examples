// Fig. 13.16: Metrics.java
// Displaying font metrics.
import javax.swing.JFrame;

public class Metrics {
	// execute application
	public static void main(String[] args) {
		// create frame for MetricsJPanel
		JFrame frame = new JFrame("Demonstrating FontMetrics");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MetricsJPanel metricsJPanel = new MetricsJPanel();
		frame.add(metricsJPanel);
		frame.setSize(510, 240);
		frame.setVisible(true);
	}
} // end class Metrics
