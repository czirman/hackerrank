package org.czirman.warmup;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PileOfSocksTest {
    PileOfSocks pileOfSocks = new PileOfSocks();

    @Test
    public void sockMerchantTest() {
        //given
        Integer ar[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        //when
        int result = pileOfSocks.sockMerchant(9, Arrays.asList(ar));

        //then
        assertEquals(result, 3);

    }
}
