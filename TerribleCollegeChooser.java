import java.util.ArrayList;

public class TerribleCollegeChooser {
	public static void main(String[] args) {
		ArrayList<String> collegeList = new ArrayList<String>();
		collegeList.add("USC");
		collegeList.add("UCLA");
		collegeList.add("Berkeley");
		collegeList.add("Yale");
		collegeList.add("MIT");
		collegeList.add("UMass");
		collegeList.add("Army");
		collegeList.add("Navy");

		for (String c : collegeList)
			System.out.println(c);
		System.out.println();

		for (int i = 0; i < collegeList.size(); i++) {
			if (collegeList.get(i).length() == 4) {
				collegeList.remove(i);
				i--;
			}
		}

		for (String c : collegeList)
			System.out.println(c);
	}
}
