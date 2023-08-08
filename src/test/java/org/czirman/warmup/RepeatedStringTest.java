package org.czirman.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedStringTest {
    RepeatedString repeatedString = new RepeatedString();

    @Test
    public void sockMerchantTest() {

        //given
        //String s = "aba";
        //long n = 10;

        String s = "a";
        long n = 1000000000000l;

        //when
        long result = repeatedString.repeatedString(s, n);

        //then
        assertEquals(1000000000000l,result);

    }
}
