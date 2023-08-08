package org.czirman.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class MakeAnagram {

    public static int makeAnagram(String a, String b) {
        long result = 0;
        List<Character> listA = createChars(a.toCharArray());
        List<Character> listB = createChars(b.toCharArray());

        listA.retainAll(listB);
        listB.retainAll(listA);

        int diffA = a.toCharArray().length - listA.size();
        int diffB = b.toCharArray().length - listB.size();
        result = diffA + diffB;

        Map<Character, Long> mapA = listA.stream().collect(groupingBy(Character::charValue, counting()));
        Map<Character, Long> mapB = listB.stream().collect(groupingBy(Character::charValue, counting()));
        for (Map.Entry<Character, Long> eleA : mapA.entrySet()) {
            Long eleB = mapB.get(eleA.getKey());
            Long valA = eleA.getValue();
            result += Math.abs(eleB - valA);
        }
        return (int) result;
    }

    private static List createChars(char[] chr) {
        List result = new ArrayList();
        for (char c : chr) {
            result.add(c);
        }
        return result;
    }
}
