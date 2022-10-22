package AlarmSet;

import javax.swing.JOptionPane;

public class AlarmSetDriver {
    public static void main(String[] args) {
        AlarmSet timeForBed = new AlarmSet();
        System.out.println(timeForBed.toString());

        String[] time = JOptionPane.showInputDialog("Time?").split(":");
        AlarmSet schoolOut = new AlarmSet(Integer.parseInt(time[0]), Integer.parseInt(time[1]),
                Integer.parseInt(time[2].split(" ")[0]), time[2].split(" ")[1] == "pm" ? true : false);
        System.out.println(schoolOut.toString());
    }
}
