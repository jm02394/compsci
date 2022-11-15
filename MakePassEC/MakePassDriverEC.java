package MakePassEC;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MakePassDriverEC {
	public static void main(String[] args) {
		Object[] options1 = { "Ok", "Cancel", "Generate Random Password" };

		JPanel panel = new JPanel();
		panel.add(new JLabel("Enter a Password"));
		JTextField textField = new JTextField(10);
		panel.add(textField);

		int result = JOptionPane.showOptionDialog(null, panel, "Enter a Password",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
				null, options1, null);
		if (result == JOptionPane.YES_OPTION) {
			if (CheckPassword.isValid(textField.getText())) {
				JOptionPane.showMessageDialog(null, "Password Created: " + textField.getText());
			} else {
				JOptionPane.showMessageDialog(null, "Password Not Created");
			}
		} else if (result == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Password Not Created");
		} else if (result == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Random Password Created: " + CheckPassword.generateValidPassword());
		}
	}
}
