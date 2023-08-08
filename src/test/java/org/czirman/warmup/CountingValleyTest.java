package org.czirman.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingValleyTest {

    CountingValley countingValley = new CountingValley();

    @Test
    public void countingValleysTest(){
        //given 12
        int steeps = 12;
        String mark = "DDUUDDUDUUUD";

        //when
        int result = countingValley.countingValleys(steeps, mark);
        //then
        assertEquals(2, result);

    }
}
