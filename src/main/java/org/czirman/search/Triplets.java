package org.czirman.search;

import java.util.ArrayList;
import java.util.List;

public class Triplets {

    public static long triplets(List<Integer> a, List<Integer> b, List<Integer> c) {
        List<Long> count = new ArrayList();
        // Trudna sztuka

        int aa=0,bb=0,cc=0;
        for (Integer A : a) {
            aa++;
            for (Integer B : b) {
                bb++;
                for (Integer C : c) {
                    cc++;
                    if (A >=  B && B >= C) {
                        long cur = A+B+C;

                        if (!count.contains(cur)){
                            System.out.println(aa+"|"+bb+"|"+cc+"|");
                            count.add(cur);
                        }
                    }
                }
            }
        }
        return 0;
    }
}


