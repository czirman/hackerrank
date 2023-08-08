package org.czirman.warmup;
public class CountingValley {

    private int altitude=0;

    public int countingValleys(int steps, String path) {
        int result=0;
        char[] ar = path.toCharArray();
        for (char cur : ar){
            changeAltitude(cur);
            if (cur == 'U' && altitude == 0){
                result++;
            }
        }
        return result;
    }

    private void changeAltitude(char s){
        if (s == 'U')
            altitude++;
        else
            altitude --;
    }
}
/*Stream<Character> characterStream = path.chars()
                .mapToObj(c -> (char) c);*/