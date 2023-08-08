package org.czirman.satago.exam;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImportantChallengeTest {

    ImportantChallenge importantChallengeTest = new ImportantChallenge();

    @Test
    public void base1() {
        //given
        List enter = Arrays.asList(1.01f, 1.99f, 2.5f, 1.5f, 1.01f);
        //when
        int result = importantChallengeTest.efficientJanitor(enter);
        //then
        assertEquals(3, result);
    }

    @Test
    public void base2() {
        //given
        List enter = Arrays.asList(3f, 1.01f, 1.01f, 1.01f, 1.4f, 2.4f);
        //when
        int result = importantChallengeTest.efficientJanitor(enter);
        //then
        assertEquals(4, result);
    }

    @Test
    public void granicMax() {
        //given
        List enter = Arrays.asList(3f, 3f, 3f, 3f, 3f,3f);
        //when
        int result = importantChallengeTest.efficientJanitor(enter);
        //then
        assertEquals(6, result);
    }

    @Test
    public void granicMin() {
        //given
        List enter = Arrays.asList(1f, 1f, 1f, 1f, 1f,1f,1f);
        //when
        int result = importantChallengeTest.efficientJanitor(enter);
        //then
        assertEquals(4, result);
    }
}
//https://www.hackerrank.com/interview/preparation-kits?h_l=domains&h_r=hrw&utm_source=hrwCandidateFeedback