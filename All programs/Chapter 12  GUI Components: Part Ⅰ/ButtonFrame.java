// Fig. 12.15: ButtonFrame.java
// Command buttons and action events.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame {
	private final JButton plainJButton; // button with just text
	private final JButton fancyJButton; // button with icons
	
	// ButtonFrame adds JButtons to JFrame
	public ButtonFrame() {
		super("Testing Buttons");
		setLayout(new FlowLayout());
		
		plainJButton = new JButton("Plain Button"); // button with text
		add(plainJButton); // add plainJButton to JFrame
		
		Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif"));
		Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));
		fancyJButton = new JButton("Fancy Button", bug1); // set image
		fancyJButton.setRolloverIcon(bug2); // set rollover image
		add(fancyJButton); // add fancyJButton to JFrame
		
		// create new ButtonHandler for button event handling
		ButtonHandler handler = new ButtonHandler();
		fancyJButton.addActionListener(handler);
		plainJButton.addActionListener(handler);
	}
	
	// inner class for button event handling
	private class ButtonHandler implements ActionListener {
		// handle button event
		@Override
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
					"You pressed: %s", event.getActionCommand()));
		}
	}
} // end class ButtonFrame
