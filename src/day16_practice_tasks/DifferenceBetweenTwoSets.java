package day16_practice_tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DifferenceBetweenTwoSets {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(1, 2, 3, 5));

        Set<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(2, 3, 4));

        Set<Integer> result = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);

        result.removeAll(set2);
        System.out.println(result);

    }


}
