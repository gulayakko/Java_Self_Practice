package day16_practice_tasks;

import java.util.*;

public class CommonElements {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(10, 8, 11, 20, 5, 0));

        System.out.println(set1);

        Set<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(30, 0, 20, 40, 50, 10, 60));

        Set<Integer> set3 = new HashSet<>();

        for (Integer each : set1){
            for (Integer i : set2){
                if (each == i){
                    set3.add(each);
                }
            }
        }

        System.out.println(set3);




    }



    }








