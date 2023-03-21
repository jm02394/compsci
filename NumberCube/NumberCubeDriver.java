public class NumberCubeDriver {
    public static void main(String[] args) {
        NumberCube cube = new NumberCube();
        int numTosses = 20;

        int[] tosses = NumberCube.getCubeTosses(cube, numTosses);

        int longestRunStartIndex = NumberCube.getLongestRun(tosses);

        if (longestRunStartIndex != -1) {
            int longestRunLength = 1;
            for (int i = longestRunStartIndex + 1; i < tosses.length
                    && tosses[i] == tosses[longestRunStartIndex]; i++) {
                longestRunLength++;
            }
            System.out.println(
                    "Longest run starts at index " + longestRunStartIndex + " with length " + longestRunLength);
        } else {
            System.out.println("No runs of two or more consecutive values.");
        }
    }
}
