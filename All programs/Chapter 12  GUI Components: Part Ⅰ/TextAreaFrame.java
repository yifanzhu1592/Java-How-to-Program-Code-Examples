// Fig. 12.47: TextAreaFrame.java
// Copying selected text from one JText area to another.
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class TextAreaFrame extends JFrame {
	private final JTextArea textArea1; // displays demo string
	private final JTextArea textArea2; // highlighted text is copied here
	private final JButton copyJButton; // initiates copying of text
	
	// no-argument constructor
	public TextAreaFrame() {
		super("TextArea Demo");
		Box box = Box.createHorizontalBox(); // create box
		String demo = "This is a demo string to\n" +
				"illustrate copying text\nfrom one textarea to \n" +
				"another textarea using an\nexternal event\n";
		
		textArea1 = new JTextArea(demo, 10, 15);
		box.add(new JScrollPane(textArea1)); // add scrollpane
		
		copyJButton = new JButton("Copy >>>"); // create copy button
		box.add(copyJButton); // add copy button to box
		copyJButton.addActionListener(
				new ActionListener() { // anonymous inner class
					// set text in textArea2 to selected text from textArea1
					@Override
					public void actionPerformed(ActionEvent event) {
						textArea2.setText(textArea1.getSelectedText());
					}
				}
		);
		
		textArea2 = new JTextArea(10, 15);
		textArea2.setEditable(false);
		box.add(new JScrollPane(textArea2)); // add scrollpane
		
		add(box); // add box to frame
	}
} // end class TextAreaFrame
