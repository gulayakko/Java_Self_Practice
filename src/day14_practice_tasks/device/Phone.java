package day14_practice_tasks.device;

public abstract class Phone extends Device {

    public Phone(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    public void call(long phoneNumber){
        System.out.println(getBrand() + " " + getModel() +" is calling "+ phoneNumber );
    }

    public void text(long phoneNumber){
        System.out.println(getBrand() + " " + getModel() + " is texting " + phoneNumber);
    }


}
