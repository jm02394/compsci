package MakePassEC;

import java.util.ArrayList;

public class CheckPassword {
	public static boolean isValid(String password) {
		boolean hasChar = false;

		for (int i = 0; i < password.length(); i++) {
			for (String c : new String[] { "+", "-", "*", "/", "@" }) {
				if (password.substring(i, i + 1).equals(c)) {
					hasChar = true;
				}
			}
		}

		return password.length() >= 6 && hasChar;
	}

	public static String generateValidPassword() {
		ArrayList<String> pass = new ArrayList<String>();

		int pos = (int) (Math.random() * 6);

		for (int i = 0; i < 6; i++) {
			if (i == pos) {
				pass.add("-");
			} else if (Math.random() > 0.5) {
				pass.add(new String[] { "a", "b", "c", "d", "e", "f" }[i]);
			} else {
				pass.add(new String[] { "A", "B", "C", "D", "E", "F" }[i]);
			}
		}

		return String.join("", pass);
	}
}
