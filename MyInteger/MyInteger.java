package MyInteger;

public class MyInteger {
	public int num;

	public MyInteger(int num) {
		this.num = num;
	}

	public String toString() {
		return "Integer is: " + this.num;
	}

	public int calculateSum() {
		int c = 0;

		for (String i : Integer.toString(this.num).split("")) {
			c += Integer.parseInt(i);
		}

		return c;
	}
}
