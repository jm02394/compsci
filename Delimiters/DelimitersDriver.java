package Delimiters;

public class DelimitersDriver {
    public static void main(String[] args) {
        Delimiters del = new Delimiters("(", ")");

        String[] ex1 = new String[] { "(", "x + y", ")", " + 2" };
        String[] ex2 = new String[] { "(", "x + y", ")", " + 2", ")" };
        System.out.println(String.join("", ex1) + ", " + del.isBalanced(del.getDelimitersList(ex1)));
        System.out.println(String.join("", ex2) + ", " + del.isBalanced(del.getDelimitersList(ex2)));
    }
}
