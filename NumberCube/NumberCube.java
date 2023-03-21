public class NumberCube {
    public int toss() {
        return (int) (Math.random() * 6) + 1;
    }

    public static int[] getCubeTosses(NumberCube cube, int numTosses) {
        int[] result = new int[numTosses];

        for (int i = 0; i < numTosses; i++) {
            result[i] = cube.toss();
        }

        return result;
    }

    public static int getLongestRun(int[] values) {
        int maxRunIndex = -1;
        int maxRunLength = 1;

        for (int i = 0; i < values.length; i++) {
            int currentRunLength = 1;

            while (i < values.length - 1 && values[i] == values[i + 1]) {
                currentRunLength++;
                i++;
            }

            if (currentRunLength > maxRunLength) {
                maxRunLength = currentRunLength;
                maxRunIndex = i - currentRunLength + 1;
            }
        }

        return maxRunLength > 1 ? maxRunIndex : -1;
    }
}
