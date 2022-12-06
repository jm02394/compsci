package SystemLog;

public class LogMessage {
    private String machineId;
    private String description;

    public LogMessage(String message) {
        this.machineId = message.substring(0, message.indexOf(":"));
        this.description = message.substring(message.indexOf(":") + 1);
    }

    public boolean containsWord(String keyword) {
        return this.description.contains(keyword)
                && (this.description.indexOf(keyword) == 0 || this.description.contains(" " + keyword))
                && (this.description.indexOf(keyword) + keyword.length() == this.description.length()
                        || this.description.contains(keyword + " "));
    }

    public String getMachineId() {
        return machineId;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return this.machineId + ":" + this.description;
    }
}
