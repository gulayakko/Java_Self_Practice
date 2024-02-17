package day14_practice_tasks.device;

public class Samsung extends Phone implements Downloadable,AndroidApp {
    public Samsung(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" is downloading apps from "+AppstoreName);
    }
    }

