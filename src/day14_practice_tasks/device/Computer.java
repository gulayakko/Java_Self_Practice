package day14_practice_tasks.device;

public abstract class Computer extends Device {

    public Computer(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}
