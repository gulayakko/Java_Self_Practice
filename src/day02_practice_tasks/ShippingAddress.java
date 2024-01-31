package day02_practice_tasks;

public class ShippingAddress {

    public static void main(String[] args) {

        String fullName;
        fullName = "Aaron Kissinger";

        int buildingNumber;
        buildingNumber = 13621;


        String streetName;
        streetName = "Legacy Circle";

        String city;
        city = "Fairfax";

        String state;
        state = "VA";

        int zipCode;
        zipCode = 22030;


        System.out.println();
        System.out.println(" Your shipping address is : ");
        System.out.println("                " + fullName );
        System.out.println("                " + buildingNumber + " " + streetName );
        System.out.println("                " + city + "," + state + " " + zipCode);
    }
}
