package org.czirman.string;

public class AlternatingCharacters {

    public static int alternatingCharacters(String s) {
        Character prev = s.charAt(0);
        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            Character curr = s.charAt(i);
            if (curr == prev){
                result ++;
            }
            prev = s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAAA"));
        System.out.println(alternatingCharacters("BBBBB"));
        System.out.println(alternatingCharacters("ABABABAB"));
        System.out.println(alternatingCharacters("BABABA"));
        System.out.println(alternatingCharacters("AAABBB"));
        //alternatingCharacters("AAABBB");
    }

}
