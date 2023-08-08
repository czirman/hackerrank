package org.czirman.hashmap;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckMagazineTest {


    CheckMagazine checkMagazine = new CheckMagazine();

    @Test
    public void checkMagazine() {
        //given YES
        //ArrayList<String> magazine = new ArrayList<>(Arrays.asList("give", "me", "one", "grand", "today", "night"));
        //ArrayList<String> note = new ArrayList<>(Arrays.asList("give", "one", "grand", "today"));
        // YES
        ArrayList<String> magazine = new ArrayList<>(Arrays.asList("apgo", "clm", "w", "lxkvg", "mwz", "elo", "bg", "elo", "lxkvg", "elo", "apgo", "apgo", "w", "elo", "bg"));
        ArrayList<String> note = new ArrayList<>(Arrays.asList("elo", "lxkvg", "bg", "mwz", "clm", "w"));

        //when
        checkMagazine.checkMagazine(magazine, note);
        // sprawdz  wyswietlanie


    }
}
