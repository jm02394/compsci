package SystemLog;

import java.util.ArrayList;
import java.util.Arrays;

public class SystemLogDriver {
    public static void main(String[] args) {
        SystemLog theLog = new SystemLog(new ArrayList<>(Arrays.asList(
                new LogMessage("CLIENT3:security alert – repeated login failures"),
                new LogMessage("Webserver:disk offline"),
                new LogMessage("SERVER1:file not found"),
                new LogMessage("SERVER2:read error on disk DSK1"),
                new LogMessage("SERVER1:write error on disk DSK2"),
                new LogMessage("Webserver:error on /dev/disk "))));

        System.out.println(theLog.toString());
        System.out.println(new SystemLog(new ArrayList<>(theLog.removeMessages("disk"))).toString());
    }
}
