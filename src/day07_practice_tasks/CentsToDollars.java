package day07_practice_tasks;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {


        Scanner m = new Scanner(System.in);

        System.out.println("Enter the cents: ");

        int amountOfCents = m.nextInt();
        int n = amountOfCents /100;
        int c = amountOfCents - n *100;

        m.close();
        System.out.println(amountOfCents + " cents is equal to " + n + " dollars and "

        + c + " cents" );



    }
}
