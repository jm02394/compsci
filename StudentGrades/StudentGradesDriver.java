package StudentGrades;

public class StudentGradesDriver {
    public static void main(String[] args) {
        StudentGrades student1 = new StudentGrades();
        System.out.println(student1.getGrade());

        StudentGrades student2 = new StudentGrades("Jane", "Doe", 9, "math", new double[] { 2.5, 3, 3.5, 4, 3.5, 4 });
        System.out.println(student2.getGrade());
    }
}
