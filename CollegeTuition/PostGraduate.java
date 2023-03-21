package CollegeTuition;

public class PostGraduate extends Graduate {
    public PostGraduate(String name, String major, int units) {
        super(name, major, units);
    }

    public int calculateTuition() {
        return super.getUnits() * 750;
    }
}
