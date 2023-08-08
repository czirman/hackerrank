package org.czirman.satago.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ImportantChallenge {

    public static int efficientJanitor(List<Float> weight) {
        List<Float> dynamic = new ArrayList(weight);
        int result = 0;
        int iteration =0;
        Collections.sort(dynamic);
        while (!dynamic.isEmpty() && iteration<weight.size()) {
            Float ele = dynamic.get(0);
            List<Float> streamList = new ArrayList(dynamic);
            streamList.remove(0);
            Optional<Float> str = streamList.stream().filter(arg -> arg <= 3 - ele).max(Float::compareTo);

            if (!str.isEmpty()) {
                result++;
                dynamic.remove(str.get());
                dynamic.remove(ele);
            }

            iteration++;
        }
        return result+dynamic.size();

    }

    //https://www.hackerrank.com/interview/preparation-kits?h_l=domains&h_r=hrw&utm_source=hrwCandidateFeedback

    private static boolean check(float arg){
        if (arg<=3){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {

    }
}
