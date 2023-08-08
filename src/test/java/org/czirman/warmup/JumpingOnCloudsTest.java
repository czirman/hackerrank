package org.czirman.warmup;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JumpingOnCloudsTest {

    JumpingOnClouds jumpingOnClouds = new JumpingOnClouds();
    @Test
    public void jumpingOnCloudsTest(){
        //given
        Integer tab[] = {0, 0, 1, 0, 0, 1, 0};
        //Integer tab[] = { 0, 0, 0, 1, 0, 0};// expected =3


        List list = Arrays.asList(tab);

        //when
        int result = jumpingOnClouds.jumpingOnClouds(list);

        //then
        assertEquals(4, result);
    }
}
