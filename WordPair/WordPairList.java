package WordPair;

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        allPairs = new ArrayList<>();

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }

    public int numMatches() {
        int c = 0;

        for (WordPair wp : this.allPairs) {
            if (wp.getFirst().equals(wp.getSecond())) {
                c++;
            }
        }

        return c;
    }

    public String toString() {
        String o = "";

        for (WordPair wp : this.allPairs) {
            o += wp + " ";
        }

        return o;
    }
}
