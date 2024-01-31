package day07_practice_tasks;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner scanCircle = new Scanner(System.in);

        int radius;
        System.out.println(" Enter the radius: ");
        radius = scanCircle.nextInt();
        double Pi = 3.14;


        scanCircle.close();


        System.out.println("The area of the Circle is: " + (Pi*radius) );
        System.out.println("The perimeter of the Circle is: " + 2*Pi*radius);

    }
}
