// Fig. 12.19: RadioButtonFrame.java
// Creating radio buttons using ButtonGroup and JRadioButton.
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButtonFrame extends JFrame {
	private final JTextField textField; // used to display font changes
	private final Font plainFont; // font for plain text
	private final Font boldFont; // font for bold text
	private final Font italicFont; // font for italic text
	private final Font boldItalicFont; // font for bold and italic text
	private final JRadioButton plainJRadioButton; // selects plain text
	private final JRadioButton boldJRadioButton; // selects bold text
	private final JRadioButton italicJRadioButton; // selects italic text
	private final JRadioButton boldItalicJRadioButton; // bold and italic
	private final ButtonGroup radioGroup; // holds radio buttons
	
	// RadioButtonFrame constructor adds JRadioButtons to JFrame
	public RadioButtonFrame() {
		super("RadioButton Test");
		setLayout(new FlowLayout());
		
		textField = new JTextField("Watch the font style change", 25);
		add(textField); // add textField to JFrame
		
		// create radio buttons
		plainJRadioButton = new JRadioButton("Plain", true);
		boldJRadioButton = new JRadioButton("Bold", false);
		italicJRadioButton = new JRadioButton("Italic", false);
		boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
		add(plainJRadioButton); // add plain button to JFrame
		add(boldJRadioButton); // add bold button to JFrame
		add(italicJRadioButton); // add italic button to JFrame
		add(boldItalicJRadioButton); // add bold and italic button
		
		// create logical relationship between JRadioButtons
		radioGroup = new ButtonGroup(); // create ButtonGroup
		radioGroup.add(plainJRadioButton); // add plain to group
		radioGroup.add(boldJRadioButton); // add bold to group
		radioGroup.add(italicJRadioButton); // add italic to group
		radioGroup.add(boldItalicJRadioButton); // add bold and italic
		
		// create font objects
		plainFont = new Font("Serif", Font.PLAIN, 14);
		boldFont = new Font("Serif", Font.BOLD, 14);
		italicFont = new Font("Serif", Font.ITALIC, 14);
		boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		textField.setFont(plainFont);
		
		// register events for JRadioButtons
		plainJRadioButton.addItemListener(
				new RadioButtonHandler(plainFont));
		boldJRadioButton.addItemListener(
				new RadioButtonHandler(boldFont));
		italicJRadioButton.addItemListener(
				new RadioButtonHandler(italicFont));
		boldItalicJRadioButton.addItemListener(
				new RadioButtonHandler(boldItalicFont));
	}
	
	// private inner class to handle radio button events
	private class RadioButtonHandler implements ItemListener {
		private Font font; // font associated with this listener
		
		public RadioButtonHandler(Font f) {
			font = f;
		}
		
		// handle radio button events
		@Override
		public void itemStateChanged(ItemEvent event) {
			textField.setFont(font);
		}
	}
} // end class RadioButtonFrame
