class Find5 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];

        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[0].length; b++) {
                arr[a][b] = (int) (Math.random() * 10);
            }
        }

        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[0].length; b++) {
                System.out.print(arr[a][b] + "\t");
            }
            System.out.println();
        }

        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[0].length; b++) {
                if (arr[a][b] == 5) {
                    System.out.print("(" + a + ", " + b + ")" + "\t");
                }
            }
        }
        System.out.println();
    }
}
