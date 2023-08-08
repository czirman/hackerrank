package org.czirman.miscellaneous;

import java.util.stream.Collector;
import java.util.stream.Stream;

public class FlippingBits {

    public static long flippingBits(long n) {

        String binaryStr = Long.toBinaryString(n);
        if  (binaryStr.length()<32) {
            String left =fill(32 -binaryStr.length());
            binaryStr = left +binaryStr;
        }
        Stream<Character> str = binaryStr.chars()
                .mapToObj(c -> (char) c);
        String resultStr = str.map(arg -> arg == '0' ? '1' : '0').collect(Collector.of(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append,
                StringBuilder::toString));

        return Long.parseLong(resultStr,2);
    }


    private static String fill(int count){
            StringBuilder str = new StringBuilder();
            //String filled = StringUtils.repeat("*", 10); REMEMBER
            for (int i=1; i<=count;i++){
                str.append("0");
            }
        return str.toString();
    }

    public static void main(String[] args) {
        flippingBits(1);
    }

}
