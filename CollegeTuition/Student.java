package CollegeTuition;

public abstract class Student {
    private String name;
    private String major;
    private int units;

    public Student(String name, String major, int units) {
        this.name = name;
        this.major = major;
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public abstract int calculateTuition();

    public String toString() {
        return this.name + ", " + this.major + ": " + this.calculateTuition();
    }
}
