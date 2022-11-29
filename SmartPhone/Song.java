package SmartPhone;

public class Song {
    String name;
    String artist;
    int releaseYear;
    int lengthInSecs;

    public Song(String name, String artist, int releaseYear, int lengthInSecs) {
        this.name = name;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.lengthInSecs = lengthInSecs;
    }

    public String toString() {
        return this.artist + " - " + this.name + ", " + this.releaseYear + ", "
                + this.convertToMinSec(this.lengthInSecs);
    }

    public int getLengthInSecs() {
        return this.lengthInSecs;
    }

    public void setLengthInSecs(int lengthInSecs) {
        this.lengthInSecs = lengthInSecs;
    }

    public String convertToMinSec(int sec) {
        return sec / 60 + " minutes and " + sec % 60 + " seconds";
    }
}
