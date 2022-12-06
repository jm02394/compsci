package SystemLog;

import java.util.ArrayList;

public class SystemLog {
    private ArrayList<LogMessage> messageList;

    public SystemLog(ArrayList<LogMessage> messageList) {
        this.messageList = messageList;
    }

    public ArrayList<LogMessage> removeMessages(String keyword) {
        ArrayList<LogMessage> tmp = new ArrayList<>(messageList);

        for (LogMessage m : this.messageList) {
            if (!m.containsWord(keyword)) {
                tmp.remove(m);
            }
        }

        return tmp;
    }

    public String toString() {
        String out = "";

        for (LogMessage m : this.messageList) {
            out += m.toString() + "\n";
        }

        return out;
    }
}
