package Add15;

public class Add15 {
    public static void main(String[] args) {
        int[][] arr = new int[3][5];

        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[0].length; b++) {
                arr[a][b] = a * arr[0].length + b + 1;
            }
        }

        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[0].length; b++) {
                System.out.print(arr[a][b] + "\t");
            }
            System.out.println();
        }

        int t = 0;
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[0].length; b++) {
                t += arr[a][b];
            }
        }
        System.out.println("Total: " + t);

        for (int a = 0; a < arr.length; a++) {
            int rt = 0;
            for (int b = 0; b < arr[0].length; b++) {
                rt += arr[a][b];
            }
            System.out.println("Row " + (a + 1) + " total: " + rt);
        }

        for (int b = 0; b < arr[0].length; b++) {
            int ct = 0;
            for (int a = 0; a < arr.length; a++) {
                ct += arr[a][b];
            }
            System.out.println("Column " + (b + 1) + " total: " + ct);
        }
    }
}
