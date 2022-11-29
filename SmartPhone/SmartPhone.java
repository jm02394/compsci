package SmartPhone;

public class SmartPhone {
    public String brand;
    public int memory;
    public Song songLibrary[] = new Song[4];

    public SmartPhone(String brand, int memory) {
        this.brand = brand;
        this.memory = memory;
        songLibrary = new Song[] {
                new Song("Bad Gun", "Jake Novak", 2022, 81),
                new Song("Moonlight Sonata", "Beethoven", 1801, 360),
                new Song("Firework", "Katy Perry", 2010, 234),
                new Song("Despacito", "Luis Fonsi", 2017, 282)
        };
    }

    public int totalPlayTime() {
        int t = 0;

        for (Song s : this.songLibrary) {
            t += s.lengthInSecs;
        }

        return t;
    }

    public void deleteAllSongs() {
        this.songLibrary = new Song[] { null, null, null, null };
    }

    public String toString() {
        String o = this.brand + " phone with " + this.memory + "GB of RAM\n\nSong Library";

        for (Song s : this.songLibrary) {
            if (s != null) {
                o += "\n" + s.toString();
            } else {
                o += "\nNo song stored";
            }
        }

        return o;
    }
}
