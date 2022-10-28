package StudentGrades;

public class StudentGrades {
    String firstName;
    String lastName;
    int grade;
    String favoriteSubject;
    double[] grades;

    public StudentGrades(String firstName, String lastName, int grade, String favoriteSubject, double[] grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.favoriteSubject = favoriteSubject;
        this.grades = grades;
    }

    public StudentGrades() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.grade = 12;
        this.favoriteSubject = "lunch";
        this.grades = new double[] { 4, 4, 4, 4, 4, 4 };
    }

    public double getMath() {
        return this.grades[1];
    }

    public void setMath(double mathGrade) {
        this.grades[1] = mathGrade;
    }

    public double calcGPA() {
        int c = 0;

        for (double g : this.grades) {
            c += g;
        }

        return c / (double) this.grades.length;
    }

    public String getGrade() {
        double gpa = this.calcGPA();
        if (gpa >= 4)
            return "A";
        else if (gpa >= 3)
            return "B";
        else if (gpa >= 2)
            return "C";
        else if (gpa >= 1)
            return "D";
        else
            return "F";
    }

    public String toString() {
        return "Student: " + this.firstName + " " + this.lastName + "\nCumulative GPA: " + this.calcGPA();
    }
}
