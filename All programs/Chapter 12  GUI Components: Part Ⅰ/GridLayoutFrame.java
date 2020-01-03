// Fig. 12.43: GridLayoutFrame.java
// GridLayout containing six buttons.
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class GridLayoutFrame extends JFrame implements ActionListener {
	private final JButton[] buttons; // array of buttons
	private static final String[] names =
		{ "one", "two", "three", "four", "five", "six" };
	private boolean toggle = true; // toggle between two layouts
	private final Container container; // frame container
	private final GridLayout gridLayout1; // first gridlayout
	private final GridLayout gridLayout2; // second gridlayout
	
	// no-argument constructor
	public GridLayoutFrame() {
		super("GridLayout Demo");
		gridLayout1 = new GridLayout(2, 3, 5, 5); // 2 by 3; gaps of 5
		gridLayout2 = new GridLayout(3, 2); // 3 by 2; no gaps
		container = getContentPane();
		setLayout(gridLayout1);
		buttons = new JButton[names.length];
		
		for (int count = 0; count < names.length; count++) {
			buttons[count] = new JButton(names[count]);
			buttons[count].addActionListener(this); // register listener
			add(buttons[count]); // add buttonto JFrame
		}
	}
	
	// handle button events by toggling between layouts
	@Override
	public void actionPerformed(ActionEvent event) {
		if (toggle) // set layout based on toggle
			container.setLayout(gridLayout2);
		else
			container.setLayout(gridLayout1);
		
		toggle = !toggle;
		container.validate(); // re-lay out container
	}
} // end class GridLayoutFrame
