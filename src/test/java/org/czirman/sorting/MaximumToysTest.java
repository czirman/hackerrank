package org.czirman.sorting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumToysTest {

    MaximumToys maximumToys = new MaximumToys();

    @Test
    public void maximumToys() {
        //given
        ArrayList<Integer> table = new ArrayList<>(Arrays.asList(1, 12, 5, 111, 200, 1000, 10));
        int budget = 50;

        //when
        Integer result = maximumToys.maximumToys(table, budget);
        //then
        assertEquals(4, result);

    }
}

