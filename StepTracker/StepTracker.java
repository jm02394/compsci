package StepTracker;

public class StepTracker {
    private int minSteps;
    private int totalSteps;
    private int numActiveDays;
    private int numDays;

    public StepTracker(int minSteps) {
        this.minSteps = minSteps;
        totalSteps = 0;
        numActiveDays = 0;
        numDays = 0;
    }

    public void addDailySteps(int steps) {
        totalSteps += steps;
        numDays++;

        if (steps >= minSteps) {
            numActiveDays++;
        }
    }

    public int activeDays() {
        return numActiveDays;
    }

    public double averageSteps() {
        if (numDays == 0) {
            return 0.0;
        }
        return (double) totalSteps / numDays;
    }
}
