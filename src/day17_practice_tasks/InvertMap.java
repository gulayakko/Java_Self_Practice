package day17_practice_tasks;

import java.util.HashMap;
import java.util.Map;

public class InvertMap {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1,"a");
        map.put(2, "b");
        map.put(3,"c");

        System.out.println(map);


        Map<String, Integer> invertMAp = new HashMap<>();

        for (Map.Entry<Integer, String> stringEntry: map.entrySet()){
            invertMAp.put(stringEntry.getValue(), stringEntry.getKey());
        }

        System.out.println(invertMAp);



    }

}
