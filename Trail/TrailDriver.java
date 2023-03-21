package Trail;

public class TrailDriver {
    public static void main(String[] args) {
        Trail trail = new Trail(new int[] { 100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100 });
        System.out.println("Between 7 and 10 is segment: " + trail.isLevelTrailSegment(7, 10));
        System.out.println("Between 2 and 12 is segment: " + trail.isLevelTrailSegment(2, 12));
        System.out.println("Is difficult: " + trail.isDifficult());
    }
}
