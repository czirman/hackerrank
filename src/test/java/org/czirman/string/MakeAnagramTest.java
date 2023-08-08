package org.czirman.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeAnagramTest {

    MakeAnagram makeAnagram = new MakeAnagram();

    @Test
    public void maximumToys() {
        //given
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        //String a = "cde";
        //String b = "abc";
        //when
        Integer result = makeAnagram.makeAnagram(a, b);
        //then
        assertEquals(30, result);

    }
}

