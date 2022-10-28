package Student;

public class Student {
    String firstName;
    String lastName;
    int grade;
    String favoriteSubject;

    public Student(String firstName, String lastName, int grade, String favoriteSubject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.favoriteSubject = favoriteSubject;
    }

    public Student() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.grade = 12;
        this.favoriteSubject = "lunch";
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " (Grade " + this.grade + ")'s favorite subject is "
                + this.favoriteSubject;
    }
}
