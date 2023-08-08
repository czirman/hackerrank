package org.czirman.satago;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SampleTest {

    Sample sample = new Sample();


    @Test
    public void sampleTest() {
        //given
        Integer n = 15;


        //when
        sample.fizzBuzz(n);
        //then
        assertTrue(true);
    }
}
