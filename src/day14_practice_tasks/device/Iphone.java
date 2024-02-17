package day14_practice_tasks.device;

public class Iphone extends Phone implements Downloadable, AppleApps{

    public Iphone(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" is downloading apps from "+AppStoreNAme);
    }
    }

