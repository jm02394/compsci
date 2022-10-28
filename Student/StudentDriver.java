package Student;

public class StudentDriver {
    public static void main(String[] args) {
        Student senior001 = new Student();
        System.out.println(senior001.toString());

        Student freshman001 = new Student("Jane", "Doe", 9, "math");
        System.out.println(freshman001.toString());
    }
}
