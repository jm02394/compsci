import javax.swing.JOptionPane;

public class TimesTable {
    public static void main(String[] args) {
        int r = Integer.parseInt(JOptionPane.showInputDialog("Number of rows:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Number of columns:"));

        int[][] table = new int[r][c];

        for (int a = 0; a < r; a++) {
            for (int b = 0; b < r; b++) {
                table[a][b] = (a + 1) * (b + 1);
            }
        }

        for (int i = 0; i < c; i++) {
            System.out.print("\t" + (i + 1));
        }
        System.out.println();

        for (int a = 0; a < r; a++) {
            System.out.print((a + 1) + "\t");
            for (int b = 0; b < r; b++) {
                System.out.print(table[a][b] + "\t");
            }
            System.out.println();
        }
    }
}
