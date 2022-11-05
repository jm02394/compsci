package MakePass;

import javax.swing.JOptionPane;

public class MakePassDriver {
	public static void main(String[] args) {
		String password = JOptionPane.showInputDialog("Enter a password");

		if (MakePass.isValid(password)) {
			System.out.println("Password created: " + password);
		} else {
			System.out.println("Invalid password: " + password);
		}
	}
}
