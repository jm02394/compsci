package AlarmSet;

public class AlarmSet {
    int hours;
    int minutes;
    int seconds;
    boolean isPM;

    public AlarmSet(int hours, int minutes, int seconds, boolean isPM) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.isPM = isPM;
    }

    public AlarmSet() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
        this.isPM = false;
    }

    public String toString() {
        return "Your Alarm is set for " + this.hours + ":" + String.format("%02d", this.minutes) + ":"
                + String.format("%02d", this.seconds) + " " + (this.isPM ? "pm" : "am");
    }
}
