package org.czirman.sorting;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaximumToys {

    public static int maximumToys(List<Integer> prices, int k) {

        int sum = 0;
        int toysCount = 0;
        Stream<Integer> stream = prices.stream();
        List<Integer> sortedList = stream.sorted().collect(Collectors.toList());

        for (Integer element : sortedList) {
            sum += element;
            if (sum > k) {
                return toysCount;
            }
            toysCount++;
        }

        return toysCount;

    }
}
