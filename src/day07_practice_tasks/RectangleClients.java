package day07_practice_tasks;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 25;
        rectangle1.lenght = 10;

        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle();

        rectangle2.lenght = 20;
        rectangle2.width = 5;

        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();

        System.out.println(rectangle2);
    }
}
