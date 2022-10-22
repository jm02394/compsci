package AlarmUpgrade;

public class AlarmUpgrade {
    int hours;
    int minutes;
    int seconds;
    boolean isPM;

    public AlarmUpgrade(int hours, int minutes, int seconds, boolean isPM) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.isPM = isPM;
    }

    public AlarmUpgrade() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
        this.isPM = false;
    }

    public void setTime(int hours, int minutes, int seconds, boolean isPM) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.isPM = isPM;
    }

    public boolean getAmPm() {
        return this.isPM;
    }

    public int totalSeconds() {
        return this.hours * 60 * 60 + this.minutes * 60 + this.seconds + (this.isPM ? 43200 : 0);
    }

    public String toString() {
        return "Your Alarm is set for " + this.hours + ":" + String.format("%02d", this.minutes) + ":"
                + String.format("%02d", this.seconds) + " " + (this.isPM ? "pm" : "am") + ", " + this.totalSeconds()
                + " total seconds";
    }
}
