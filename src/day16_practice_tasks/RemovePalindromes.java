package day16_practice_tasks;

import java.util.*;

public class RemovePalindromes {

    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();

        queue.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"));

        System.out.println(queue);

        queue.remove();
        System.out.println(queue);






    }
}