package MakePass;

public class MakePass {
	public static boolean isValid(String password) {
		boolean hasChar = false;
		
		for (int i = 0; i < password.length(); i++) {
			for (String c : new String[] {"+", "-", "*", "/", "@"} ) {
				if (password.substring(i, i + 1).equals(c)) {
					hasChar = true;
				}
			}
		}
		
		return password.length() >= 6 && hasChar;
	}
}
