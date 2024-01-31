package day07_practice_tasks;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner scanGrade = new Scanner(System.in);

        char grade, grade1, grade2, grade3;
        int score ;

        System.out.println("Enter your score: ");
        score = scanGrade.nextInt();

        scanGrade.close();

        if (score <= 60 ){
            grade = 'D';
            System.out.println("Your grade is " + grade);
        } else if (score <= 75) {
            grade1 = 'C';
            System.out.println("Your grade is " + grade1);
        } else if (score<=85) {
            grade2 = 'B';
            System.out.println("Your grade is " + grade2);;

        } else if (score <= 100) {
            grade3 = 'A';
            System.out.println("Your grade is " + grade3);

        }else {
            System.out.println("Invalid Score ");
        }
    }
}
