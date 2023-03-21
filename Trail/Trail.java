package Trail;

import java.util.Arrays;

public class Trail {
    private int[] markers;

    public Trail(int[] markers) {
        this.markers = markers;
    }

    public boolean isLevelTrailSegment(int start, int end) {
        int[] slice = Arrays.copyOfRange(markers, start, end + 1);
        return Arrays.stream(slice).max().getAsInt() - Arrays.stream(slice).min().getAsInt() <= 10;
    }

    public boolean isDifficult() {
        int c = 0;
        for (int i = 0; i < markers.length - 1; i++) {
            if (Math.abs(this.markers[i + 1] - this.markers[i]) >= 30) {
                c++;
            }
        }
        return c >= 3;
    }
}
