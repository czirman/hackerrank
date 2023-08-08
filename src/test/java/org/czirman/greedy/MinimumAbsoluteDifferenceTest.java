package org.czirman.greedy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumAbsoluteDifferenceTest {

    MinimumAbsoluteDifference minimumAbsoluteDifference = new MinimumAbsoluteDifference();

    @Test
    public void sampleTest0() {
        //given
        List<Integer> arr = Arrays.asList(3, -7, 0);
        List<Integer> aro = new ArrayList<>(arr);

        //when
        Integer result = minimumAbsoluteDifference.minimumAbsoluteDifference(aro);
        //then
        assertEquals(3, result);

    }

    @Test
    public void sampleTest1() {
        //given
        List<Integer> arr = Arrays.asList(-59, -36, -13, 1, -53, -92, -2, -96, -54, 75);
        List<Integer> aro = new ArrayList<>(arr);

        //when
        Integer result = minimumAbsoluteDifference.minimumAbsoluteDifference(aro);
        //then
        assertEquals(1, result);
    }

    @Test
    public void sampleTest2() {
        //given
        List<Integer> arr = Arrays.asList(1, -3, 71, 68, 17);
        List<Integer> aro = new ArrayList<>(arr);

        //when
        Integer result = minimumAbsoluteDifference.minimumAbsoluteDifference(aro);
        //then
        assertEquals(3, result);
    }
}
