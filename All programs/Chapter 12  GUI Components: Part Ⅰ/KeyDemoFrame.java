// Fig. 12.36: KeyDemoFrame.java
// Key event handling.
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyDemoFrame extends JFrame implements KeyListener {
	private final String line1 = ""; // first line of text area
	private final String line2 = ""; // second line of text area
	private final String line3 = ""; // third line of text area
	private final JTextArea textArea; // text area to display output
	
	// KeyDemoFrame constructor
	public KeyDemoFrame() {
		super("Demonstrating Keystroke Events");
		
		textArea = new JTextArea(10, 15); // set up JTextArea
		textArea.setText("Press any key on the keyboard...");
		textArea.setEnabled(false);
		textArea.setDisabledTextColor(Color.BLACK);
		add(textArea); // add text area to JFrame
		
		addKeyListener(this); // allow frame to process key events
	}
	
	// handle press of any key
	@Override
	public void keyPressed(KeyEvent event) {
		line1 = String.format("Key pressed: %s",
				KeyEvent.getKeyText(event.getKeyCode())); // show pressed key
		setLines2and3(event); // set output lines two and three
	}
	
	// handle release of any key
	@Override
	public void keyReleased(KeyEvent event) {
		line1 = String.format("Key released: %s",
				KeyEvent.getKeyText(event.getKeyCode())); // show released key
		setLines2and3(event); // set output lines two and three
	}
	
	// handle press of an action key
	@Override
	public void keyTyped(KeyEvent event) {
		line1 = String.format("Key typed: %s",
				event.getKeyChar());
		setLines2and3(event); // set output lines two and three
	}
	
	// set second and third lines of output
	private void setLines2and3(KeyEvent event) {
		line2 = String.format("This key is %san action key",
				(event.isActionKey() ? "" : "not "));
		
		String temp = KeyEvent.getKeyModifiersText(event.getModifiers());
		
		line3 = String.format("Modifiers keys pressed: %s",
				(temp.equals("") ? "none" : temp)); // output modifiers
		
		textArea.setText(String.format("%s\n%s\n%s\n",
				line1, line2, line3)); // output three lines of text
	}
} // end class KeyDemoFrame
