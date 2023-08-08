package org.czirman;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class ZarazWszyskotRozpierdoleTeZadanie {
    public static String isValid(String s) {
        Map<Long, Integer> sumarize = new HashMap<>();
        Stream<Character> characterStream = s.chars()
                .mapToObj(c -> (char) c);
        Map<Character, Long> map = characterStream.sorted().collect(groupingBy(Character::charValue, counting()));
        for (Map.Entry<Character, Long> entry : map.entrySet()) {
            if (!sumarize.containsKey(entry.getValue())){
                sumarize.put(entry.getValue(), 1);
            }
            else {
                int ile = sumarize.get(entry.getValue());
                sumarize.put(entry.getValue(), ile++);
            }
        }

        if (sumarize.size()>2){
            return "NO";
        }
        else {
            Iterator<Map.Entry<Long, Integer>> iterator = sumarize.entrySet().iterator();

            Map.Entry<Long, Integer> first = iterator.next();
            Map.Entry<Long, Integer> swcond = iterator.next();
            if (first.getValue() == 1){
                if (Math.abs(first.getKey() - swcond.getKey())>1){
                    return "NO";
                }
            }
            if (swcond.getValue() == 1){
                if (Math.abs(first.getKey() - swcond.getKey())>1){
                    return "NO";
                }
            }
        }

        return "YES";

    }

    public static void main(String[] args) {
        isValid("aabbcd");
    }
}
