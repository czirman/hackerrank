package org.czirman.hashmap;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TwoStrings {

    public static String twoStrings(String s1, String s2) {

        List<Character> chars1 = s1.chars()
                .mapToObj(c -> (char) c)
                .distinct().collect(Collectors.toList());
        List<Character> chars2 = s2.chars()
                .mapToObj(c -> (char) c).distinct().collect(Collectors.toList());


        boolean contain = Collections.disjoint(chars1, chars2);
        return !contain ? "YES" : "NO";

    }
    // Dziala tylko time limit exceeded

    //


    public static void main(String[] args) {
        twoStrings("hi", "world");
    }


}
