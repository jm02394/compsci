package MyInteger;

import javax.swing.JOptionPane;

public class MyIntegerDriver {
	public static void main(String[] args) {
		MyInteger myInt = new MyInteger(
				Integer.parseInt(JOptionPane.showInputDialog("Please enter non-negative number")));

		System.out.println(myInt.toString());
		System.out.println("Sum: " + myInt.calculateSum());
	}
}
