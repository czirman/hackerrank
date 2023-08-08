package org.czirman.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HourglassSumTest {

    HourglassSum hourglassSum = new HourglassSum();

    @Test
    public void countingValleysTest() {
        List firstList = Arrays.asList(-9, -9, -9, 1, 1, 1);
        List secondList = Arrays.asList(0, -9, 0, 4, 3, 2);

        List thirdList = Arrays.asList(-9, -9, -9, 1, 2, 3);
        List fourList = Arrays.asList(0, 0, 8, 6, 6, 0);
        List fiveList = Arrays.asList(0, 0, 0, -2, 0, 0);
        List sixList = Arrays.asList(0, 0, 1, 2, 4, 0);

        List<List<Integer>> listList = new ArrayList<>();
        listList.add(firstList);
        listList.add(secondList);
        listList.add(thirdList);
        listList.add(fourList);
        listList.add(fiveList);
        listList.add(sixList);

        //given 12
        int steeps = 12;
        String mark = "DDUUDDUDUUUD";

        //when
        int result = hourglassSum.hourglassSum(listList);
        //then
        assertEquals(28, result);

    }
}