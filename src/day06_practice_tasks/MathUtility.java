package day06_practice_tasks;

public class MathUtility {

    public static void main(String[] args) {

          int result = calculate(10,'+',20);
         System.out.println(result);
        // double result = calculate(2.5, '*', 3.0);
        // System.out.println(result);

       // int num = square(8);
        // System.out.println(num);

        // double num = square(1.5);
        // System.out.println(num);

         // int num = cube(3);
        // System.out.println(num);
        double num = cube(2.5);
        System.out.println(num);






    }

    public static int calculate(int num1, char operator,int num2){
        int result = switch (operator){
            case '-' -> num1-num2;
            case '+'-> num1+num2;
            case '*'-> num1*num2;
            case '/'-> num1/num2;
            default -> 0;
        };
        return result;
    }

    public static double calculate(double num1, char operator,double num2){
        double resut = switch (operator){
            case '-' -> num1 - num2;
            case '+'-> num1 + num2;
            case '*'-> num1 * num2;
            case '/'-> num1 / num2;
            default -> 0;
        };
        return resut;

    }
    public static int square(int num) {
        return  num* num;
    }
    public static double square(double num){
        return num *num;
    }
    public static int cube(int num) {
        return square(num) * num;

    }
    public static double cube(double num) {
        return square(num) * num;

    }
}
