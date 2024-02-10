package day13_practice_tasks.animal_task.phone_tasks;

public class IPhone extends Phone{
    public IPhone(String model, String size, double price, String color) {
        super("Iphone", model, size, price, color);
    }

    public void faceTime(String phoneNumber) {
        System.out.println("Facetiming with the number " + phoneNumber);
    }

}
