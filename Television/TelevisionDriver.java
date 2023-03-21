package Television;

import java.util.ArrayList;

public class TelevisionDriver {
    public static void main(String[] args) {
        ArrayList<Television> tvList = new ArrayList<Television>();
        Television tv1 = new Television(79.99);
        FourK tv2 = new FourK(169.99, true);
        DLP tv3 = new DLP(299.99, 300.0);
        LED tv4 = new LED(329.99, 10);
        tvList.add(tv1);
        tvList.add(tv2);
        tvList.add(tv3);
        tvList.add(tv4);

        System.out.println("TVs in the store...");
        for (Television tv : tvList) {
            System.out.println(tv.toString());
        }
    }
}
