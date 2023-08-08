package org.czirman.hashmap;

import java.util.List;

public class CheckMagazine {

    public static void checkMagazine(List<String> magazine, List<String> note) {
        int initialSizeMagazine = magazine.size();
        int initialSizeNote = note.size();
        for (String element : note) {
            magazine.remove(element);
        }
        boolean isPrint = magazine.size() == initialSizeMagazine - initialSizeNote;
        print(isPrint);
    }

    private static void print(boolean isMagazine) {
        String out = isMagazine ? "Yes" : "No"; // REMAMBER ale jak dziala
        System.out.println(out);
    }

}
