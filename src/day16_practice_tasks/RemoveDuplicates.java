package day16_practice_tasks;

import java.util.*;

import static java.util.Collections.sort;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(
                20, 15, 10, 20, 30, 10, 20, 15, 0
        ));

        removeDuplicates(list1);

        Set<Integer> list2 = new TreeSet<>(list1);
        System.out.println(list2);


    }

    public static void removeDuplicates (List<Integer> list1) {

        List<Integer> uniquelist = new ArrayList<>();

        for (Integer each : list1){
            if (uniquelist.contains(each)){
                continue;
            }
            uniquelist.add(each);
        }


        list1.clear();
        list1.addAll(uniquelist);


    }




    }







