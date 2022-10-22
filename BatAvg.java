public class BatAvg {
    public static void main(String[] args) {
        double[] avgs = new double[9];

        for (int i = 0; i < avgs.length; i++) {
            avgs[i] = Math.random() * 0.5;
        }

        for (double a : avgs) {
            System.out.println(String.format("%.3f", a));
        }

        double max = 0;
        for (double a : avgs) {
            if (a > max) {
                max = a;
            }
        }
        System.out.println("Max value: " + String.format("%.3f", max));
    }
}
