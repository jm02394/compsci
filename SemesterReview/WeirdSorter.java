package SemesterReview;

import java.util.ArrayList;
import java.util.Arrays;

public class WeirdSorter {
    public Integer[] initArray;
    public Integer[] finalArray;

    public WeirdSorter(Integer[] initArray) {
        this.initArray = initArray;
        this.finalArray = organize(initArray);
    }

    private boolean isPrime(int inp) {
        if (inp < 2) {
            return false;
        }

        for (int i = 2; i <= (int) Math.sqrt(inp); i++) {
            if (inp % i == 0) {
                return false;
            }
        }

        return true;
    }

    private boolean isPerfectCube(int inp) {
        return (int) Math.cbrt(inp) == Math.cbrt(inp);
    }

    private boolean isEven(int inp) {
        return inp % 2 == 0;
    }

    private boolean containsDigits(int inp) {
        String inpStr = Integer.toString(inp);

        return inpStr.contains("1") || inpStr.contains("5") || inpStr.contains("8");
    }

    private ArrayList<Integer> reorder(ArrayList<Integer> inp) { // switches every other value in the array
        ArrayList<Integer> out = new ArrayList<Integer>();

        for (int i = 0; i < inp.size(); i++) {
            if (i % 2 == 0 && i + 1 < inp.size()) {
                out.add(inp.get(i + 1));
                out.add(inp.get(i));
            }
        }

        if (inp.size() % 2 == 1) {
            out.add(inp.get(inp.size() - 1));
        }

        return out;
    }

    private Integer[] organize(Integer[] inp) {
        ArrayList<Integer> finalList = new ArrayList<>();
        ArrayList<Integer> primes = new ArrayList<>();
        ArrayList<Integer> cubes = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> digits = new ArrayList<>();

        ArrayList<Integer> ordered = new ArrayList<Integer>(Arrays.asList(inp));

        for (int i : new ArrayList<>(ordered)) {
            if (isPrime(i)) {
                primes.add(i);
                ordered.remove(Integer.valueOf(i));
            }
        }

        for (int i : inp) {
            if (isPerfectCube(i)) {
                cubes.add(i);
                ordered.remove(Integer.valueOf(i));
            }
        }

        for (int i : new ArrayList<>(ordered)) {
            if (isEven(i)) {
                evens.add(i);
                ordered.remove(Integer.valueOf(i));
            }
        }

        for (int i : new ArrayList<>(ordered)) {
            if (containsDigits(i)) {
                digits.add(i);
                ordered.remove(Integer.valueOf(i));
            }
        }

        finalList.addAll(reorder(primes));
        finalList.add(0);
        finalList.addAll(reorder(evens));
        finalList.add(0);
        finalList.addAll(reorder(ordered));
        finalList.add(0);
        finalList.addAll(reorder(digits));
        finalList.add(0);
        finalList.addAll(reorder(cubes));

        Integer[] arr = new Integer[finalList.size()];
        return finalList.toArray(arr);
    }

    public String toString() {
        String out = "";

        for (int i : this.finalArray) {
            out += Integer.toString(i);
            if (i != this.finalArray[this.finalArray.length - 1]) {
                out += ", ";
            }
        }

        return out;
    }
}
