package day09_practice_tasks;

public class ArrayElements {

    public static void main(String[] args) {

        // 1.1 Create an array of integers with a length of 100.

        int[] numbers = new int[100];

        // 1.2 Assign values from 1 to 100 to the indexes of the array.

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;

        }

        // 1.3 Display the array elements in a single line separated by spaces.

        for (int number : numbers) {
            System.out.println(number + " ");
        }

        //1.4 Display the array elements in a single line in reversed order, separated by spaces.

        int[] reverseArray = new int[numbers.length];

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArray[j] = numbers[i];
            System.out.println(reverseArray[j]);

        }

        //1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 5 == 0) ;
            System.out.println(numbers[i]);


        }

    }

    }



