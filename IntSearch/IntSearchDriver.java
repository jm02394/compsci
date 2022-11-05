package IntSearch;

import javax.swing.JOptionPane;

public class IntSearchDriver {
	public static void main (String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter integer to search for: "));
		int index = IntSearch.findThis(num);

		if (index != -1) {
			System.out.println("Index of number " + num + ": " + index);
		} else {
			System.out.println("Could not find the number in the list");
		}
	}
}

