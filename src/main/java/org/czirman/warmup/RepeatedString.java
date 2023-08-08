package org.czirman.warmup;

public class RepeatedString {

    public static long repeatedString(String s, long n) {
        long divided = divideRest(s, n);
        long modulo = modulo(s, n);
        long countA = countA(s);
        long result = countA * divided;
        if (modulo != 0) {
            long rest = countA(s.substring(0, (int) modulo));
            result += rest;
        }

        return result;

    }

    private static long divideRest(String s, long n) {
        return n / s.length();
    }

    private static long modulo(String s, long n) {
        return n % s.length();
    }

    private static long countA(String s) {
        return s.chars()
                .mapToObj(c -> (char) c)
                .filter(arg -> arg == 'a').count();
    }
}
