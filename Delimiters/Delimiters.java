package Delimiters;

import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> o = new ArrayList<>();

        for (String t : tokens) {
            if (t == this.openDel || t == this.closeDel) {
                o.add(t);
            }
        }

        return o;
    }

    public boolean isBalanced(ArrayList<String> delimiters) {
        int c = 0;

        for (String d : delimiters) {
            if (d.equals(this.openDel)) {
                c++;
            } else if (d.equals(this.closeDel)) {
                c--;
            }

            if (c < 0) {
                return false;
            }
        }

        if (c == 0) {
            return true;
        } else {
            return false;
        }
    }
}
