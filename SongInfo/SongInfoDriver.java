package SongInfo;

public class SongInfoDriver {
    public static void main(String[] args) {
        SongInfo song1 = new SongInfo();
        System.out.println(song1.toString());

        SongInfo song2 = new SongInfo("Fur Elise", "Beethoven", 1810);
        System.out.println(song2.toString());
    }
}
