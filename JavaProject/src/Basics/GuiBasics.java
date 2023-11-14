package Basics;
import javax.swing.JOptionPane;

public class GuiBasics {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		// Open a Box with message
		JOptionPane.showMessageDialog(null, "Hello "+ name);
		
		// showInputDialog returns a String. So it must be parsed
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		// Open a Box with message
		JOptionPane.showMessageDialog(null, "Your are "+ age + " years old.");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		// Open a Box with message
		JOptionPane.showMessageDialog(null, "Your are "+ height + " cm tall.");


	}

}
