package org.czirman.sorting;

import java.util.Arrays;
import java.util.List;

public class CountSwaps {

    public static void countSwaps(List<Integer> a) {
        int swapsCount = 0;

        Integer[] n = a.toArray(new Integer[0]);
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (n[j] > n[j + 1]) {
                    {
                        int first = n[j];
                        int second = n[j+1];
                        n[j+1] = first;
                        n[j] = second;
                    }
                    //System.out.println(n[j] + "|" + n[j + 1]);
                    swapsCount++;
                }
            }
        }
        System.out.println("Array is sorted in "+swapsCount+" swaps.");
        System.out.println("First Element: "+n[0]);
        System.out.println("Last Element: "+n[n.length-1]);

    }

    private static void swap() {
    }

    public static void main(String[] args) {
        List lista = Arrays.asList(6, 4, 1);
        countSwaps(lista);
    }
}
