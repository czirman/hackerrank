package org.czirman.arrays;

import java.util.List;

public class HourglassSum {

    public static int hourglassSum(List<List<Integer>> arr) {
        Integer[][] tab = mapToArray(arr);
        int result = -999999999;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int cur = calGlassHour(tab, i, j);
                if (result < cur) {
                    result = cur;
                }
            }
        }
        return result;
    }

    public static int calGlassHour(Integer[][] tab, int x, int y) {
        int result = 0;
        for (int i = y; i < y + 3; i++) {
            result += tab[x][i];
            result += tab[x + 2][i];
        }
        result += tab[x + 1][y + 1];
        return result;
    }

    private static Integer[][] mapToArray(List<List<Integer>> arr) {
        return arr.stream()
                .map(l -> l.stream().toArray(Integer[]::new))
                .toArray(Integer[][]::new);
    }
}
