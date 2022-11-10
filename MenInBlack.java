import java.util.ArrayList;

public class MenInBlack {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Billy");
		names.add("Bob");
		names.add("Joe");
		names.add("Foo");
		names.add("Bar");

		for (String n : names) System.out.println(n);
		System.out.println();

		names.remove("Joe");

		for (String n : names) System.out.println(n);
	}
}
