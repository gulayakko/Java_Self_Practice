package day17_practice_tasks;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {

    public static void main(String[] args) {

        Map<Character,Integer> map1 = new HashMap<>();
        map1.put('A', 10);
        map1.put('B', 20);

        Map<Character,Integer> map2 = new HashMap<>();
        map2.put('B', 30);
        map2.put('C', 40);


        System.out.println(map1);
        System.out.println(map2);


        for (Map.Entry<Character, Integer> chEntry:map2.entrySet()){
            Character key = chEntry.getKey();
            Integer value = chEntry.getValue();

            if (map1.containsKey(key)){
                map1.put(key, map1.get(key) + value);
            }else {
                map1.put(key, value);
            }
        }

        System.out.println(map1);

    }
}
