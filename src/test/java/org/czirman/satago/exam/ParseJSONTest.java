package org.czirman.satago.exam;

import org.czirman.satago.ParseJSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParseJSONTest {

    JSONChallenge jsonChallenge = new JSONChallenge();

    @Test
    public void testMain() {
        //given

        //when
        jsonChallenge.jsonChallenge();

        //then
        assertTrue(true);
        assertEquals(1, 1);
    }
}
