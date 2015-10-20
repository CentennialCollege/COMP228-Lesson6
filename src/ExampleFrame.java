import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JLabel;


public class ExampleFrame extends JFrame {
	// PRIVATE INSTANCE VARIABLES

	private JLabel _firstNameLabel;

	// CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++++++++++++
	public ExampleFrame() {
		super("Example Frame");
		this._initialize();
	}

	// PRIVATE METHODS
	private void _initialize() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new FlowLayout());

		
		this._firstNameLabel = new JLabel("First Name: ", SwingConstants.CENTER);
		getContentPane().add(this._firstNameLabel);
	}

}
