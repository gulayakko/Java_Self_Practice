package day14_practice_tasks.device;

public class DeviceShop {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("Apple", "15 Pro","Titanuim Black", "15.5", 1000);
        System.out.println(iphone1);
        iphone1.call(01012345);
        iphone1.text(01012345);
        iphone1.downloadApp();
        iphone1.turnOn();
        iphone1.turnOff();

        Samsung samsung1 = new Samsung("Samsung", "FlipFlop","Purple", "14.5", 900);
        System.out.println(samsung1);
        samsung1.call(01012345);
        samsung1.text(01012345);
        samsung1.downloadApp();
        samsung1.turnOn();
        samsung1.turnOff();


        Google google1 = new Google("Google", "G6", "White", "13.3",990);
        System.out.println(google1);
        google1.call(01012345);
        google1.text(01012345);
        google1.downloadApp();
        google1.turnOn();
        google1.turnOff();


        Desktop desktop1 = new Desktop("HP", "HP 1", "Black", "Medium", 500);
        System.out.println(desktop1);
        desktop1.turnOff();
        desktop1.turnOn();

        Laptop laptop1 = new Laptop("Apple", "MAcBook", "Gray", "Medium", 800);
        System.out.println(laptop1);
        laptop1.turnOff();
        laptop1.turnOn();

    }
}
