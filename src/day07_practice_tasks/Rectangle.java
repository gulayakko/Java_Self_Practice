package day07_practice_tasks;

public class Rectangle {

    public double width;
    public double lenght;

    public void calculateArea(){
        System.out.println("Area of rectangle: " + (lenght*width));
    }

    public void calculatePerimeter(){
        System.out.println("Perimeter of Rectangle: " + 2*(lenght+width));
    }


    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lenght=" + lenght +
                '}';
    }
}
