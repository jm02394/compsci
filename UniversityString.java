import javax.swing.JOptionPane;

public class UniversityString {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Number of universities?"));
        String[] unis = new String[num];

        for (int i = 0; i < num; i++) {
            unis[i] = JOptionPane.showInputDialog("University name?");
        }

        String min = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        for (String u : unis) {
            System.out.println(u + ": " + u.length() + " letters long");

            if (min.length() < u.length()) {
                min = u;
            }
        }
        unis[2] = "";

        System.out.println();

        for (String u : unis) {
            System.out.println(u);
        }
    }
}
