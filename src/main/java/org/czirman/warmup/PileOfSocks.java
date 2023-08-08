package org.czirman.warmup;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class PileOfSocks {

    public int sockMerchant(int n, List<Integer> ar) {
        // n - ten paramentr nie jest potrzebny
        int result;
        Stream<Integer> stream = ar.stream().sorted();//REMEMBER
        Map<Integer, List<Integer>> map = stream.collect(groupingBy(Integer::intValue));
        Stream<Map.Entry<Integer, List<Integer>>> mapStream = map.entrySet().stream();

        result = mapStream.filter(arg -> arg.getValue().size() > 1)
                .map(arg -> arg.getValue().size() / 2)
                .collect(Collectors.summingInt(arg -> arg.intValue()));
        return result;
    }

}
