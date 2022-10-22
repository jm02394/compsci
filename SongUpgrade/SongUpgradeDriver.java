package SongUpgrade;

public class SongUpgradeDriver {
    public static void main(String[] args) {
        SongUpgrade song = new SongUpgrade("Fur Elise", "Beethoven", 1810, 172);
        System.out.println("Song length (seconds): " + song.getLengthInSecs());
        song.setLengthInSecs(204);
        System.out.println("Updated song length (seconds): " + song.getLengthInSecs());
        System.out.println(song.toString());
    }
}
