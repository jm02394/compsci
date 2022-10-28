package StudentUpgrade;

public class StudentUpgradeDriver {
    public static void main(String[] args) {
        StudentUpgrade masterYoda = new StudentUpgrade("Master", "Yoda", 300, "jedi training",
                new double[] { 2.5, 3, 3.5, 4, 3.5, 4 });
        System.out.println(masterYoda.toString());
        masterYoda.setMath(4);
        System.out.println(masterYoda.getMath());
        System.out.println(masterYoda.calcGPA());
        System.out.println(masterYoda.toString());
    }
}
