package SmartPhone2;

import java.util.ArrayList;

public class SmartPhone2 {
    public String brand;
    public int memory;
    public ArrayList<Song> songLibrary = new ArrayList<Song>();

    public SmartPhone2(String brand, int memory) {
        this.brand = brand;
        this.memory = memory;
        this.songLibrary.add(new Song("Bad Gun", "Jake Novak", 2022, 81));
        this.songLibrary.add(new Song("Moonlight Sonata", "Beethoven", 1801, 360));
        this.songLibrary.add(new Song("Firework", "Katy Perry", 2010, 234));
        this.songLibrary.add(new Song("Despacito", "Luis Fonsi", 2017, 282));
    }

    public int totalPlayTime() {
        int t = 0;

        for (Song s : this.songLibrary) {
            t += s.lengthInSecs;
        }

        return t;
    }

    public void deleteAllSongs() {
        this.songLibrary.clear();
    }

    public String toString() {
        String o = this.brand + " phone with " + this.memory + "GB of RAM\n\nSong Library";

        for (Song s : this.songLibrary) {
            o += "\n" + s.toString();
        }

        return o;
    }
}
