package SemesterReview;

public class WeirdSorterDriver {
    public static void main(String[] args) {
        OrderedNums numList = new OrderedNums();

        int[] intList = numList.getList();
        Integer[] integerList = new Integer[intList.length];
        for (int i = 0; i < integerList.length; i++) {
            integerList[i] = intList[i];
        }

        WeirdSorter sorter = new WeirdSorter(integerList);
        System.out.println(sorter);
        for (int i : intList) {
            System.out.print(i);
            if (i != intList[intList.length - 1]) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
