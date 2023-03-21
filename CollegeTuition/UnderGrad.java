package CollegeTuition;

public class UnderGrad extends Student {
    public UnderGrad(String name, String major, int units) {
        super(name, major, units);
    }

    public int calculateTuition() {
        return super.getUnits() * 250;
    }
}
