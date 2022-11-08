public class StudentAlpha {
    public static void main(String[] args) {
        String[] students = new String[] { "Gavin", "Spencer", "Adam", "Nolan" };

        for (String s : sort(students)) {
            System.out.print(s + " ");
        }
    }

    public static String[] sort(String[] inp) {
        for (int i = 0; i < inp.length - 1; i++) {
            if (inp[i].compareTo(inp[i + 1]) > 0) {
                String tmp = inp[i];
                inp[i] = inp[i + 1];
                inp[i + 1] = tmp;
                return sort(inp);
            }
        }

        return inp;
    }
}
