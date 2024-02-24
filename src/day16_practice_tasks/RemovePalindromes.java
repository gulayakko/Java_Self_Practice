package day16_practice_tasks;

import java.io.FilterOutputStream;
import java.util.*;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"));

        System.out.println(list);

        String reverseList = new StringBuilder(list.toString()).reverse().toString();

        Iterator<String > it = list.iterator();
        while (it.hasNext()){
            String palin = it.next();
            if (reverseList.contains(palin)){
                it.remove();
            }
        }

        System.out.println(list);





    }



    }
