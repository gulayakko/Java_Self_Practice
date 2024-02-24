package day17_practice_tasks;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {


    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> uniqueCha = new HashMap<>();

        for (char each : str.toCharArray()){
            if (map.containsKey(each)){
                map.put(each, map.get(each) +1);
            }else {
                map.put(each,1);
            }
        }

        for (Map.Entry<Character,Integer> chEntry : map.entrySet()){
            if (chEntry.getValue() == 1){
                uniqueCha.put(chEntry.getKey(), chEntry.getValue());
            }
        }

        System.out.println(uniqueCha);




    }
}
