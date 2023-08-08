package org.czirman.warmup;

import java.util.List;

public class JumpingOnClouds {
    public static int jumpingOnClouds(List<Integer> c) {
        int result = -1;
        Integer[] temp = new Integer[c.size()];
        Integer[] tab = c.toArray(temp);
        for (int index = 0; index < tab.length; index++) {// REMEMBER warunek koncowy
            if (isLongSteep(tab, index)) {
                index++;

            }
            result++;
        }

        return result;
    }

    public static boolean isLongSteep(Integer[] tab, int actualSteep) {
        int longSteep = actualSteep+2;
        if (longSteep< tab.length && tab[actualSteep + 2] == 0 ) {
            return true;
        }
        return false;
    }
}
