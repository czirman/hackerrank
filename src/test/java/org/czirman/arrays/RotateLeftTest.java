package org.czirman.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateLeftTest {

    RotateLeft rotateLeft = new RotateLeft();

    @Test
    public void rotateLeft(){
        //given 12
        ArrayList<Integer> table = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int n = 2;

        //when
        List result = rotateLeft.rotLeft(table, n);
        //then
        assertEquals(2, result.get(4));
        assertEquals(3, result.get(0));

    }
}
