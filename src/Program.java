import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

// DRIVER CLASS ++++++++++++++++++++++++++++++++++
public class Program {

	public static void main(String[] args) {
		/*
		ExampleFrame myFrame = new ExampleFrame();
		myFrame.setVisible(true); */
		
		String firstName;
		String lastName;
		int messageReturn;
		
		//firstName = JOptionPane.showInputDialog("Enter Your First Name");
		//lastName = JOptionPane.showInputDialog("Enter Your Last Name");
		
		//JOptionPane.showMessageDialog(null, "FirstName: " + firstName + " LastName: " + lastName, "Profile Info", JOptionPane.PLAIN_MESSAGE);
		//messageReturn = JOptionPane.showConfirmDialog(null, "Error - Incorrect Input", "Error", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
		
		//System.out.println(messageReturn);
		
		MyDialog myDialog = new MyDialog();
		myDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		myDialog.setVisible(true);
		
		
	}

}
