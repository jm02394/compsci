package CollegeTuition;

public class StudentDriver {
    public static void main(String[] args) {
        Student[][] studentBody = new Student[][] {
                new Student[] { new UnderGrad("Dave", "Liberal Arts", 50),
                        new UnderGrad("Beatrice", "Biochemistry", 65) },
                new Student[] { new Graduate("Jesse", "Computer Science", 100),
                        new Graduate("Nolan", "Computer Science", 120) },
                new Student[] { new PostGraduate("Carmen", "Engineering", 150),
                        new PostGraduate("Bob", "Psychology", 175) } };

        for (Student[] students : studentBody) {
            for (Student s : students) {
                System.out.print(s + "\t");
            }
            System.out.println();
        }
    }
}
