package IntSearch;

public class IntSearch {
	private static int[] numList = new int[] {-9, 2, 3, 4, 7, 9, 10, 23, 45, 67};

	public static int findThis(int toFind) {
		for (int i = 0; i < numList.length; i++) {
			if (numList[i] == toFind) return i;
		}

		return -1;
	}
}
