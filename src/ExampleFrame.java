import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

import Assets.*;


public class ExampleFrame extends JFrame {
	// PRIVATE INSTANCE VARIABLES

	private JLabel _firstNameLabel;
	private Icon _cube;

	// CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++++++++++++
	public ExampleFrame() {
		super("Example Frame");
		this._initialize();
	}

	// PRIVATE METHODS
	private void _initialize() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new FlowLayout());
		
		this._cube = new ImageIcon(getClass().getResource("/Assets/cube.png"));
		
		this._firstNameLabel = new JLabel("First Name: ", SwingConstants.CENTER);
		this._firstNameLabel.setIcon(this._cube);
		getContentPane().add(this._firstNameLabel);
	}

}
