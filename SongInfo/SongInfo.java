package SongInfo;

public class SongInfo {
    String name;
    String artist;
    int releaseYear;

    public SongInfo(String name, String artist, int releaseYear) {
        this.name = name;
        this.artist = artist;
        this.releaseYear = releaseYear;
    }

    public SongInfo() {
        this.name = "Default Name";
        this.artist = "Default Artist";
        this.releaseYear = 2000;
    }

    public String toString() {
        return this.artist + " - " + this.name + ", " + this.releaseYear;
    }
}
