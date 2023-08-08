package org.czirman.arrays;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RotateLeft {


    public static List<Integer> rotLeft(List<Integer> a, int d) {
        Stream<Integer> firstPart = a.stream().limit(d);
        Stream<Integer> lastPart = a.stream().skip(d);// REMEMBER metode

        List<Integer> result = Stream.concat(lastPart, firstPart).collect(Collectors.toList());// REMEMBER tylko metode

        return result;
    }

}
