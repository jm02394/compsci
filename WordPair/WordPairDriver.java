package WordPair;

public class WordPairDriver {
    public static void main(String[] args) {
        WordPairList wpl1 = new WordPairList(new String[] { "one", "two", "three" });
        System.out.println(wpl1);
        System.out.println(wpl1.numMatches());

        WordPairList wpl2 = new WordPairList(new String[] { "the", "more", "the", "merrier" });
        System.out.println(wpl2);
        System.out.println(wpl2.numMatches());

        WordPairList wpl3 = new WordPairList(new String[] { "the", "red", "fox", "the", "red" });
        System.out.println(wpl3);
        System.out.println(wpl3.numMatches());
    }
}
